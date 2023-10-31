#João Alves Cordeiro
def Lista_numeros():
    try:
        Entrada = int(input("O número ira entrar na tabela? \n 1 - vai, 0 - não vai \n"))
        tabela = []
        while Entrada != 1 & Entrada != 0:
            Entrada = int(input("Valor inserido é invalido. \n 1 - vai, 0 - não vai \n"))

        while Entrada == 1:
            n = float(input("Insira o valr: "))
            tabela.append(n)
            Entrada = int(input("A tabela vai ter mais valores? \n 1 - vai, 0 - não vai \n"))
            while Entrada != 1 & Entrada != 0:
                Entrada = int(input("Valor inserido é invalido. \n 1 - vai, 0 - não vai \n"))
        tabela.sort()
        sum = 0
        for numb in tabela:
            sum += numb

        print(f"O maior número inserido foi:  {tabela[len(tabela) - 1]}")
        print(f"O menor número inserido foi:  {tabela[0]}")
        print(f"A soma entre os valores inseridos é:  {sum}")

    except ValueError:
        print("Valor inserido é invalido.")

Lista_numeros()
