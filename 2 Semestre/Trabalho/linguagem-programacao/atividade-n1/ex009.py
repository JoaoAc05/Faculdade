#Peça ao usuário para inserir um ano e determine se esse ano é bissexto ou não. Um ano é bissexto se for divisível por 4, mas não divisível por 100, a menos que também seja divisível por 400.
#João Alves Cordeiro

ano = int(input("Insiria um ano para verificar se é bissexto: "))
if (ano % 4 == 0 and ano % 100 != 0) or (ano % 400 == 0):
    print(f"O ano {ano} é bissexto")
else:
    print(f"O ano {ano} não é bissexto")