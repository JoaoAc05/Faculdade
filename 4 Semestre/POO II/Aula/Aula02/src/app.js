const express = require('express');
const app = express();

//Rotas
const index = require('./routes/index');
const pessoaRoute = require('./routes/PessoaRouter');

app.use(express.json())
app.use(express.urlencoded({ extended: true}))

app.use('/', index);
app.use('/pessoa', pessoaRoute);

module.exports = app;