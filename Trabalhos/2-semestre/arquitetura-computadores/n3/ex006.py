def merge3_sort(arr1, arr2, arr3):
    result = sorted(arr1 + arr2 + arr3)
    return result

arr1 = [1, 4, 7, 10]
arr2 = [2, 5, 8, 11]
arr3 = [3, 6, 9, 12]

resultado_ordenado = merge3_sort(arr1, arr2, arr3)
print("Vetor resultante ordenado:", resultado_ordenado)