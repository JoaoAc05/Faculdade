CREATE TABLE Cursos (
  id_cur integer NOT NULL UNIQUE,
  nome varchar(40),
  departamento varchar(20),
  
  PRIMARY KEY (id_cur)
);

INSERT INTO Cursos (id_cur, nome, departamento) VALUES (1, 'Curso 1', 'Departamento A');
INSERT INTO Cursos (id_cur, nome, departamento) VALUES (2, 'Curso 2', 'Departamento B');
INSERT INTO Cursos (id_cur, nome, departamento) VALUES (3, 'Curso 3', 'Departamento C');
INSERT INTO Cursos (id_cur, nome, departamento) VALUES (4, 'Curso 4', 'Departamento D');

CREATE TABLE Alunos (
  id_alu integer NOT NULL UNIQUE,
  nome varchar(40),
  data_nascimento date,
  id_cur integer,

  PRIMARY KEY (id_alu),
  FOREIGN KEY (id_cur) REFERENCES Cursos(id_cur)
);

INSERT INTO Alunos (id_alu, nome, data_nascimento, id_cur) VALUES (1, 'Aluno 1', '2000-01-01', 1);
INSERT INTO Alunos (id_alu, nome, data_nascimento, id_cur) VALUES (2, 'Aluno 2', '2000-02-01', 2);
INSERT INTO Alunos (id_alu, nome, data_nascimento, id_cur) VALUES (3, 'Aluno 3', '2000-03-01', 3);
INSERT INTO Alunos (id_alu, nome, data_nascimento, id_cur) VALUES (4, 'Aluno 4', '2000-04-01', 4);

CREATE TABLE  Professores (
  id_prof integer NOT NULL UNIQUE,
  nome varchar(40),
  departamento varchar(20),

  PRIMARY KEY (id_prof)
);

INSERT INTO Professores (id_prof, nome, departamento) VALUES (1, 'Professor 1', 'Departamento X');
INSERT INTO Professores (id_prof, nome, departamento) VALUES (2, 'Professor 2', 'Departamento Y');
INSERT INTO Professores (id_prof, nome, departamento) VALUES (3, 'Professor 3', 'Departamento Z');
INSERT INTO Professores (id_prof, nome, departamento) VALUES (4, 'Professor 4', 'Departamento W');

CREATE TABLE Disciplinas (
  id_dis integer NOT NULL UNIQUE,
  nome varchar(30),
  id_cur integer NOT NULL,
  id_prof integer,

  PRIMARY KEY (id_dis),
  FOREIGN KEY (id_cur) REFERENCES Cursos(id_cur),  
  FOREIGN KEY (id_prof) REFERENCES Professores(id_prof)
);

INSERT INTO Disciplinas (id_dis, nome, id_cur, id_prof) VALUES (1, 'Disciplina 1', 1, 1);
INSERT INTO Disciplinas (id_dis, nome, id_cur, id_prof) VALUES (2, 'Disciplina 2', 2, 2);
INSERT INTO Disciplinas (id_dis, nome, id_cur, id_prof) VALUES (3, 'Disciplina 3', 3, 3);
INSERT INTO Disciplinas (id_dis, nome, id_cur, id_prof) VALUES (4, 'Disciplina 4', 4, 4);

CREATE TABLE Matriculas (
  id_mat integer NOT NULL UNIQUE,
  id_alu integer NOT NULL,
  id_dis integer NOT NULL,
  ano_academico numeric,

  PRIMARY KEY (id_mat),
  FOREIGN KEY (id_alu) REFERENCES Alunos(id_alu),
  FOREIGN KEY (id_dis) REFERENCES Disciplinas(id_dis)
);

INSERT INTO Matriculas (id_mat, id_alu, id_dis, ano_academico) VALUES (1, 1, 1, 2023);
INSERT INTO Matriculas (id_mat, id_alu, id_dis, ano_academico) VALUES (2, 2, 2, 2023);
INSERT INTO Matriculas (id_mat, id_alu, id_dis, ano_academico) VALUES (3, 3, 3, 2023);
INSERT INTO Matriculas (id_mat, id_alu, id_dis, ano_academico) VALUES (4, 4, 4, 2023);

CREATE TABLE Notas (
  id_not integer NOT NULL UNIQUE,
  id_mat integer NOT NULL,
  nota numeric,

  PRIMARY KEY (id_not),
  FOREIGN KEY (id_mat) REFERENCES Matriculas(id_mat)
);

INSERT INTO Notas (id_not, id_mat, nota) VALUES (1, 1, 8.5);
INSERT INTO Notas (id_not, id_mat, nota) VALUES (2, 2, 7.0);
INSERT INTO Notas (id_not, id_mat, nota) VALUES (3, 3, 9.5);
INSERT INTO Notas (id_not, id_mat, nota) VALUES (4, 4, 6.0);

CREATE TABLE Salas (
  id_sala integer NOT NULL UNIQUE,
  numero_sala integer NOT NULL,
  capacidade integer,

  PRIMARY KEY (id_sala)
);

INSERT INTO Salas (id_sala, numero_sala, capacidade) VALUES (1, 101, 30);
INSERT INTO Salas (id_sala, numero_sala, capacidade) VALUES (2, 102, 25);
INSERT INTO Salas (id_sala, numero_sala, capacidade) VALUES (3, 103, 40);
INSERT INTO Salas (id_sala, numero_sala, capacidade) VALUES (4, 104, 35);

CREATE TABLE Horarios (
  id_hor integer NOT NULL UNIQUE,
  dia_sem integer,
  hora_ini time,
  hora_fim time, 
  id_dis integer,
  id_sala integer,

  PRIMARY KEY (id_hor),
  FOREIGN KEY (id_dis) REFERENCES Disciplinas(id_dis),
  FOREIGN KEY (id_sala) REFERENCES Salas(id_sala)
);

INSERT INTO Horarios (id_hor, dia_sem, hora_ini, hora_fim, id_dis, id_sala) VALUES (1, 1, '08:00:00', '10:00:00', 1, 1);
INSERT INTO Horarios (id_hor, dia_sem, hora_ini, hora_fim, id_dis, id_sala) VALUES (2, 2, '10:15:00', '12:15:00', 2, 2);
INSERT INTO Horarios (id_hor, dia_sem, hora_ini, hora_fim, id_dis, id_sala) VALUES (3, 3, '14:00:00', '16:00:00', 3, 3);
INSERT INTO Horarios (id_hor, dia_sem, hora_ini, hora_fim, id_dis, id_sala) VALUES (4, 4, '16:15:00', '18:15:00', 4, 4);