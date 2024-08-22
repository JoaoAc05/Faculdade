#Peça ao usuário para inserir um número e, em seguida, determine se está no número par ou ́ımpar. Exiba uma mensagem correspondente.
#João Alves Cordeiro

numero = int(input("Digite um numero para verificar se é par ou impar: "))

if numero % 2 == 0:
    print(f"O número {numero} é par")
else:
    print(f"O número {numero} é impar")