const express = require('express');
const rotas = express.Router();

let info =[
    {'nome': 'Projeto III', 'info': 'Informação projeto III'},
    {'nome': 'Projeto II', 'info': 'Informação projeto II'},
    {'nome': 'Projeto I', 'info': 'Informação projeto I'}
]

rotas.get('/', (requisicao, resposta) => {
    resposta.json({ola: 'Teste'});
});

rotas.get('/:nomeBusca', (requisicao, resposta) => {
    const parametroBusca = requisicao.params.nomeBusca;
    const validacaoParametro = info.find(i => i.nome == parametroBusca);
    if(!validacaoParametro) {
        resposta.status(404).json(
            {erro: 'Destino não encontrado', nomePesquisado : parametroBusca}
        );   
    } else {
        resposta.status(200).json(validacaoParametro.nome + '  ' + validacaoParametro.info);
    }

})

module.exports = rotas