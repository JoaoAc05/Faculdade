//https://www.youtube.com/watch?v=UrBxzJ80Evs

const http = require('http');

http.createServer((requisicao, resposta) => {
    resposta.writeHead(200, { 
        'Content-Type' : 'text/plain'
    });
    resposta.write('Projeto III\nIniciando os testes');
    resposta.end();
}).listen(1337);