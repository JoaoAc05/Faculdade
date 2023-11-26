def quick_sort_string(s):
    if len(s) <= 1:
        return s

    pivo = s[len(s) // 2]
    menores = [x for x in s if x < pivo]
    iguais = [x for x in s if x == pivo]
    maiores = [x for x in s if x > pivo]

    return quick_sort_string(menores) + iguais + quick_sort_string(maiores)

def main():
    input_string = input("Digite uma string: ")
    resultado = quick_sort_string(input_string)

    print("String ordenada:", ''.join(resultado))

if __name__ == "__main__":
    main()