Algoritmo "calculadora_caso"

Var
n1, n2, resul: real
opera: caractere

Inicio
escreval(" Qual vai ser o primeiro número: ")
leia(n1)
escreval(" Qual vai ser a operação entre eles: ")
escreval("soma -> +")
escreval("subtração -> -")
escreval("multiplicação -> x")
escreval("divisão -> /")
leia(opera)
escreval(" Qual vai ser o segundo número: ")
leia(n2)
escolha opera
        caso "soma", "+"
             resul <- n1 + n2
             escreval("A soma entre ", n1, " e ", n2, " resulta em ", resul)
        caso "subtracao", "subtração", "-"
              resul <- n1 - n2
             escreval("A subtração entre ", n1, " e ", n2, " resulta em ", resul)
        caso "multiplicacão", "multiplicação", "x", "X"
              resul <- n1 * n2
             escreval("A multiplicação entre ", n1, " e ", n2, " resulta em ", resul)
        caso "divisao", "divisão", "/"
             resul <- n1 / n2
             escreval("A divisão entre ", n1, " e ", n2, " resulta em ", resul)
fimescolha
Fimalgoritmo