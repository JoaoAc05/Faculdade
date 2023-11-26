def ordenar_selecao_por_tamanho(nomes):
    for i in range(len(nomes)):
        menor_indice = min(range(i, len(nomes)), key=len)
        nomes[i], nomes[menor_indice] = nomes[menor_indice], nomes[i]

def main():
    n = int(input("Quantidade de nomes: "))
    nomes = [input("Digite um nome: ") for _ in range(n)]

    ordenar_selecao_por_tamanho(nomes)

    print("\nNomes ordenados por tamanho:")
    for nome in nomes:
        print(nome)

if __name__ == "__main__":
    main()