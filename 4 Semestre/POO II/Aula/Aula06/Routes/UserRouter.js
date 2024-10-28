import express from "express";
import auth from "../middleware/auth.js";
import { userController } from "../src/Controller/UserController.js";

const UserRouter = express.Router();
const UserController = new userController();

UserRouter.get('/', auth, UserController.getAll);
UserRouter.post('/', UserController.cadastro);
UserRouter.put('/', UserController.alterar);
// UserRouter.get('/:id', UserController.getId);
UserRouter.delete('/:id', UserController.deletar);

UserRouter.post('/login', UserController.login)
UserRouter.get('/perfil', UserController.perfil)

export { UserRouter };