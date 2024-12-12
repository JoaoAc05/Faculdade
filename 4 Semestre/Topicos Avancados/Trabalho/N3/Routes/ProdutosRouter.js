const express = require('express');
const router = express.Router();
const produtosController = require('../Controller/ProdutosController');

// Rotas de Produtos
router.get('/', produtosController.getAllProdutos);
router.post('/', produtosController.createProduto);
router.put('/:id', produtosController.updateProduto);
router.delete('/:id', produtosController.deleteProduto);

module.exports = router;