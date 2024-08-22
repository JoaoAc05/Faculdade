def ex001():
    idade = 30
    dias = idade * 365.25
    print(dias)

def ex002():
    vlr = 149
    for i in range(0, 10, 1):
        print(vlr * i)
        i+1

def ex003():
    dolar = 50
    real = 4.99
    calculo = (dolar * real)
    print(calculo)

def ex004():
    n1 = 9.8
    n2 = 7.3
    n3 = 4.6
    notaF = (n1 + n2 + n3)/3
    if notaF >= 7.0:
        print("aprovado")
    else:
        print("reprovado")

def ex005():
    C = 36.8
    F = (C * 9 / 5)+32
    print(F)

def ex006():
    soma = 0
    precipitacoes = [39.99, 77.65, 8.09, 63.86, 98.43, 11.14, 41.63]
    dias= len(precipitacoes)
    for i in range(len(precipitacoes)):
        soma += precipitacoes[i]
    media = soma / dias
    print(media)
    print(soma)

def ex006a():
    soma=0
    precipitacoes=[39.99, 77.65, 8.09, 63.86, 98.43, 11.14, 41.63]
    dias = len(precipitacoes)
    for precipitacao in precipitacoes:
        soma += precipitacao
    media = soma/dias
    print(media)
    print(soma)

def ex006b():
    soma=0
    precipitacoes=[39.99, 77.65, 8.09, 63.86, 98.43, 11.14, 41.63]
    dias = len(precipitacoes)
    media = soma/dias
    print(media)
    print(sum(precipitacoes))

def ex007():
    import math
    Area=(math.pi*math.pow(5,2))
    print(Area)