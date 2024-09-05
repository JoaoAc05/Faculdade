exports.get = (requisicao, resposta, next) => {
    resposta.status(200).send('Requisição recebida com sucesso!');
}

exports.getById = (requisicao, resposta, next) => {
    resposta.status(200).send('Requisição recebida com sucesso!');
};

exports.post = (requisicao, resposta, next) => {
    resposta.status(201).send('Requisição recebida com sucesso!');
};

exports.put = (requisicao, resposta, next) => {
    let id = requisicao.params.id;
    resposta.status(201).send(`Requisição recebida com sucesso! ${id} `);
};

exports.delete = (requisicao, resposta, next) => {
    let id = requisicao.params.id;
    resposta.status(200).send(`Requisição recebida com sucesso! ${id}`);
};