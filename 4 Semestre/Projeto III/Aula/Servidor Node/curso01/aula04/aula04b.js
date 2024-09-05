//https://www.youtube.com/watch?v=6xvH6GWOQ6U&list=PLx4x_zx8csUjFC41ev2qX5dnr-0ThpoXE&index=6
const express = require('express');
const app = express();

const porta = process.env.PORT || 3000;
app.get('/', (requisicao, resposta) => {
  resposta.send('Teste Express')
})
app.get('/projeto', (reqisicao, resposta) => {
  resposta.send('Projeto III')
});

app.listen(porta || 3000, () => {
  console.log(`Servidor rodando na porta ${porta}`);
});