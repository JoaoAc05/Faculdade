CREATE TABLE Membros(
MembroID int,
Nome varchar(50),
DataNascimento date,
Sexo char(1),
Telefone varchar(15),

PRIMARY KEY (MembroID)
);

CREATE TABLE Planos (
PlanoID int,
NomePlano varchar(50),
DuracaoMeses int,
ValorMensal decimal(10,2),

PRIMARY KEY (PlanoID)
);

CREATE TABLE Assinaturas (
AssinaturasID int,
MembroID int,
PlanoID int,
DataInicio date,
DataFim date,

PRIMARY KEY (AssinaturasID),
FOREIGN KEY (MembroID) REFERENCES Membros(MembroID),
FOREIGN KEY (PlanoID) REFERENCES Planos(PlanoID)
);

CREATE TABLE Instrutores (
InstrutorID int,
NomeInstrutor varchar(50),
Especialidade varchar(50),

PRIMARY KEY (InstrutorID)
);

CREATE TABLE Treinos (
TreinoID int,
MembroID int,
InstrutorID int,
DataTreino date,

PRIMARY KEY (TreinoID),
FOREIGN KEY (MembroID) REFERENCES Membros(MembroID),
FOREIGN KEY (InstrutorID) REFERENCES Instrutores(InstrutorID)
);

CREATE TABLE Equipamentos (
EquipamentoID int,
NomeEquipamento varchar(50),
TipoEquipamento varchar(50),

PRIMARY KEY (EquipamentoID)
);

INSERT INTO Membros (MembroID, Nome, DataNascimento, Sexo, Telefone)
VALUES 
  (1, 'João Silva', '1990-05-15', 'M', '+55 123456789'),
  (2, 'Maria Oliveira', '1985-09-20', 'F', '+55 987654321'),
  (3, 'Carlos Pereira', '1995-02-10', 'M', '+55 111222333'),
  (4, 'Ana Santos', '1988-11-30', 'F', '+55 444555666');

INSERT INTO Planos (PlanoID, NomePlano, DuracaoMeses, ValorMensal)
VALUES 
  (1, 'Plano Básico', 3, 50.00),
  (2, 'Plano Intermediário', 6, 80.00),
  (3, 'Plano Avançado', 12, 120.00),
  (4, 'Plano Premium', 24, 200.00);

INSERT INTO Assinaturas (AssinaturasID, MembroID, PlanoID, DataInicio, DataFim)
VALUES 
  (1, 1, 1, '2023-01-01', '2023-03-31'),
  (2, 2, 2, '2023-02-15', '2023-08-15'),
  (3, 3, 3, '2023-03-10', '2024-03-10'),
  (4, 4, 4, '2023-04-01', '2025-04-01');

INSERT INTO Instrutores (InstrutorID, NomeInstrutor, Especialidade)
VALUES 
  (1, 'Pedro Oliveira', 'Musculação'),
  (2, 'Ana Lima', 'Yoga'),
  (3, 'Carlos Silva', 'Cardio'),
  (4, 'Mariana Santos', 'Pilates');

INSERT INTO Treinos (TreinoID, MembroID, InstrutorID, DataTreino)
VALUES 
  (1, 1, 1, '2023-01-05'),
  (2, 2, 2, '2023-02-20'),
  (3, 3, 3, '2023-03-15'),
  (4, 4, 4, '2023-04-05'),
  (5, 1, 1, '2023-05-05'),
  (6, 2, 1, '2023-06-15'),
  (7, 3, 1, '2023-07-05');

INSERT INTO Equipamentos (EquipamentoID, NomeEquipamento, TipoEquipamento)
VALUES 
  (1, 'Esteira', 'Cardio'),
  (2, 'Bicicleta Ergométrica', 'Cardio'),
  (3, 'Máquina de Musculação', 'Musculação'),
  (4, 'Tapete de Yoga', 'Yoga');