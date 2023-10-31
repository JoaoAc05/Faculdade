#Crie um programa que permita ao usuário realizar operações de adição, subtração, multiplicação e divisão com dois números. Peça ao usuário para escolher a operação desejada e exiba o resultado.
#João Alves Cordeiro

n1 = input("Digite o primeiro número: ")
n2 = input("Digite o segundo número: ")
operacao = input("Para somar digite 1, para subtrair digite 2, para multiplicar digite 3, para dividir digite 4.")
if  operacao < 1 or operacao > 4:
    print("O número digitado é invalido por favor refaça!")
elif operacao == 1:
    print(f"A soma entre {n1} e {n2} resulta em {n1 + n2}")
elif operacao == 2:
    print(f"A subtração entre {n1} e {n2} resulta em {n1 - n2}")
elif operacao == 3:
    print(f"A multiplicação entre {n1} e {n2} resulta em {n1 * n2}")
else:
    print(f"A divisão entre {n1} e {n2} resulta em {n1 / n2}")