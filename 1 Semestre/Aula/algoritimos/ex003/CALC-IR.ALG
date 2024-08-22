Algoritmo "Calc-IR"
// Disciplina   : [Algoritimo]
// Professor   : Elizeu
// Descrição   : Culculo Imposto de Renda
// Data atual  : 03/05/2023
Var

salario, dif1, dif2, dif3, dif4, imposto1, imposto2, imposto3, imposto4 : real
soma_i : real


Inicio
escreval("Qual seu salario?")
leia(salario)

//Alíquota de Isenção IR Maio 2023
//Parâmetros
// salario < 2112,00 Isento
// salario >= 2112,01 e salario <=2826,65 7,50%
// salario >= 2826,66 e salario <= 3751,05 15%
// salario >=3751,06 e salario <= 4664,68 22,5%
// salario > 4664,68 27,50%

se (salario<2112.00) entao
   escreval("Isento de Impostos")
senao
    se (salario>=2112.01) e (salario<=2826.65)entao
    //calculo de imposto
    dif1 <- salario - 2112.00
    imposto1 <- dif1*0.075
    //Saída de resultado
    escreval("O imposto a pagar é: R$", imposto1)
    senao
         se (salario >= 2826.66) e (salario <= 3751.05) entao
         //calculo de imposto
         dif1 <- 714.64
         dif2 <- salario - 2826.65
         imposto1 <- dif1*0.075
         imposto2 <- dif2*0.15
         soma_i <- imposto1 + imposto2
         //Saída de resultado
         escreval(" Seu Salario é :", salario)
         escreval(" primeiro imposto é relativo a 7,50% de R$", dif1)
         escreval(" segundo imposto é relativo a 15% de R$", dif2)
         escreval(" 1 Imposto: ", imposto1)
         escreval(" 2 Imposto: ", imposto2)
         escreval("Total de Impostos: ", soma_i)
         senao
              se (salario >=3751.06) e (salario <= 4664.68) entao
              //calculo de imposto
              dif1 <- 714.64
              dif2 <- 924.39
              dif3 <- salario -  3751.05
              imposto1 <- dif1*0.075
              imposto2 <- dif2*0.15
              imposto3 <- dif3*0.225
              soma_i <- imposto1 + imposto2 + imposto3
              //Saída de resultado
              escreval(" Seu Salario é :", salario)
              escreval(" primeiro imposto é relativo a 7,50% de R$", dif1)
              escreval(" segundo imposto é relativo a 15% de R$", dif2)
              escreval(" terceiro imposto é relativo a 22,5% R$", dif3)
              escreval(" 1 Imposto: ", imposto1)
              escreval(" 2 Imposto: ", imposto2)
              escreval(" 3 Imposto: ", imposto3)
              escreval("Total de Impostos: ", soma_i)
              senao
                   //calculo de imposto
                   dif1 <- 714.64
                   dif2 <- 924.39
                   dif3 <- 913.62
                   dif4 <- salario - 4664.68
                   imposto1 <- dif1*0.075
                   imposto2 <- dif2*0.15
                   imposto3 <- dif3*0.225
                   imposto4 <- dif4*0.275
                   soma_i <- imposto1 + imposto2 + imposto3 + imposto4
                   //Saída de resultado
                   escreval(" Seu Salario é :", salario)
                   escreval(" primeiro imposto é relativo a 7,50% de R$", dif1)
                   escreval(" segundo imposto é relativo a 15% de R$", dif2)
                   escreval(" terceiro imposto é relativo a 22,5% de R$", dif3)
                   escreval(" quarto imposto é relativo a 27,50%de R$", dif4)
                   escreval(" 1 Imposto: ", imposto1)
                   escreval(" 2 Imposto: ", imposto2)
                   escreval(" 3 Imposto: ", imposto3)
                   escreval(" 4 Imposto: ", imposto4)
                   escreval(" Total de Impostos: ", soma_i)

              fimse
         fimse
    fimse
fimse

Fimalgoritmo