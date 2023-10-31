CREATE TABLE Cidades (
  nome varchar(40),
  estado char(2),
  cep numeric(8),
  ibge numeric(5) UNIQUE,

  PRIMARY KEY (ibge)
);

  INSERT INTO Cidades (nome, estado, cep, ibge) VALUES ('Sinop', 'MT', 78550000, 15932);
  INSERT INTO Cidades (nome, estado, cep, ibge) VALUES ('Floripa', 'SC', 65758000, 37541);
  INSERT INTO Cidades (nome, estado, cep, ibge) VALUES ('Cuiaba', 'MT', 79660000, 54321);
  INSERT INTO Cidades (nome, estado, cep, ibge) VALUES ('Londrina', 'PR', 23521000, 77928);
 
CREATE TABLE Pacientes (
  codp integer, 
  nome varchar(40) NOT NULL,
  idade integer,
  cidade varchar(30),
  CPF numeric(11) UNIQUE, 
  doenca varchar( 46 ),
  
  PRIMARY KEY(codp)
);
  
  INSERT INTO Pacientes (codp, nome, idade, cidade, CPF, doenca) VALUES (1, 'Ana', 20, 'Florianopolis', 20000200000, 'gripe');
  INSERT INTO Pacientes (codp, nome, idade, cidade, CPF, doenca) VALUES (2, 'Paulo', 24, 'Palhoca', 20000220000, 'fratura');
  INSERT INTO Pacientes (codp, nome, idade, cidade, CPF, doenca) VALUES (3, 'Lucia', 30, 'Biguacu', 22000200000, 'tendinite');
  INSERT INTO Pacientes (codp, nome, idade, cidade, CPF, doenca) VALUES (4, 'Carlos', 28, 'Joinville', 11000110000, 'sarampo');
  
CREATE TABLE Ambulatorios (
nroa integer, 
andar integer,
capacidade integer,

PRIMARY KEY(nroa)
);
  
  INSERT INTO Ambulatorios (nroa, andar, capacidade) VALUES (1, 1, 30);
  INSERT INTO Ambulatorios (nroa, andar, capacidade) VALUES (2, 1, 50);
  INSERT INTO Ambulatorios (nroa, andar, capacidade) VALUES (3, 2, 40);
  INSERT INTO Ambulatorios (nroa, andar, capacidade) VALUES (4, 2, 25);
  INSERT INTO Ambulatorios (nroa, andar, capacidade) VALUES (5, 2, 55);
 
CREATE TABLE Medicos (
    codm integer,
    nome varchar(50) NOT NULL,
    idade integer,
    especialidade varchar(30),
    CPF numeric(11) UNIQUE, 
    cidade varchar(50),
    nroa integer, 
    
    PRIMARY KEY (codm),
    FOREIGN KEY (nroa) REFERENCES Ambulatorios(nroa)
  );
  
  INSERT INTO Medicos (codm, nome, idade, especialidade, CPF, cidade, nroa) VALUES (1, 'Joao', 40, 'ortopedia', 10000100000, 'Florianopolis', 1);
  INSERT INTO Medicos (codm, nome, idade, especialidade, CPF, cidade, nroa) VALUES (2, 'Maria', 42, 'traumatologia', 10000110000, 'Blumenau', 2);
  INSERT INTO Medicos (codm, nome, idade, especialidade, CPF, cidade, nroa) VALUES (3, 'Pedro', 51, 'pediatria', 11000100000, 'Sao Jose', 2);
  INSERT INTO Medicos (codm, nome, idade, especialidade, CPF, cidade, nroa) VALUES (4, 'Carlos', 28, 'ortopedia', 11000110000, 'Joiville', null);
  INSERT INTO Medicos (codm, nome, idade, especialidade, CPF, cidade, nroa) VALUES (5, 'Marcia', 33, 'neurologista', 11000111000, 'Biguacu', 3);

CREATE TABLE Consultas (
  codm integer,
  codp integer,
  data_consulta date,
  hora time,

  FOREIGN KEY (codm) REFERENCES Medicos(codm),
  FOREIGN KEY (codp) REFERENCES Pacientes(codp)
);
  
  INSERT INTO Consultas (codm, codp, data_consulta, hora) VALUES ( 1, 1, '2006/06/12', '14:00');
  INSERT INTO Consultas (codm, codp, data_consulta, hora) VALUES ( 1, 4, '2006/06/13', '10:00');
  INSERT INTO Consultas (codm, codp, data_consulta, hora) VALUES ( 2, 1, '2006/06/13', '09:00');
  INSERT INTO Consultas (codm, codp, data_consulta, hora) VALUES ( 2, 2, '2006/06/13', '11:00');
  INSERT INTO Consultas (codm, codp, data_consulta, hora) VALUES ( 2, 3, '2006/06/14', '14:00');
  INSERT INTO Consultas (codm, codp, data_consulta, hora) VALUES ( 2, 4, '2006/06/14', '17:00');
  INSERT INTO Consultas (codm, codp, data_consulta, hora) VALUES ( 3, 1, '2006/06/19', '18:00');
  INSERT INTO Consultas (codm, codp, data_consulta, hora) VALUES ( 3, 3, '2006/06/12', '10:00');
  INSERT INTO Consultas (codm, codp, data_consulta, hora) VALUES ( 3, 4, '2006/06/19', '13:00');
  INSERT INTO Consultas (codm, codp, data_consulta, hora) VALUES ( 4, 4, '2006/06/20', '13:00');
  INSERT INTO Consultas (codm, codp, data_consulta, hora) VALUES ( 4, 4, '2006/06/22', '19:30');

  CREATE TABLE Funcionarios (
  codf integer UNIQUE,
  nome varchar(50) NOT NULL,
  idade integer,
  cidade varchar(40),
  salario integer,
  CPF numeric(11) UNIQUE,

  PRIMARY KEY (codf) 
);

  INSERT INTO Funcionarios (codf, nome, idade, cidade, salario, CPF) VALUES (1, 'Rita', 32, 'Sao Jose', 1200, 20000100000);
  INSERT INTO Funcionarios (codf, nome, idade, cidade, salario, CPF) VALUES (2, 'Maria', 55, 'Palhoca', 1220, 30000110000);
  INSERT INTO Funcionarios (codf, nome, idade, cidade, salario, CPF) VALUES (3, 'Caio', 45, 'Florianopolis', 1100, 41000100000);
  INSERT INTO Funcionarios (codf, nome, idade, cidade, salario, CPF) VALUES (4, 'Carlos', 44, 'Florianopolis', 1200, 51000110000);
  INSERT INTO Funcionarios (codf, nome, idade, cidade, salario, CPF) VALUES (5, 'Paula', 33, 'Florianopolis', 2500, 61000111000);
 