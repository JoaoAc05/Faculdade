import { prisma } from "../prisma.js";

class produtoController {
    async getAll(req, res, next) { 
        try {
            const produtos = await prisma.Produto.findMany()
            res.status(200).json(produtos);
        } catch (e) {
            res.status(500).json({error: 'Erro ao retornar produto'});
            console.log(e)
        }
    };

    async getId(req, res, next) {
        const {
            id
        } = req.params;
        try {
            const produto = await prisma.Produto.findUnique({
                where: {
                    id: Number(id),
                },
            })
            res.status(200).json(produto)
        } catch (e) {
            res.status(500).json({error:'Erro ao retornar produto.'})
        }
    };

    async cadastro(req, res, next) {
        try{
            const createProduto = await prisma.Produto.create({ data: req.body })
            res.status(200).json({success: 'Produto criado com sucesso.'});
        } catch (e) {
            res.status(500).json({error: console.log(e) + 'Erro criar Produto.'});
        }
    };

    async alterar(req, res, next){
        const { id } = req.body;

        try { 
            const updateProduto = await prisma.Produto.updateMany({
                where: {
                    id: id,
                },
                data: req.body
            })
            res.status(200).json({sucesso: 'Produto alterado com sucesso.'});
        } catch (e) {
            res.status(500).json({error: 'Erro ao alterar produto'});
        }
    };

    async deletar(req, res, next) {
        const { id } = req.params;
        try {
            const deleteProdutos = await prisma.Produto.deleteMany({
                where: { id: Number(id), },
            })
            res.status(200).json({sucess: 'Produto deletado com sucesso.'})
        } catch (e) {
            res.status(500).json({error: 'Erro ao deletar produto.'})
        }
    };
};
export { produtoController };