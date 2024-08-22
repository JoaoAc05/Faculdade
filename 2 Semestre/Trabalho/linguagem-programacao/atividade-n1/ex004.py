#Peça ao usuário para inserir um número e, em seguida, mostre a tabuada desse número de 1 a 10.
#João Alves Cordeiro

numero = int(input("Digite um número para ser exibido sua tabuada: "))
for i in range(0, 11):
    resultado = numero * i
    print(f"{numero} x {i} = {resultado}")