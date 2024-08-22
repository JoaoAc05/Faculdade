def bubble_sort_string(s):
    string_list = list(s)

    for i in range(len(string_list)):
        for j in range(0, len(string_list)-i-1):
            if string_list[j] > string_list[j+1]:
                string_list[j], string_list[j+1] = string_list[j+1], string_list[j]

    return ''.join(string_list)

def main():
    input_string = input("Digite uma string: ")
    resultado = bubble_sort_string(input_string)

    print("String ordenada:", resultado)

if __name__ == "__main__":
    main()