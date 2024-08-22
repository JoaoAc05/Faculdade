#João Alves Cordeiro
def Fator():
    try:
        Valor = int(input("Insira um numero para ser realizado o seu fatorial: "))
        n = Valor

        i = Valor - 1
        nmr = 0

        while i >= 1:
            nmr = Valor * i
            Valor = nmr
            i -= 1

        print(f"O fatorial do número: {n} é {nmr}")

    except ValueError:
        print("O número inserido é maior que 16.")


Fator()
