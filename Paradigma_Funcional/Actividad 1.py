# El sistema de recursos humanos de una empresa tiene representados a los empleados con los siguientes datos: 
# rol -> string 
# edad -> int 
# tareas -> string 
# Se debe realizar una función para conocer , a partir de un conjunto de empleados , cuáles son los atareados. 
# Se considera el rol de atareado cuando la persona con dicho rol realiza dos tareas o más.

# 1.- Define los atareados mediante el filtro de la cantidad de tareas
def definirAtareados(listaEmpleados: list):
    return list(filter(lambda x: len(str(x[2]).split(" ")) > 1, listaEmpleados))
# Crea la lista de empleados
listOf_Empleados = [
    ["Administrador", 34, "tarea1 tarea2 tarea3"],
    ["Gerente", 40, "tarea1"]
]
# Imprime los vectores 
print(definirAtareados(listOf_Empleados))