
package test;

import domain.Persona;


public class TestBloqueInicializacion {
    public static void main(String[] args) {
        Persona persona1 = new Persona(); //se carga la clase, se crea el espacio en memoria
        // y se ejecuta el bloque estático
        System.out.println("persona1 = " + persona1);
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
    }
    
    
}
