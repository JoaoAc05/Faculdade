import express from "express";
import auth from "../middleware/auth.js";
import { estoqueController } from "../src/Controller/EstoqueController.js";

const EstoqueRouter = express.Router();
const EstoqueController = new estoqueController();

EstoqueRouter.get('/', EstoqueController.getAll);
EstoqueRouter.post('/', EstoqueController.cadastro);
EstoqueRouter.put('/soma', EstoqueController.alterarAdicao);
EstoqueRouter.put('/subtracao', EstoqueController.alterarSubtracao);
EstoqueRouter.get('/:id_produto', EstoqueController.getId);
EstoqueRouter.delete('/:id_produto', EstoqueController.deletar);

export { EstoqueRouter };
