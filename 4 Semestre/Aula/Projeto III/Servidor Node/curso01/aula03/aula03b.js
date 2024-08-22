//https://www.youtube.com/watch?v=Znq_YroGsjg&list=PLx4x_zx8csUjFC41ev2qX5dnr-0ThpoXE&index=3

const http = require('http');
const url = require('url');

// Configurações do Servidor HTTP
const porta = 3000;
const host = '127.0.0.1';

const servidor = http.createServer((requisicao, resposta) => {
    resposta.writeHead(200, { 
        'Content-Type' : 'text/html'
    });
    resposta.write('<h1> ' + requisicao.url + ' </h1>');
    const parametro = url.parse(requisicao.url, true).query;
    resposta.write('<br/> ' + parametro.nome);
    resposta.write('<br/> ' + parametro.projeto);
    
    resposta.end();
}).listen(porta,host, () => {console.log('Servidor ativo');});

// http://localhost:3000/?nome=Joao&projeto=III