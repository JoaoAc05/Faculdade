#Crie um programa que permita ao usuário calcular juros simples. Peça ao usuário para inserir o valor principal, a taxa de juros anuais e o período de tempo em anos. Calcular e exiba o valor total após o período especificado.
#João Alves Cordeiro

vlr_ini = int(input("Insira o valor inicial: "))

taxa = int(input("Insira a taxa de juros anual: "))

temp = int(input("Insira o período em anos: "))

vlr_tot = (vlr_ini * taxa) * temp
print(f"O valor total é: {vlr_tot}")