import express from "express";
import auth from "../middleware/auth.js";
import { userController } from "../src/Controller/UserController.js";

const UserRouter = express.Router();
//observe que um é maiusculo outro minusculo
const UserController = new userController();


UserRouter.get('/', auth, UserController.getAll);
UserRouter.post('/', UserController.cadastro);
UserRouter.put('/', UserController.alterar);

// get para puxar dados / se eu passo um id, então é um get específico
//UserRouter.get('/:id', UserController.getId);

UserRouter.delete('/:id', UserController.deletar);
UserRouter.post('/login', UserController.login);
UserRouter.get('/perfil', UserController.perfil);

/* ----------------------- VIEWS -----------------------*/
UserRouter.get('/Exibir', UserController.exibirUsuarios);

// index page
/*UserRouter.get('/Exibir', function(req, res) {
    res.render('../Views/index');
});*/

export { UserRouter };
