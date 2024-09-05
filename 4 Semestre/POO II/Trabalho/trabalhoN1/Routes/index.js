import express from "express";
import { UserRouter } from "./UserRouter.js";
import { ProdutoRouter } from "./ProdutoRouter.js";

const router = express.Router();
router.use("/user", UserRouter);
router.use("/produto", ProdutoRouter);

export default router;