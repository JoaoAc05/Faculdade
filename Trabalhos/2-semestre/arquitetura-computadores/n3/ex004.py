def heapify(arr, n, i):
    maior, esquerda, direita = i, 2 * i + 1, 2 * i + 2
    maior = max(esquerda, direita, key=lambda x: arr[x] if x < n else -1)
    
    if maior != i:
        arr[i], arr[maior] = arr[maior], arr[i]
        heapify(arr, n, maior)

def heap_sort(arr):
    n = len(arr)

    for i in range(n // 2 - 1, -1, -1):
        heapify(arr, n, i)

    for i in range(n - 1, 0, -1):
        arr[i], arr[0] = arr[0], arr[i]
        heapify(arr, i, 0)

def main():
    nomes = [input("Digite um nome: ") for _ in range(int(input("Quantidade de nomes: ")))]
    heap_sort(nomes)

    print("\nNomes ordenados por tamanho:")
    print(*nomes, sep='\n')

if __name__ == "__main__":
    main()