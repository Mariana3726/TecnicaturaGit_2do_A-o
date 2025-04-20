from ManejoArchivos import ManejoArchivos

#Manejo del contexto with: sintaxis simplificada.La ventaja de with es que abre y cierra el archivo de forma automática,
#no es necesario try ni finally, utiliza diferentes métodos: __enter__ que abre
# __exit__ que cierra
#with open('prueba.txt', 'r', encoding='UTF-8') as archivo:
    #print(archivo.read())

with ManejoArchivos('prueba.txt') as archivo:
    print(archivo.read())