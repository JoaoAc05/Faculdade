#Crie um programa que permita ao usuário converter temperaturas de Celsius para Fahrenheit. A fórmula utilizada deve ser: (temp celsius * 9/5) + 32
#João Alves Cordeiro

tmp_c = int(input("Insira uma temperatura em Celcius para conversão para fahrenheit: "))

tmp_f = (tmp_c * 9/5) + 32

print(f"{tmp_c} graus Celcius é igual a {tmp_f} graus Fahrenheit")