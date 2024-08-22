Algoritmo "salario por hora"

Var
horas, salario, valor: real


Inicio

escreval("|_ Seja Bem Vindo a Calculadora de Salario _|")
escreval("----------------------------------------------")
escreval("")
escreval(" Quanto voc recebe por hora?: ")
leia(valor)
escreval(" Quantas horas voc trabalhou?: ")
leia(horas)

salario <- horas * valor

escreval("")
escreval("|---------------------------|")
escreval("| Voce recebera ", salario, "!      |")
escreval("|---------------------------|")


Fimalgoritmo