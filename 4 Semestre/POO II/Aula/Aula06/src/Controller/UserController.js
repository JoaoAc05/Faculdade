import jwt from 'jsonwebtoken';
import { prisma } from "../prisma.js";

class userController {
    constructor() {
        this.login = this.login.bind(this);
    };
    async getAll(req, res, next) { 
        try {
            const users = await prisma.Usuario.findMany()
            res.status(200).json(users);
        } catch (e) {
            res.status(500).json({error: 'Erro ak retornar usuário'});
        }
    }

    async cadastro(req, res, next){
        try {
            const createUser = await prisma.Usuario.create({ data: req.body })
            res.status(200).json({success: 'Usuário criado com sucesso.'});
        } catch (e) {
            console.log(e)
            res.status(500).json({error: 'Erro criar usuários.'}); 
        }
    }

    async alterar(req, res, next){
        const { // aqui importamos o campo id do corpo da nossa requisição
            id
        } = req.body;

        try {
            const updateUsers = await prisma.Usuario.updateMany({
                where: {
                    id: id,
                },
                data: req.body // passamos o corpo da requisição
            })
            res.status(200).json({success: 'Usuário alterado com sucesso.'});
        } catch (e) {
            res.status(500).json({error: 'Erro alterar usuários.'});
        }
    }

    async getId(req, res, next){
        const {
            id
        } = req.params;

        try {
            const user = await prisma.Usuario.findUnique({
                where: {
                    id: parseInt(id),
                },
            })
            res.status(200).json(user);
        } catch (e) {
            res.status(500).json({error: 'Erro ao retornar usuário.'}); 
        }
    }

    async deletar(req, res, next){
        const { id } = req.params;
        try {
            const deleteUsers = await prisma.Usuario.deleteMany({
                where: {
                    id: parseInt(id)
                },
            })
            res.status(200).json({success: 'Usuário deletado com sucesso.'});
        } catch (e) {
            res.status(500).json({error: 'Erro deletar usuário.'}); 
        }
    }

    async getPorEmail(email, pass) {
        const user = prisma.Usuario.findUnique({
            where: {
                email: email,
                pass: pass
            }
        })
        return user
    }

    async perfil(req, res, next) {
        try {
            const token = req.headers["authorization"];
            const chavePrivada = "MeuTeste";

            jwt.verify(token, chavePrivada, (err, userInfo) => {
                if(err) {
                    res.status(403).end();
                    return;
                }

                res.status(200).json(userInfo);
            });
        } catch (e) {
            res.status(500).json({error: 'Erro ao trazer o perfil'});
        }
    }

    async login(req, res, next){
        const{
            email, pass
        } = req.body;

        try{
            const users = await this.getPorEmail(email, pass);
            const chavePrivada = "MeuTeste";

            if(users){
                jwt.sign(users, chavePrivada, (err, token) => {
                    if (err) {
                        res
                            .status(500)
                            .json({mensagem: "Erro ao gerar o JWT"});

                            return;
                    }
                    res.status(200).json({token});
                });
            } else {
                res.status(401).json({error: 'Usuário não encontrado'});
            }
        } catch (e) {
            res.status(500).json({error: 'Erro ao gerar token.'});
            console.log(e);
        }
    }
}
export { userController };