const db = require('../database');

const getAllCategorias = (req, res) => {
    db.query('SELECT * FROM Categorias', (err, results) => {
        if (err) {
            res.status(500).send('Erro ao obter categorias.');
        } else {
            res.json(results);
        }
    });
};

module.exports = { getAllCategorias };