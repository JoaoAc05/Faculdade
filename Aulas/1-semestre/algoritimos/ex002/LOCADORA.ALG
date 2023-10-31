Algoritmo "Locadora"
// Disciplina   : Introdução a Algoritimos e Programação
// Professor   : Elizeu

// Descrição   : Uma locadora aluga seus carros com uma taxa fixa por dia e uma taxa por quilômetro
//(km) rodado. Escreva um algoritmo que leia a taxa fixa por dia, a taxa por km rodado, o
//número de dias, o número de quilômetros rodados e calcule o valor total do aluguel
//considerando que a locadora está com uma promoção de 10% de desconto na taxa fixa
//por dia.

// Autor(a)    : João Alves Cordeiro
// Data atual  : 19/04/2023

//atualizacao dia 03/05/2033
//filtro de promocao - ate 2 dias = 10% apartir de 3 dias = 20%
Var
   txfx, txkm, dias, kms, diastt, kmstt, total, promo : real

Inicio
escreval("Muito obrigado por alugar um carro conosco! A Onix Car agradece!")
escreval("A taxa fixa pelo aluguel diario é R$100,00")
escreval("A taxa fixa por quilômetros é R$10,00")
escreval("------------------------------------------------------------------")
escreval("Promoção da Semana: - 10% na taxa diária até 2 dias")
escreval("Apartir de 3 dias ganha 20% de desconto na taxa diária")
escreval("")
escreval("")
txfx <- 100
txkm <- 10
escreval("Quantos dias você permaneceu com o carro?")
leia(dias)
escreval("Quantos Km's foram rodados?")
leia(kms)

diastt <- dias*txfx
se (dias <= 2) entao
  promo <- (diastt*0.1)
senao
  promo <- (diastt*0.2)
fimse

kmstt <- kms * txkm
total <- (diastt - promo) + kmstt
limpatela
escreval("Você tera que pagar um total de", total,"!")
escreval("Por ", dias, " dias utilizados e ", kms, " Km's rodados!")
escreval("Total Dias: ", (diastt - promo))
escreval("Total Km's: ", kmstt)

Fimalgoritmo