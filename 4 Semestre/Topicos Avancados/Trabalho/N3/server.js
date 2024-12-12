const mysql = require('mysql2'); // Certifique-se de usar mysql2
const express = require('express');
const app = express();
const cors = require('cors');

// Middleware para permitir JSON
app.use(express.json());
app.use(cors());

// Configuração da conexão com o banco de dados
const db = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: 'joao97ac',
    database: 'Gerenciamento'
});

db.connect(err => {
    if (err) {
        console.error('Erro ao conectar ao banco de dados:', err);
        return;
    }
    console.log('Conectado ao banco de dados!');
});

// Rotas de CRUD
const produtosRouter = require('./Routes/ProdutosRouter');
const fornecedoresRouter = require('./Routes/FornecedorRouter');
const categoriasRouter = require('./Routes/CategoriasRouter');

app.use('/produtos', produtosRouter);
app.use('/fornecedores', fornecedoresRouter);
app.use('/categorias', categoriasRouter);

// Adicione operações similares para inserir, atualizar e deletar categorias.
const PORT = 3000;
app.listen(PORT, () => {
    console.log(`Servidor rodando na porta ${PORT}`);
});