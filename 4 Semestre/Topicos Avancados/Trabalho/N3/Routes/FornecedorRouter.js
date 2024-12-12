const express = require('express');
const router = express.Router();
const fornecedoresController = require('../Controller/FornecedorController');

router.get('/', fornecedoresController.getAllFornecedores);

module.exports = router;