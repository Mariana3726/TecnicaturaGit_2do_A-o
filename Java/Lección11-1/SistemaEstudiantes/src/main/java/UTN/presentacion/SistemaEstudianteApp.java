package UTN.presentacion;

import UTN.conexion.Conexion;
import UTN.datos.EstudianteDao;
import UTN.dominio.Estudiante;
import java.util.Scanner;


public class SistemaEstudianteApp {
    public static void main(String[] args) {
        var salir = false;
        var consola = new Scanner(System.in); //para leer info de la consola
        //creamos una instancia de la clase servicio, fuera del ciclo
        var estudianteDao = new EstudianteDao();
        while (!salir){
            try
                mostrarMenu(); //metodo que devolvera booleano
                salir = ejecutarOpciones(consola, estudianteDao); //arroja una exception
        } catch(Exception e){
            System.out.println("Ocurrión un error al ejecutar la operación: "+e.getMessage());
        }
    } //fin while
} //fin main

private static void mostrarMenu(){
    System.out.print("""
            ***** Sistema de Estudiantes *****
            1. Listar estudiantes
            2. Buscar estudiantes
            3. Agregar estudiante
            4. Moificar estudiante
            5. Eliminar estudiante
            6. Salir
            Elige una opción:
            """);
}