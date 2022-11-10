# Escribir un programa que permita al usuario obtener un identificador 
# para cada uno de los socios de un club. 
# Para eso ingresará nombre completo y número de DNI de cada socio, 
# indicando que finalizará el procesamiento mediante el ingreso de un nombre vacío. 
# Precondición: el formato del nombre de los socios será: nombre apellido. 
# Podría ingresar más de un nombre, en cuyo caso será: nombre1 nombre2 apellido. 
# Si un socio tuviera más de un apellido, el usuario sólo ingresará uno. 
# Se debe validar que el número de DNI tenga 7 u 8 dígitos. 
# En caso contrario, el programa debe dejar al usuario en un bucle hasta que ingrese un DNI correcto. 
# Por cada socio se debe imprimir su identificador único, 
# el cual estará formado por: 
# el primer nombre, la cantidad de letras del apellido y los primeros 3 dígitos de su DNI.

def obtenerIdentificador(listOf_Socios: list, i: int = 0):
    if listOf_Socios[i][0] == "":
        exit("El programa finalizó.")
    else:
        # En caso de que el dni este mal ingresado
        if len(listOf_Socios[i][1]) < 7 or len(listOf_Socios[i][1]) > 8:
            # Se ejecuta recursividad de esta misma funcion
            obtenerIdentificador(listOf_Socios[i][0], str(input("Ingrese el DNI nuevamente: ")))
        else:
            print(list(listOf_Socios[i][0].split(" "))[0] + # Obtiene el primer nombre
                # Obtiene la cantidad de letras del apellido
                str(len(list(listOf_Socios[i][0].split(" "))[len(list(listOf_Socios[i][0].split(" "))) - 1])) + 
                # Obtiene los primeros tres digitos del dni
                listOf_Socios[i][1][0 : 3])
    i += 1
    if len(listOf_Socios) == i:
        exit()
    obtenerIdentificador(listOf_Socios, i)

listOf_Socios = []
cantidadSocios = int(input("Ingrese la cantidad de socios: "))
for fila in range(cantidadSocios):
    listOf_Input = [input("Ingrese el nombre del socio: "), input("Ingrese el numero de documento: ")]
    listOf_Socios.append(listOf_Input)

obtenerIdentificador(listOf_Socios)