# Creamos una variable

try:
    archivo = open('prueba.txt', 'w', encoding= 'UTF-8' ) #La W es write
    archivo.write('Programamos con diferentes tipos de archivo, ahora con .txt\n')
    archivo.write('Los acentos son importantes en las palabras\n')
    archivo.write('Como por ejemplo: acción, ejecución, programación\n')
    archivo.write('Las letras son:\n r read,\n a append,\n w write,\n x crea un archivo')
    archivo.write('\n t text, \n b binarios(imágenes, videos,etc), \n w+ y r+ leen y escriben')
    archivo.write('Saludos a todos')
    archivo.write('\n Con esto terminamos.')
except Exception as e:
    print(e)
finally: #siempre se ejecuta
    archivo.close() #con esto se debe cerrar el archivo siempre, aunque haya error
# archivo.write('Todo quedó perfecto') salta error porque el archivo ya está cerrado con finally