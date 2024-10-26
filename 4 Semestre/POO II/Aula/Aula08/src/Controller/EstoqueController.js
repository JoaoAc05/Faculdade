import jwt from 'jsonwebtoken';
import { prisma } from "../prisma.js";

class estoqueController {

    constructor(){
        this.alterarAdicao = this.alterarAdicao.bind(this),
        this.alterarSubtracao = this.alterarSubtracao.bind(this)
    }

    async getAll(req, res, next){
        const {
            limit, page, id_prod
        } = req.query;

        try {
            const [estoque, count] = await prisma.$transaction([
                prisma.estoque.findMany({
                    where: {
                        status: 0,
                        id_produto: {
                            contains: id_prod
                        },
                    },
                    take: parseInt(limit),
                    skip: (parseInt(page) -1) * limit
                }),
                prisma.estoque.count({
                    where: {
                        status: 0
                    },
                })
            ])
            const pages = String(count / limit).split('.')
            res.status(200).json({
                data: estoque,
                limit: limit,
                page: page,
                pages: pages.length > 1 ? Number(parseInt(pages[0]) + 1 ): Number(pages[0]),
                total: count
            });
        } catch (e) {
            res.status(500).json({error: 'Erro ao retornar estoque.' + e.message}); 
        }
    }

    async cadastro(req, res, next){
        try {
            const objCriado = await prisma.estoque.create({ data: req.body })
            res.status(201).json(objCriado);
        } catch (e) {
            res.status(500).json({error: 'Erro criar estoque. ' + e.message}); 
        }
    }

    async alterarAdicao(req, res, next){
        const { // aqui importamos o campo id do corpo da nossa requisição
            id_produto
        } = req.body; 
        
        const quantidade = await this.getQuantidade(id_produto);
        req.body.quantidade = parseInt(req.body.quantidade) + parseInt(quantidade.quantidade)
        
        try {
            const objAlterado = await prisma.estoque.updateMany({
                where: {
                    id_produto: id_produto,
                },
                data: req.body // passamos o corpo da requisição
            })
            res.status(201).json(objAlterado);
        } catch (e) {
            res.status(500).json({error: 'Erro alterar estoque.'});
        }
    }
    async alterarSubtracao(req, res, next){
        const { // aqui importamos o campo id do corpo da nossa requisição
            id_produto
        } = req.body; 
        
        const quantidade = await this.getQuantidade(id_produto);
        req.body.quantidade = parseInt(quantidade.quantidade)- parseInt(req.body.quantidade) 
        
        try {
            const objAlterado = await prisma.estoque.updateMany({
                where: {
                    id_produto: id_produto,
                },
                data: req.body // passamos o corpo da requisição
            })
            res.status(201).json(objAlterado);
        } catch (e) {
            res.status(500).json({error: 'Erro alterar estoque.'});
        }
    }

    async getId(req, res, next){
        const {
            id_produto
        } = req.params;

        try {
            const objeto = await prisma.estoque.findFirst({
                where: {
                    id_produto: parseInt(id_produto),
                },
            })
            res.status(200).json(objeto);
        } catch (e) {
            res.status(500).json({error: 'getId - Erro ao retornar estoque.'}); 
        }
    }

    async deletar(req, res, next){
        const { id_produto } = req.params;
        try {
            const objCriado = await prisma.estoque.updateMany({
                where: {
                    id_produto: id_produto
                },
                data: {
                    status: 1
                }
            })
            res.status(200).json({success: 'Estoque deletado com sucesso.'});
        } catch (e) {
            res.status(500).json({error: 'Erro deletar estoque.'}); 
        }
    }

    async getQuantidade(id_produto){
        const estoque = prisma.estoque.findFirst({
            where: {
                id_produto: parseInt(id_produto)
            }
        })
        return estoque
    }
}

export { estoqueController };
