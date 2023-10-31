algoritmo  "calculadoda_temp_caso"

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
escolha temp
        caso 1
             Escreval("Qual a temperatura Celsius?")
             leia(celsius)
             fahrenheit <- (celsius*1.8) + 32
             kelvin <- (celsius + 273)
             limpatela
             escreval(" A temperatura em Celsius é: ", celsius)
             escreval(" A temperatura em Fahrenheit é: ", fahrenheit)
             escreval(" A temperatura em Kelvin é: ", kelvin)
        caso 2
           Escreval("Qual a temperatura em fahrenheit? ")
           Leia(fahrenheit)
           celsius <- (fahrenheit - 32) / 1.8
           kelvin <- celsius + 273
           limpatela
           escreval(" A temperatura em Fahrenheit é: ", fahrenheit)
           escreval(" A temperatura em Celsius é: ", celsius)
           escreval(" A temperatura em Kelvin é: ", kelvin)
        caso 3
           escreval("Qual a temperatura em Kelvin? ")
           Leia(kelvin)
           celsius <- kelvin - 273
           fahrenheit <- (celsius * 1.8) + 32
           limpatela
           Escreval(" Sua temperatura em Kelvin é: ", kelvin)
           Escreval(" Sua temperatura em Celsius é: ", celsius)
           Escreval(" Sua temperatura em Fahrenheit é: ", fahrenheit)

fimescolha
Fimalgoritmo