
archivo = open('prueba.txt', 'r', encoding= 'UTF-8') # las letras son r, a, w, x
#print(archivo.read())
#print(archivo.read(11))
#print(archivo.read(15)) #continúa desde la línea anterior
#print(archivo.readline()) #solo lee la primer línea
#print(archivo.readline()) #ahora lee la segunda linea

#Vamos a iterar el archivo, cada una de las líneas
#for linea in archivo:
    #print(linea) iteramos todos los elementos del archivo
#print(archivo.readlines(3)) #accedemos al archivo como si fuera una lista

#Anexamos información, copiamos a otro
archivo2 = open('copia.txt', 'a', encoding='UTF-8') #cambiamos a por w para que no se repita la copia del archivo en cada ejecución
archivo2.write(archivo.read())
archivo.close() #cerramos el primer archivo
archivo2.close() #cerramos el segundo archivo

print('Se ha terminado el preoceso de leer y copiar archivos')

