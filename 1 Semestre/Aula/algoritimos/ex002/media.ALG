Algoritmo "media"
//João Alves Cordeiro 1º Semestre
Var
 n1, n2, n3: inteiro
 resultado: real
 
Inicio
      escreval("Qual a sua primeira nota: ")
      leia(n1)
      escreval("Qual a segunda nota: ")
      leia(n2)
      escreval("Qual a terceira nota: ")
      leia(n3)
      resultado <- (n1 + n2 + n3) / 3
      se( resultado < 7) entao
      escreval("Sua media foi", resultado, "infelizmente voce foi reprovado!")
         senao() entao
         escreval("Sua media foi", resultado, " voce esta aprovado!")
      fimse
      



Fimalgoritmo