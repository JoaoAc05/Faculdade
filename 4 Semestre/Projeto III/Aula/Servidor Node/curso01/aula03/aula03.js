//https://www.youtube.com/watch?v=Znq_YroGsjg&list=PLx4x_zx8csUjFC41ev2qX5dnr-0ThpoXE&index=3

const http = require('http');

// Configurações do Servidor HTTP
const porta = 3000;
const host = '127.0.0.1';

const servidor = http.createServer((requisicao, resposta) => {
    resposta.writeHead(200, { 
        'Content-Type' : 'text/html'
    });

    if ( requisicao.url== '/'){
        resposta.write('<h1>Seja bem vindo</h1>');
    } else if (requisicao.url=='/projeto') {
        resposta.write('<h1>Projeto III</h1>');
    } else if (requisicao.url=='/camera') {
        resposta.write('<h1>Olha a foto!</h1>');
    }
    // resposta.write('Projeto III\nIniciando os testes');
    resposta.end();
}).listen(porta,host, () => {console.log('Servidor ativo');});
