#João Alves Cordeiro
def Fatorial_Multiplo():
    try:
        Entrada = int(input("Realizar o fatorial de um número? \n 1 - Sim, 0 - Não \n"))

        while Entrada == 1:
            fatorial = int(input("Insira um número para fatorar: "))

            while fatorial > 16:
                print("Insira um número inferior a 16")
                fatorial = int(input("Insira um número para fatorar: "))

            n = fatorial
            i = fatorial

            if i > 1: i = fatorial - 1

            atu = 0

            while i >= 1:
                atu = fatorial * i
                fatorial = atu
                i -= 1

            print(f"O fatorial de {n} é {atu}")
            Entrada = int(input("Fazer o fatorial de mais um número? \n 1 - yes, 0 - no \n"))

        print("Acabou!")
    except ValueError:
        print("Número inserido é invalido")


Fatorial_Multiplo()
