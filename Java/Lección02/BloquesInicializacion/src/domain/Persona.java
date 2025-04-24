package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    static{ //bloque de inicialización estático
        System.out.println("Ejecución bloque estático");
        ++Persona.contadorPersonas; //usar el nombre de la clase es opcional
        //idPersona = 10; no es un atributo estático por eso marca error
    }
    
    {//Bloque de inicialización NO estático(contexto dinámico)
        System.out.println("Ejecución del bloque no estático"); 
        this.idPersona = Persona.contadorPersonas++; //incrementamos el atributo
    }
    
    //Los bloques de inicialización se ejecutan antes del constructor
    
    public Persona(){
        System.out.println("Esta es la ejección del constructor");
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
}
