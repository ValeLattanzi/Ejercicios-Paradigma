# Dada una lista, crear una función que devuelva la misma sin los elementos repetidos. 
# Los elementos tienen que aparecer en el mismo orden que en la lista original.

def quitarRepeticiones(listOf_Input: list, i: int = 0, _listOf_Return: list = []):
    if listOf_Input[i] not in _listOf_Return:
        _listOf_Return.append(listOf_Input[i])
    i += 1
    if len(listOf_Input) == i:
        return print(_listOf_Return)
    quitarRepeticiones(listOf_Input, i, _listOf_Return)

listOf_Input = ["a", "b", "c", "a", "b", "d", "e", "c", 1, 5, 3, 5]
quitarRepeticiones(listOf_Input)