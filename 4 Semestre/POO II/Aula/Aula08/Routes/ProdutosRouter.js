import express from "express";
import auth from "../middleware/auth.js";
import { produtoController } from "../src/Controller/ProdutosController.js";

const ProdutoRouter = express.Router();
const ProdutoController = new produtoController();

ProdutoRouter.get('/', ProdutoController.getAll);
ProdutoRouter.post('/', ProdutoController.cadastro);
ProdutoRouter.put('/', ProdutoController.alterar);
ProdutoRouter.get('/:id', ProdutoController.getId);
ProdutoRouter.delete('/:id', ProdutoController.deletar);

export { ProdutoRouter };
