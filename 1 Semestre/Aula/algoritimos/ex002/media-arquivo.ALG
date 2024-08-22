Algoritmo "semnome"
  arquivo "txt/media.txt"
Var
   nome : caractere
   n1, n2, n3: inteiro
   total : real


Inicio
   //Entrada de dados pelo arquivo
   leia(nome)
   leia(n1)
   leia(n2)
   leia(n3)
   escreval("")
   
   // Processamento
   total <- (n1 + n2 + n3) / 3

   se (total < 7) entao
      escreval(" Aluno: ", nome, " REPROVADO com a media: ", total)
      
      senao
           escreval("Aluno: ", nome, " APROVADO com a média: ", total)
   fimse
Fimalgoritmo