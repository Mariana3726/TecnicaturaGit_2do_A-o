from NumerosIgualesException import NumerosIgualesException

resultado = None #la variable tiene q ser global, para que se muestre el resultdo del bloque

try:
    a = int(input('Ingrese el primer número: '))
    b = int(input('Ingres el segundo número: '))
    if a == b:
        raise NumerosIgualesException('Son números iguales') #raise provoca un error a propósito
    resultado = a / b #modificamos
except TypeError as e:
    print(f'Type of error - Ocurrió un error: {type(e)}')
except ZeroDivisionError as e:
    print(f'ZeroDivisionError - Ocurrió un error: {type(e)}')
except Exception as e:  #el exception siempre va al final de los demás tipos de excepciones
    print(f'Exception - Ocurrió un error: {type(e)}')

#bloque else, solo se ejecuta sino se ha lanzado ninguna excepción
else:
    print('No se arrojó ninguna excepción')
#finally siempre se ejecuta
finally:
    print('Ejecución de este bloque Finally')

print(f'El resultado es: {resultado}')
print('seguimos...') #no hay error, y si hay, continúa ejecutándose el programa