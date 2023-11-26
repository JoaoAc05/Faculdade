def ordenar_insercao(lista):
    for i in range(1, len(lista)):
        chave = lista[i]
        j = i - 1
        while j >= 0 and chave < lista[j]:
            lista[j + 1] = lista[j]
            j -= 1
        lista[j + 1] = chave

def main():
    n = int(input("Quantidade de nomes: "))
    nomes = []

    for i in range(n):
        nome = input("Digite um nome: ")
        nomes.append(nome)

    ordenar_insercao(nomes)

    print("\nNomes ordenados:")
    for nome in nomes:
        print(nome)

if __name__ == "__main__":
    main()