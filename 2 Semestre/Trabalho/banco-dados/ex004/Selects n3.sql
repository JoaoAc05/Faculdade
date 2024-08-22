--  Considere as tabelas "Membros" e "Assinaturas". Faça uma consulta que retorne os nomes dos membros e os IDs das assinaturas correspondentes, apenas para os membros que possuem assinaturas.
SELECT Membros.Nome, Assinaturas.AssinaturasID AS Assinatura FROM Membros 
INNER JOIN Assinaturas ON Membros.MembroID = Assinaturas.MembroID;

--  Dadas as tabelas "Treinos" e "Instrutores", crie uma consulta que una os IDs dos treinos e dos instrutores.
SELECT Instrutores.NomeInstrutor, Treinos.TreinoID AS Treino FROM Instrutores
INNER JOIN Treinos ON Instrutores.InstrutorID = Treinos.InstrutorID;

--  Elabore uma consulta que exiba todos os membros e os treinos associados a eles, incluindo os membros que não estão atualmente em nenhum treino.
SELECT Membros.MembroID, Membros.Nome, Treinos.TreinoID, Treinos.DataTreino FROM Membros
LEFT JOIN Treinos ON Membros.MembroID = Treinos.MembroID;

-- Crie uma consulta que mostre o nome do instrutor e a quantidade de treinos conduzidos por cada instrutor, incluindo apenas os instrutores que conduziram mais de 3 treinos.
SELECT Instrutores.InstrutorID, Instrutores.NomeInstrutor, COUNT(Treinos.TreinoID) AS QuantidadeTreinos FROM Instrutores
INNER JOIN Treinos ON Instrutores.InstrutorID = Treinos.InstrutorID GROUP BY Instrutores.InstrutorID, Instrutores.NomeInstrutor
HAVING COUNT(Treinos.TreinoID) > 0;

-- Faça uma consulta que retorne os membros da tabela "Membros" ordenados por idade, do mais jovem para o mais velho.
SELECT * FROM Membros ORDER BY DataNascimento DESC;

-- Elabore uma consulta que exiba a quantidade de membros por sexo da tabela "Membros".
SELECT  Membros.Sexo, COUNT(Membros.Sexo) AS QuantMembros FROM Membros GROUP BY Membros.Sexo;

-- Dada a tabela "Assinaturas" e "Planos", escreva uma consulta que retorne os nomes dos membros que possuem assinaturas com uma duração superior a 6 meses
SELECT Membros.MembroID, Membros.Nome, Assinaturas.AssinaturasID, Planos.DuracaoMeses FROM Membros
JOIN Assinaturas ON Membros.MembroID = Assinaturas.MembroID
JOIN Planos ON Assinaturas.PlanoID = Planos.PlanoID
WHERE Planos.DuracaoMeses > 6;

-- Crie uma consulta que exiba todos os membros e a quantidade de treinos em que participaram, ordenados pela quantidade de treinos de forma decrescente
SELECT Membros.Nome, COUNT(Treinos.TreinoID) AS QuantTreinos FROM Membros
JOIN Treinos ON Membros.MembroID = Treinos.MembroID GROUP BY Membros.MembroID
ORDER BY QuantTreinos DESC;

-- Elabore uma consulta que una os nomes dos membros da tabela "Membros" e "Instrutores", ordenados alfabeticamente
SELECT Nome FROM Membros UNION 
SELECT NomeInstrutor FROM Instrutores ORDER BY Nome;

-- Crie uma consulta que exiba o nome do membro, o nome do plano assinado e a especialidade do instrutor, ordenada pelo nome do membro em ordem alfabética
SELECT Membros.Nome AS NomeMembro, Planos.NomePlano, Instrutores.Especialidade FROM Membros
JOIN Assinaturas ON Membros.MembroID = Assinaturas.MembroID
JOIN Planos ON Assinaturas.PlanoID = Planos.PlanoID
LEFT JOIN Treinos ON Membros.MembroID = Treinos.MembroID
LEFT JOIN Instrutores ON Treinos.InstrutorID = Instrutores.InstrutorID
ORDER BY NomeMembro;