package test;
import domain.*;
public class TestClaseObject {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("juan", 5000);
        Empleado empleado2 = new Empleado("Juan", 5000);
        
        if(empleado1 == empleado2){
            System.out.println("Tienen la misma referencia en memoria");
        }
        else{
            System.out.println("Tienen distinta referencia en memoria");
        }
        if(empleado1.equals(empleado2)){ //Equals: comparación de contenido si está sobrerescrito
            System.out.println("Los objetos son iguales en contenido");
        }
        else{
            System.out.println("Los objetos son distintos en contenido");
        }
        if(empleado1.hashCode() == empleado2.hashCode()){//Hascode asegura que objetos iguales tengan el mismo código hash
            System.out.println("El valor hashCode es igual");
        }
        else{
            System.out.println("El valor hashCode es diferente");
        }
    }    
}
