from prettytable import PrettyTable

# Criar uma tabela
tabela = PrettyTable()
tabela.field_names = ["Aspecto", "Bubble Sort", "Merge Sort", "Quick Sort"]

# Adicionar dados à tabela
tabela.add_row(["Número de comparações", "Melhor: n", "Melhor, Pior, Caso Médio: n * log(n)", "Melhor: n * log(n), Pior: n * (n-1)/2, Caso Médio: n * log(n)"])
tabela.add_row(["Número de movimentações", "Melhor: 0, Pior, Caso Médio: 3 * n * (n-1)/2", "Melhor, Pior, Caso Médio: 2n * log(n)", "Melhor, Pior, Caso Médio: 2n * log(n)"])
tabela.add_row(["Facilidade de implementação", "Fácil", "Moderadamente complexo", "Moderadamente complexo"])
tabela.add_row(["Estabilidade", "Estável", "Estável", "Não estável"])
tabela.add_row(["Uso de memória auxiliar", "O(1)", "O(n)", "O(log n)"])

# Exibir a tabela
print(tabela)