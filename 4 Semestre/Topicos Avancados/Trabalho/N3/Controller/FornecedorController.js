const db = require('../database');

const getAllFornecedores = (req, res) => {
    db.query('SELECT * FROM Fornecedores', (err, results) => {
        if (err) {
            res.status(500).send('Erro ao obter fornecedores.');
        } else {
            res.json(results);
        }
    });
};

module.exports = { getAllFornecedores };