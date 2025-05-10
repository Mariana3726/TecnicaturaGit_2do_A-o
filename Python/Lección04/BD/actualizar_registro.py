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
            sentencia = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s' #para actualizar los registros
            valores = ('Juan Carlos', 'Roldán', 'jcarlosr@gmail.com', 4) #es una tupla
            cursor.execute(sentencia, valores) #de esta manera ejecutamos la sentencia

            registros_actualizados = cursor.rowcount
            print(f'Los registros actualizados son: {registros_actualizados}')


except Exception as e: #manejo de errores, si por ej la tabla no existe, se muestra ese mensaje
    print(f'Ocurrió un error: {e}')
finally:
    conexion.close() #cierra la conexión