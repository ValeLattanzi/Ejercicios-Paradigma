# Dado el siguiente enunciado, 
# describir si el algoritmo propuesto funciona de forma: 
# a- correcta 
# b- parcialmente correcta 
# c- incorrecta 
# En caso de responder por las opciones b o c, detallar los errores encontrados.

# Escribir la función titulo(), 
# la cual recibe un string y lo retorna convirtiendo la primera letra de cada palabra a mayúscula 
# y las demás letras a minúscula, dejando inalterados los demás caracteres.

def Titulo(texto: str,  i: int = 0):
    texto = list(texto)
    texto[0] = texto[0].upper() 
    # 1.- Verifica si se recorrieron todas los caracteres
    if len(texto) > i and (texto[i - 1] == " "):
        # En caso de iniciar una palabra lo vuelve mayuscula
        texto[i] = texto[i].upper()
    elif len(texto) < i:
        return print("".join(texto))
    i += 1
    Titulo(texto, i)

titulo = "hola que hace papa frita terrible salchicha sos"
Titulo(titulo)