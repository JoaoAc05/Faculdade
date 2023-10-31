algoritmo  "calculadoda_temp_se"

var
temp, celsius, fahrenheit, kelvin: real

Inicio
Escreval("Em qual medida de temperatura você irá entrar com valor")
Escreval("---------------------------")
Escreval(" Celsius [1]")
Escreval("Fahrenheit [2]")
Escreval("Kelvin [3]")
Escreval("---------------------------")
Leia(temp)
Se (temp = 1) entao
   Escreval("Qual a temperatura Celsius?")
   leia(celsius)
   fahrenheit <- (celsius*1.8) + 32
   kelvin <- (celsius + 273)
   limpatela
   escreval(" A temperatura em Celsius é: ", celsius)
   escreval(" A temperatura em Fahrenheit é: ", fahrenheit)
   escreval(" A temperatura em Kelvin é: ", kelvin)
Senao
   Se (temp = 2) entao
      Escreval("Qual a temperatura em fahrenheit? ")
      Leia(fahrenheit)
      celsius <- (farenheit - 32) / 1.8
      kelvin <- celsius + 273
      limpatela
      escreval(" A temperatura em Fahrenheit é: ", fahrenheit)
   escreval(" A temperatura em Celsius é: ", celsius)
   escreval(" A temperatura em Kelvin é: ", kelvin)
   Senao
        Se (temp = 3) entao
        escreval("Qual a temperatura em Kelvin? ")
        Leia(kelvin)
        celsius <- kelvin - 273
        fahrenheit <- (celsius * 1.8) + 32
        limpatela
        Escreval(" Sua temperatura em Kelvin é: ", kelvin)
        Escreval(" Sua temperatura em Celsius é: ", celsius)
        Escreval(" Sua temperatura em Fahrenheit é: ", fahrenheit)
        senao
             escreval("Você colocou um valor invalido!! Reinicie o processo.")
        fimse
   fimse
fimse
Fimalgoritmo