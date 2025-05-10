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
            sentencia = 'INSERT INTO persona (nombre, apellido, email)VALUES (%s, %s, %s)'
            valores = (
                ('Carlos', 'Diaz', 'cdiaz@gmail.com'),
                ('Marcos', 'Canto', 'mcanto@gmail.com'),
                ('Marcelo', 'Cuenca', 'mcuenca@gmail.com')
            ) #es una tupla de tuplas
            cursor.executemany(sentencia, valores) #de esta manera ejecutamos la sentencia
            #conexion.commit() se utiliza para guardar cambios en la bdd, pero ya lo hace el with
            registros_insertados = cursor.rowcount
            print(f'Los registros insertados son: {registros_insertados}')


except Exception as e: #manejo de errores, si por ej la tabla no existe, se muestra ese mensaje
    print(f'Ocurrió un error: {e}')
finally:
    conexion.close() #cierra la conexión

# https://www.psycopg.org/docs/usage.html