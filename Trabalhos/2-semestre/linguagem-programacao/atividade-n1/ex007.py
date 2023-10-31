#Crie um jogo em que o programa escolha um número aleatório entre 1 e 100, e o usuário deve adivinhar qual é o número. Dê dicas ao usuário sobre se o número é maior ou menor até que ele acerte
#João Alves Cordeiro

import random

#Selecionar um número aleatório limitado de 1 até 100
numero = random.randint(1, 100)

acerto = False
tentativa = 0
print("Tente acertar o número de 1 até 100")

#Enquanto o usuario não acertar
while not acerto:
    tentativa += 1 
    chute = int(input("De um chute: "))

    if chute < numero:
        print("O número é maior")
    elif chute > numero:
        print("O número é menor")
    else:
        acerto = True
        print(f"Você acertou com {tentativa} tentativas, o número era {numero}")
    