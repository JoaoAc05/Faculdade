import { prisma } from "../prisma.js";

class userController {
    async getAll(req, res, next) { 
        try {
            const users = await prisma.Usuario.findMany()
            res.status(200).json(users);
        } catch (e) {
            res.status(500).json({error: 'Erro ak retornar usuário'});
        }
    }
}
export { userController };