Algoritmo "MEDIA_MATRIZ"

Var
nome:vetor[1..3] de caractere
notas: vetor[1..2,1..3] de real
media, mediag: real
qnt, contador, aprov: inteiro

//Matriz
contl, contc: inteiro

Inicio
//coleta de quantidade
escreval("Quantos alunos?")
leia(qnt)
limpatela

para contador de 1 ate qnt faca //Selecionar cabecalho (Para cada nome)
     escreval("")
     escreval("-------------------------------")
     escreva("Nome: ")
     leia(nome[contador])
     para contc de 1 ate 1 faca //Selecionar Coluna (1 coluna)
          para contl de 1 ate 2 faca // Seleciona Linha (2 linhas)
          escreval("Digite a nota N", contl, ";")
          leia(notas[contl,contc])
          
          media <- (notas[contl,contc])/2
          mediag <- media + mediag
          fimpara
     fimpara
fimpara
escreval("-------------------------------")

//calcular média geral
mediag <- mediag/(qnt*2)

//Saida de dados
escreval("")
escreval("A média geral dos alunos avaliados é: ", mediag)
escreval("A quantidade de alunos aprovados é: ", aprov)

Fimalgoritmo