#Solicite ao usuário que insira um número e determine se ele é primo ou não. Um número primo aquele que é divisível apenas por 1 e por ele mesmo.
#João Alves Cordeiro

numero = int(input("Digite um número para verificar se é primo: "))

#function primo(numero)
def primo(numero):
#Peneira de verificação Simples
    if numero <= 1:
        return False
    elif numero <= 3:
        return True
    elif numero % 2 == 0 or numero % 3 == 0:
        return False
    
#Peneira de Eratóstenes otimizada
    i = 5
    while i * i <= numero:
        if numero % i == 0 or numero % (i + 2) == 0:
            return False
        i += 6
    return True

#Se primo(numero == true)
if primo(numero):
    print(f"{numero} é primo")
else:
    print(f"{numero} não é primo")