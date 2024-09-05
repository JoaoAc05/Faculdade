import express from "express";
import { userController } from "../src/Controller/UserController.js";

const UserRouter = express.Router();
const UserController = new userController();

UserRouter.get('/', UserController.getAll);

export { UserRouter };