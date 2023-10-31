#João Alves Cordeiro
def Fibonacci():
    try:

        atu = 1
        ant = 0
        prox = 0

        while prox < 500:
            prox = atu + ant

            ant = prox - ant
            atu = prox

            print(prox)

    except ValueError:
        print("Insira um número valido")

Fibonacci()
