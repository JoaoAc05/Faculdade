import jwt from 'jsonwebtoken';
import { prisma } from "../prisma.js";

class produtoController {

    async getAll(req, res, next){
        const {
            limit, page, nome, descricao
        } = req.query;

        try {
            const [produtos, count] = await prisma.$transaction([
                prisma.produtos.findMany({
                    where: {
                        status: 0,
                        nome: {
                            contains: nome
                        },
                        descricao: {
                            contains: descricao
                        }
                    },
                    take: parseInt(limit),
                    skip: (parseInt(page) -1) * limit
                }),
                prisma.produtos.count({
                    where: {
                        status: 0
                    },
                })
            ])
            const pages = String(count / limit).split('.')
            res.status(200).json({
                data: produtos,
                limit: limit,
                page: page,
                pages: pages.length > 1 ? Number(parseInt(pages[0]) + 1 ): Number(pages[0]),
                total: count
            });
        } catch (e) {
            res.status(500).json({error: 'Erro ao retornar produtos.' + e.message}); 
        }
    }

    async cadastro(req, res, next){
        try {
            const objCriado = await prisma.produtos.create({ data: req.body })
            res.status(201).json(objCriado);
        } catch (e) {
            res.status(500).json({error: 'Erro criar produtos.'}); 
        }
    }

    async alterar(req, res, next){
        const { // aqui importamos o campo id do corpo da nossa requisição
            id
        } = req.body;

        try {
            const objCriado = await prisma.produtos.updateMany({
                where: {
                    id: id,
                },
                data: req.body // passamos o corpo da requisição
            })
            res.status(201).json(objCriado);
        } catch (e) {
            res.status(500).json({error: 'Erro alterar produto.'});
        }
    }

    async getId(req, res, next){
        const {
            id
        } = req.params;

        try {
            const objeto = await prisma.produtos.findUnique({
                where: {
                    id: id,
                },
            })
            res.status(200).json(objeto);
        } catch (e) {
            res.status(500).json({error: 'getId - Erro ao retornar produto.'}); 
        }
    }

    async deletar(req, res, next){
        const { id } = req.params;
        try {
            const objCriado = await prisma.produtos.deleteMany({
                where: {
                    id: parseInt(id)
                },
            })
            res.status(200).json({success: 'Produto deletado com sucesso.'});
        } catch (e) {
            res.status(500).json({error: 'Erro deletar produto.'}); 
        }
    }
}

export { produtoController };
