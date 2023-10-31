#Crie um programa que peça ao usuário para inserir cinco números em uma lista. Em seguida, calcule a soma eamédia desses números e exiba os resultados.
#João Alves Cordeiro

user_input = input("Insira 5 números separados por vírgulas: ")

lista_strings = user_input.split(',')
lista_inteiros = []

for i in lista_strings:
    lista_inteiros.append(int(i))

SOMA = 0
for i in lista_inteiros:
    SOMA += i

media = SOMA / 5

print(f'A soma dos números é: {SOMA}')
print(f'A média dos números é: {media}')
