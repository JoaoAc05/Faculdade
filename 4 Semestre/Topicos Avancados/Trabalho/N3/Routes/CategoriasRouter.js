const express = require('express');
const router = express.Router();
const categoriasController = require('../Controller/CategoriasController');

router.get('/', categoriasController.getAllCategorias);

module.exports = router;