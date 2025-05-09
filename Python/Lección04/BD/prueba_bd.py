import psycopg2 #importación de la librería 'psycopg2' para conectarnos a Postgres

conexion = psycopg2.connect( #conexión a la base de datos
    user='postgres', #usuario
    password='admin', #contraseña
    host='127.0.0.1', #dirección del servidor
    port='5432', #puerto en el que escucha postgreSQL
    database='test_bd' #nombre de la base de datos
)
try: #bloque try-except-finally
# se usa para manejar errores de forma segura y cerrar la conexión pase lo que pase
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'SELECT * FROM persona'
            cursor.execute(sentencia) #de esta manera ejecutamos la sentencia
            registros = cursor.fetchall() #recuperamos todos los registros que serán una lista
            print(registros) #imprime los resultados en forma de tuplas
except Exception as e: #manejo de errores, si por ej la tabla no existe, se muestra ese mensaje
    print(f'Ocurrió un error: {e}')
finally:
    conexion.close() #cierra la conexión

# https://www.psycopg.org/docs/usage.html