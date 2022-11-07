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

def obtenerIdentificador(nombreCompleto: str, dni: str):
    if nombreCompleto == "":
        exit("El programa finalizó.")
    else:
        # En caso de que el dni este mal ingresado
        if len(dni) < 7 or len(dni) > 8:
            # Se ejecuta recursividad de esta misma funcion
            obtenerIdentificador(nombreCompleto, str(input("Ingrese el DNI nuevamente: ")))
        else:
            print(list(nombreCompleto.split(" "))[0] + # Obtiene el primer nombre
                # Obtiene la cantidad de letras del apellido
                str(len(list(nombreCompleto.split(" "))[len(list(nombreCompleto.split(" "))) - 1])) + 
                # Obtiene los primeros tres digitos del dni
                dni[0 : 3])

obtenerIdentificador("Valentino Lattanzi", "448992")