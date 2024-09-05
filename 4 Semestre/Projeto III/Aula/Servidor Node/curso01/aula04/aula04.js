//https://www.youtube.com/watch?v=6xvH6GWOQ6U&list=PLx4x_zx8csUjFC41ev2qX5dnr-0ThpoXE&index=60
const http=require('http');
const porta = process.env.PORT;
const servidor = http.createServer((requisicao, resposta) => {
    resposta.writeHead(200, 'Content-Type', 'application/plain');
    resposta.end('Teste ');
});

servidor.listen(porta || 3000, () => {
  console.log(`Servidor rodando na porta ${porta}`);
});