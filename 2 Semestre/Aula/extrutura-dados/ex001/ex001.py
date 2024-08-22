#Sintaxe Python

def ex001():
    lista1 = ["maça", "banana", "cereja"]
    print(lista1)                       #Exibe todos elementos do array
    print(len(lista1))                  #Exibe a quantidade de elementos do array
    print(lista1[1])                    #Exibe apenas o elemento na posição 1

def ex002():
    lista1 = ["maça", "banana", "cereja"]
    if "maça" in lista1:
        print("ok")
    else:
        print("limao")

def ex003():
    lista1 = ["maça", "banana", "cereja"]
    lista1[1] = "limao"                 #Substitui o valor da posição 1 por "limão"
    lista1.append("laranja")            #Acrescenta ao fim da lista "laranja"
    print(lista1)

def ex004():
    lista1 = ["maça", "banana", "cereja"]
    lista1.insert(1, "limao")            #Coloca o valor na posição 1 e o restante é empurrado para frente
    print(lista1)

def ex005():
    lista1 = ["maça", "banana", "cereja"]
    lista2 = ["manga", "pera", "abacaxi"]
    lista1.extend(lista2)
    print(lista1)

def ex006():
    lista1 = ["maça", "banana", "cereja", "melão", "uva"]
    lista2 = ["manga", "pera", "abacaxi"]
    lista1.remove("banana")             #Remove o valor "banana"
    print(lista1)
    lista1.pop(0)                       #Remove o valor encontrado no índice 0
    print(lista1)
    lista1.pop()                        #Remove o ultimo valor da lista
    print(lista1)
    del lista1[2]                       #Remove o valor encontrado no índice 2
    print(lista1)
    del lista2                          #Apaga a váriavel
    print(lista2)
    lista1.clear()                      #Apaga todos os valores dentro da variavel
    print(lista1)

def ex007():
    lista1 = ["maça", "banana", "cereja", "melão", "uva"]
    for x in lista1:                    #Forma de exibir todos os valores contidos no array
        print(x)

    for i in range(len(lista1)):        #Forma de exibir todos os valores por índice contidos no array
        print(lista1[i])

def ex008():
    lista1 = ["maça", "banana", "cereja", "melão", "uva"]
    i=0
    while i <= len(lista1):             #Exibir todos valores com extrutura While
        print(lista1[i])
        i += 1

def ex009():
    lista1 = ["maça", "banana", "cereja", "melão", "uva"]
    lista1.sort()                       #Organizar por ordem alfabetica ou crescente 
    print(lista1)
    lista1.sort(reverse=True)           #Organizar de forma decrescente 
    print(lista1)

def ex010():
    li1=["a", "b", "c"]
    li2=[1, 2, 3]
    li3= li1+li2
    print(li3)

def ex011():
    li1=["a", "b", "c"]
    li2=[1, 2, 3, 4, 5, 6, 7, 2]
    for x in li2:
        li1.append(x)
        print(li1)

def ex012():
    li1=["a", "b", "c"]
    li2=[1, 2, 3, 4, 5, 6, 7, 2]
    li1.extend(li2)
    print(li1)

def ex013():
    l1=[0,1,2]
    l2=[1,2,3]
    l3=[]
    for i in range(len(l1)):
        l3.append(l1[i]+l2[i])
        print(l3)