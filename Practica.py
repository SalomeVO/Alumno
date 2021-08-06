# Tipos de datos
"""
cadena_de_texto = "Hola Mundo"
print(cadena_de_texto)
print(type(cadena_de_texto))

primer_num = 10
segundo_num = 5

print(primer_num)
print(type(primer_num))

tercer_num = 10.5
print(tercer_num)
print(type(tercer_num))
"""
# Operadores aritmeticos
"""
primer_num = 80 #2.5 #15
seg_num = 4 #2 #10
print(primer_num + seg_num)
print(primer_num - seg_num)

result= primer_num + seg_num
print(result)

resuMulti = primer_num * seg_num
print(resuMulti)

exponente = primer_num ** seg_num #Elevar un numero
print(exponente)

Division = primer_num // seg_num
print(Division)

Rediv = primer_num % seg_num
print(Rediv, "resuido de una division")
"""
# Listas/vectores
"""
lista= [10, True, "cadena de texto", [1, 2, "cadena de texto en una lista anidada"]]

elemento_seleccionado = lista[2] #acceder a una lista
#print(elemento_seleccionado)

elemento_seleccionado = lista[3][2] #para acceder a una lista anidada
#print(elemento_seleccionado)

lista[0] = 50
elemento_seleccionado = lista[3] #cambiar elementos de una lista
#print(elemento_seleccionado)

elemento_seleccionado = lista[0:3] #como excel muestra de un punto  otro. No muestra la ultima posicion que se coloca
#print(elemento_seleccionado)

elemento_seleccionado = lista[3][0:2] #igual como excel pero con lista anidada
#print(elemento_seleccionado)

elemento_seleccionado = lista[-1] #para visualizar de derecha a izquier
#print(elemento_seleccionado)

elemento_seleccionado = lista[1:] #como excel pero no muestra la posicion que seleccionas primero
print(elemento_seleccionado)
"""
# Colecciones/Tuplas
"""
tupla=(1, 2, "cadena de texto")

elementoSelec = tupla[2]
#print(elementoSelec)

tupla2= 3, 4, "texto" #otra forma de declarar una tupla
elementoSelec = tupla2[2]
#print(elementoSelec)

#print(type(tupla2))

tupla3 = (22,) #se agrega coma para que el type cmprenda que es una tupla de unico elemento
print(type(tupla3))
"""
# colecciones/Diccionarios
"""
lenguaje_progra = {"a": "Python", "b": "Java", "c": "PHP"}
#print(lenguaje_progra ["b"])

lenguaje_progra["c"] = "Javascrip"
print(lenguaje_progra ["c"])
"""
# Estructuras de control/condicional
"""
lenguaje_pro = "Python2"

if lenguaje_pro == "Python":
    print("Excelente elecccion")

elif lenguaje_pro == "Python2":
    print("segunda oportunidad")

else:
    print("Te lo recomiendo")

print("Mensaje fuera de la setencia if")
"""
# Ciclos
# While
"""contador = 1
limite = 5

while contador <= limite:
    print("Se imprime el mensaje = " + str(contador))
    contador += 1
print("saliste del ciclo")

condicion = True
indice = 0

while condicion:
    if indice <= 5:
        print("se imprime un mensaje = " + str(indice))
        indice += 1
    else:
        print("\nHaz llegado al indice maximo, fn del ciclo")
        break
print("\nSaliste del ciclo")"""
# for
"""for i in range(10):
    if i < 5:
        print("Se imprime mensaje con indice menor que cinco = " + str(i))
    elif i > 5:
        print("Se imprime mensaje con inide mayor que cinco = " + str(i))

    else:
        print("Se imprime mensaje con indice diferente")

print("saliste del ciclo")"""
# for 2
"""secuencia = ["elemento 1", "elemento 2", "elemento 3"]

for elemento in  secuencia:
    print("Se imprime " + elemento)
    
print("saliste del for")"""

# Metodo sin parametros
"""def saludar():
    print("Saludos desde el primer metodo con Python")
saludar()"""

"""def sumar():
    num_1 = 10
    num_2 = 20
    resultado = num_1 + num_2
    return resultado


print(sumar())"""

"""def sumar(num_1, num_2):
    resultado = num_1 + num_2
    return resultado


print(sumar(100, 200))"""
