import express from "express";
import index from "../Routes/index.js";
const app = express();

app.use(express.json());
app.set('view engine', 'ejs');

//Rotas
app.use('/', index);

export { app };

