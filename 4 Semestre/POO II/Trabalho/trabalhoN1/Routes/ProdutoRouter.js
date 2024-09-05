import express from "express";
import { produtoController } from "../src/Controller/ProdutoController.js";

const ProdutoRouter = express.Router();
const ProdutoController = new produtoController();

//Rotas Usuário
ProdutoRouter.get('/', ProdutoController.getAll); // Select *
ProdutoRouter.get('/:id', ProdutoController.getId); //Select * where id =
ProdutoRouter.post('/', ProdutoController.cadastro); // Insert
ProdutoRouter.put('/', ProdutoController.alterar); // Alter
ProdutoRouter.delete('/:id', ProdutoController.deletar); //Delete * where id =

export { ProdutoRouter }; 