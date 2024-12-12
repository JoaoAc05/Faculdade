const db = require('../database');

// Obter todos os produtos
const getAllProdutos = (req, res) => {
    db.query('SELECT * FROM Produtos', (err, results) => {
        if (err) {
            res.status(500).send('Erro ao obter produtos.');
        } else {
            res.json(results);
        }
    });
};

// Criar um novo produto
const createProduto = (req, res) => {
    const { nome, preco, id_fornec, categoria_id } = req.body;
    const sql = 'INSERT INTO Produtos (nome, preco, id_fornec, categoria_id) VALUES (?, ?, ?, ?)';
    db.query(sql, [nome, preco, id_fornec, categoria_id], (err) => {
        if (err) {
            res.status(500).send('Erro ao criar produto.');
        } else {
            res.send('Produto inserido com sucesso!');
        }
    });
};

// Atualizar um produto existente
const updateProduto = (req, res) => {
    const id = req.params.id;
    const { nome, preco, id_fornec, categoria_id } = req.body;
    const sql = 'UPDATE Produtos SET nome = ?, preco = ?, id_fornec = ?, categoria_id = ? WHERE id = ?';
    db.query(sql, [nome, preco, id_fornec, categoria_id, id], (err) => {
        if (err) {
            res.status(500).send('Erro ao atualizar produto.');
        } else {
            res.send('Produto atualizado com sucesso!');
        }
    });
};

// Deletar um produto
const deleteProduto = (req, res) => {
    const id = req.params.id;
    const sql = 'DELETE FROM Produtos WHERE id = ?';
    db.query(sql, [id], (err) => {
        if (err) {
            res.status(500).send('Erro ao excluir produto.');
        } else {
            res.send('Produto excluído com sucesso!');
        }
    });
};

module.exports = { getAllProdutos, createProduto, updateProduto, deleteProduto };