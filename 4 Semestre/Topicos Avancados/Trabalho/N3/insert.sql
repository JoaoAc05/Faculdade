-- Inserir Fornecedores
INSERT INTO Fornecedores (id, nome, contato) VALUES (1, 'Fornecedor A', '123456789');
INSERT INTO Fornecedores (id, nome, contato) VALUES (2, 'Fornecedor B', '987654321');
INSERT INTO Fornecedores (id, nome, contato) VALUES (3, 'Fornecedor C', '456789123');

-- Inserir Categorias
INSERT INTO Categorias (id, nome) VALUES (1, 'Categoria 1');
INSERT INTO Categorias (id, nome) VALUES (2, 'Categoria 2');
INSERT INTO Categorias (id, nome) VALUES (3, 'Categoria 3');

-- Inserir Produtos
INSERT INTO Produtos (id, nome, preco, id_fornec, categoria_id) VALUES (1, 'Produto A', 25.50, 1, 1);
INSERT INTO Produtos (id, nome, preco, id_fornec, categoria_id) VALUES (2, 'Produto B', 40.00, 2, 2);
INSERT INTO Produtos (id, nome, preco, id_fornec, categoria_id) VALUES (3, 'Produto C', 15.75, 3, 1);
