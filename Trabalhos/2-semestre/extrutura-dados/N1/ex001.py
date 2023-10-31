#João Alves Cordeiro
def Fibonacci():
    try:
        posicao = int(input("Insira a posição para para a sequencia de Fibonacci"))

        i = 0

        atu = 1
        ant = 0

        while i < posicao:
            prox = atu + ant

            ant = prox - ant
            atu = prox

            i += 1

            print(prox)

    except ValueError:
        print("Insira um número valido")

Fibonacci()
