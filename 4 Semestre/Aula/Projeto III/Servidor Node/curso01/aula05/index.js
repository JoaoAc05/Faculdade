const express = require('express');
const rotas = require('./rotas/rotas.js');
const portas = process.env.PORT || 3000;

const app = express();

app.use('/', rotas)

app.get('*', (requisicao, resposta) => {
    resposta.send('Eita! Caiu na rota padrão.\nBoa sorte!')
})

app.listen(portas, () => {
    console.log(`Servidor rodando na porta ${portas}`);
})