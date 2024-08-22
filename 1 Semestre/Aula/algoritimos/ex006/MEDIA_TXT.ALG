Algoritmo "MEDIA_TXT"
arquivo "txt/media.txt"

Var
nome: caractere
n1, n2 ,n3 ,media: real
mediag, porc: real
contador, aprov: inteiro
botao: caractere


Inicio
//5 alunos no txt
para contador de 1 ate 5 faca
   leia(nome)
   leia(n1)
   leia(n2)
   leia(n3)

   media <- (n1 + n2 + n3)/3
   se (media >= 7) entao
      escreval("--------------------------------------")
      escreval("Aluno APROVADO com a média: ", media)
      escreval("--------------------------------------")
      aprov <- aprov + 1
      senao
           escreval("--------------------------------------")
           escreval("Aluno Reprovado com a média: ", media)
           escreval("--------------------------------------")
   fimse
   mediag <- mediag + media
   
   escreval("")
fimpara
escreva("Aperte ENTER para apagar e exibir total")
leia(botao)
limpatela
mediag <- media/contador
porc <- (aprov/contador) * 100)
escreval("A quantidade de alunos aprovados é: ", aprov)
escreval("A porcentagem de aprovação é: ", porc, "%")
escreval("A média total dos alunos avaliados é: ", mediag)
Fimalgoritmo