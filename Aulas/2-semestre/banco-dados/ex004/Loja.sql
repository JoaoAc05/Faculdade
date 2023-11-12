CREATE TABLE Categorias (
  ID_Categoria int unique not null,
  Nome_Categoria varchar(35),
  
  PRIMARY KEY (ID_Categoria)
);

INSERT INTO Categorias(ID_Categoria, Nome_Categoria) VALUES (1, 'Produtos de Limpeza');
INSERT INTO Categorias(ID_Categoria, Nome_Categoria) VALUES (2, 'Produtos Alimenticios');
INSERT INTO Categorias(ID_Categoria, Nome_Categoria) VALUES (3, 'Produtos de Tecnologia');


CREATE TABLE Produtos (
  ID_Produto int unique not null,
  Nome_Produto varchar(40) not null,
  Descricao varchar(60),
  Preco decimal(6,2),
  ID_Categoria int,
  
  PRIMARY KEY (ID_Produto),
  FOREIGN KEY (ID_Categoria) REFERENCES Categorias(ID_Categoria)
);

INSERT INTO Produtos(ID_Produto, Nome_Produto, Descricao, Preco, ID_Categoria) VALUES (1, 'Pano de chao', 'Limpeza de chao', 24.99, 1);
INSERT INTO Produtos(ID_Produto, Nome_Produto, Descricao, Preco, ID_Categoria) VALUES (2, 'Pano de prato', 'Limpeza de cozinha', 19.99, 1);
INSERT INTO Produtos(ID_Produto, Nome_Produto, Descricao, Preco, ID_Categoria) VALUES (3, 'Desinfetante', 'Limpeza de chao', 30.00, 1);
INSERT INTO Produtos(ID_Produto, Nome_Produto, Descricao, Preco, ID_Categoria) VALUES (4, 'Banana', 'Alimento natural', 9.99, 2);
INSERT INTO Produtos(ID_Produto, Nome_Produto, Descricao, Preco, ID_Categoria) VALUES (5, 'Maca', 'Alimento natural', 12.90, 2);
INSERT INTO Produtos(ID_Produto, Nome_Produto, Descricao, Preco, ID_Categoria) VALUES (6, 'Ameixa', 'Alimento natural', 14.99, 2);
INSERT INTO Produtos(ID_Produto, Nome_Produto, Descricao, Preco, ID_Categoria) VALUES (7, 'Monitor', 'Computacao', 604.99, 3);
INSERT INTO Produtos(ID_Produto, Nome_Produto, Descricao, Preco, ID_Categoria) VALUES (8, 'Cabo HDMI', 'Computacao', 70.00, 3);

CREATE TABLE Clientes (
  ID_Cliente int unique not null,
  Nome_Cliente varchar(60) not null,
  Idade_Cliente int,
  Endereco varchar(60),
  Telefone_Cliente numeric(13),
  
  PRIMARY KEY (ID_Cliente)
);

INSERT INTO Clientes(ID_Cliente, Nome_Cliente, Idade_Cliente, Endereco, Telefone_Cliente) VALUES (1, 'João Silva', 30, 'Rua A, 123', 1234567890123);
INSERT INTO Clientes(ID_Cliente, Nome_Cliente, Idade_Cliente, Endereco, Telefone_Cliente) VALUES (2, 'Maria Oliveira', 25, 'Avenida B, 456', 9876543210987);
INSERT INTO Clientes(ID_Cliente, Nome_Cliente, Idade_Cliente, Endereco, Telefone_Cliente) VALUES (3, 'Carlos Santos', 40, 'Rua C, 789', 1111222233334);
INSERT INTO Clientes(ID_Cliente, Nome_Cliente, Idade_Cliente, Endereco, Telefone_Cliente) VALUES (4, 'Ana Pereira', 22, 'Avenida D, 567', 4444555566667);

CREATE TABLE Pedidos (
  ID_Pedido int unique not null,
  Data_Pedido date,
  ID_Cliente int,
  
  PRIMARY KEY (ID_Pedido)
);

INSERT INTO Pedidos(ID_Pedido, Data_Pedido, ID_Cliente) VALUES (1, '2023-11-10', 1);
INSERT INTO Pedidos(ID_Pedido, Data_Pedido, ID_Cliente) VALUES (2, '2023-11-11', 2);
INSERT INTO Pedidos(ID_Pedido, Data_Pedido, ID_Cliente) VALUES (3, '2023-11-12', 3);
INSERT INTO Pedidos(ID_Pedido, Data_Pedido, ID_Cliente) VALUES (4, '2023-11-13', 4);

CREATE TABLE Itens_Pedido (
  ID_Item int not null,
  ID_Pedido int not null,
  ID_Produto int,
  Quantidade int,
  Preco_Produto decimal(6,2),
  
  PRIMARY KEY (ID_Item),
  FOREIGN KEY (ID_Pedido) REFERENCES Pedidos(ID_Pedido),
  FOREIGN KEY (ID_Produto) REFERENCES Produtos(ID_Produto)
);

INSERT INTO Itens_Pedido(ID_Item, ID_Pedido, ID_Produto, Quantidade, Preco_Produto) VALUES (1, 1, 1, 5, 24.99);
INSERT INTO Itens_Pedido(ID_Item, ID_Pedido, ID_Produto, Quantidade, Preco_Produto) VALUES (2, 1, 2, 1, 19.99);
INSERT INTO Itens_Pedido(ID_Item, ID_Pedido, ID_Produto, Quantidade, Preco_Produto) VALUES (3, 2, 1, 1, 24.99);
INSERT INTO Itens_Pedido(ID_Item, ID_Pedido, ID_Produto, Quantidade, Preco_Produto) VALUES (4, 2, 5, 2, 12.90);
INSERT INTO Itens_Pedido(ID_Item, ID_Pedido, ID_Produto, Quantidade, Preco_Produto) VALUES (5, 3, 6, 10, 14.99);
INSERT INTO Itens_Pedido(ID_Item, ID_Pedido, ID_Produto, Quantidade, Preco_Produto) VALUES (6, 4, 7, 1, 604.99);

SELECT Nome_Categoria, (SELECT COUNT(*) FROM Produtos WHERE ID_Categoria = Categorias.ID_Categoria) AS Contagem_de_Produtos FROM Categorias;
SELECT MAX(Preco) AS Preco_Mais_Alto FROM Produtos;
SELECT AVG(Idade_Cliente) AS Idade_Media FROM Clientes;
SELECT MIN(Idade_Cliente) AS Menor_Idade FROM Clientes;
SELECT AVG(Preco) AS Preco_Medio_Categoria FROM Produtos WHERE ID_Categoria = (SELECT ID_Categoria FROM Categorias WHERE Nome_Categoria = 'Produtos de Limpeza');
SELECT SUM(Preco) AS Valor_Total_Categoria FROM Produtos WHERE ID_Categoria = (SELECT ID_Categoria FROM Categorias WHERE Nome_Categoria = 'Produtos de Limpeza');
SELECT COUNT(*) AS Quantidade_Categorias FROM Categorias;
SELECT MIN(Preco) AS Menor_Preco FROM Produtos WHERE ID_Categoria = (SELECT ID_Categoria FROM Categorias WHERE Nome_Categoria = 'Produtos de Limpeza');
SELECT COUNT(*) AS Contagem_de_Produtos FROM Produtos WHERE Nome_Produto LIKE '%A%';
SELECT ID_Pedido, (SELECT SUM(Quantidade * Preco_Produto) FROM Itens_Pedido WHERE ID_Pedido = 3) AS Total_do_Pedido FROM Itens_Pedido WHERE ID_Pedido = 3;