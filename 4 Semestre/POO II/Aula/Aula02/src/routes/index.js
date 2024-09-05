const express = require('express');
const router = express.Router();

router.get('/', function (requisicao, resposta, next) {
    resposta.status(200).send({
        title: "Minha primeira API",
        version: "0.0.1"
    });
});

module.exports = router;