Algoritmo "menor-numero"

Var
n1, n2, n3, mn: inteiro

Inicio
 escreval("Digite o Primeiro número: ")
 leia(n1)
 escreval("Digite o segundo número: ")
 leia(n2)
 escreval("Digite o terceiro número: ")
 leia(n3)
 
 mn <- n1
 
 se ( n2 < mn ) entao
    mn <- n2
 fimse
 se ( n3 < mn ) entao
    mn <- n3
 fimse
 escreval(" O menor número digitado foi: ", mn)

Fimalgoritmo