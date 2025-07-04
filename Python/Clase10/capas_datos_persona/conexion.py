from psycopg2 import pool # Importa el módulo de psycopg2 para manejo de conexiones a PostgreSQL
from logger_base import log # Importa el logger definido en otro archivo (logger_base.py) para registrar eventos
import sys # Importa sys para poder finalizar el programa en caso de que haya error

class Conexion: #conexión a la base de datos
    _DATABASE = 'test_bd'
    _USERNAME = 'postgres'
    _PASSWORD = 'admin'
    _DB_PORT = '5432'
    _HOST = '127.0.0.1'
    _MIN_CON = 1 #mínimo de conexiones
    _MAX_CON = 5 #máximo de conexiones
    _pool = None

    @classmethod
    def obtenerConexion(cls):
       conexion = cls.obtenerPool().getconn() # este método se encarga de regresar una conexión hacia la bdd
       log.debug(f'Conexión obtenida del pool: {conexion}')
       return conexion

    @classmethod
    def obtenerCursor(cls):
        pass

    @classmethod
    def obtenerPool(cls):
        if cls._pool is None:
           try:
               cls._pool = pool.SimpleConnectionPool(cls._MIN_CON,
                                                     cls._MAX_CON,
                                                     host=cls._HOST,
                                                     user=cls._USERNAME,
                                                     password=cls._PASSWORD,
                                                     port=cls._DB_PORT,
                                                     database=cls._DATABASE)
               log.debug(f'Creación del pool exitosa: {cls._pool}')
               return cls._pool
           except Exception as e:
               log.error(f'Ocurrió un error al obtener el pool: {e}')
               sys.exit()
        else:
            return cls._pool

    @classmethod
    def liberarConexion(cls, conexion):
        cls.obtenerPool().putconn(conexion)
        log.debug(f'Regresamos la conexion del pool: {conexion}')

    @classmethod
    def cerrarConexiones(cls):
        cls.obtenerPool().closeall()

if __name__== '__main__':
    conexion1 = Conexion.obtenerConexion()
    Conexion.liberarConexion(conexion1)
    conexion2 = Conexion.obtenerConexion()
    Conexion.liberarConexion(conexion2)
    conexion3 = Conexion.obtenerConexion()
    Conexion.liberarConexion(conexion3)
    conexion4 = Conexion.obtenerConexion()
    conexion5 = Conexion.obtenerConexion()
    conexion6 = Conexion.obtenerConexion() # nos excedemos en una conexión





















