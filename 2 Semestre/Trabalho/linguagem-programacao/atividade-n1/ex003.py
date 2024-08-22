#Crie um programa que solicite ao usuário três notas e calcule a mídia. Com base na mídia, informe se o aluno foi aprovado ou reprovado (considerando a alteração 7 como critério de aprovação
#João Alves Cordeiro

nota1 = float(input("Digite a primeira nota: "))
nota2 = float(input("Digite a segunda nota: "))
nota3 = float(input("Digite a terceira nota: "))

media = (nota1 + nota2 + nota3) / 3

if media >= 7:
    print(f"Média: {media} - Aprovado")
else:
    print(f"Média: {media} - Reprovado")