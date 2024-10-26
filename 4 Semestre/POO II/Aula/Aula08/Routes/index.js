import express from "express";
import { EstoqueRouter } from "./EstoqueRouter.js";
import { ProdutoRouter } from "./ProdutosRouter.js";
import { UserRouter } from "./UserRouter.js";

const router = express.Router();
router.use("/user", UserRouter);
router.use("/produtos", ProdutoRouter);
router.use("/estoque", EstoqueRouter);

export default router;
