package test;

import enumeraciones.Continentes;
import enumeraciones.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        //System.out.println("Dia 1: "+Dias.LUNES);
        //indicarDiaSemana(Dias.JUEVES); //las enumeraciones se tratan como cadenas, pero no son cadenas
        //no se debe utilizar comillas, se accede a través del punto.
        System.out.println("Continente No. 4: "+Continentes.AMERICA);
        System.out.println("No. de países en el continente: "+Continentes.AMERICA.getPaises());
        System.out.println("No. de habitantes: "+Continentes.AMERICA.getHabitantes());
        System.out.println("Continentes No. 1: "+Continentes.AFRICA);
        System.out.println("No. de paises en el 1er. continente: "+Continentes.AFRICA.getPaises());
        System.out.println("No. de habitantes en el 1er. continente: "+Continentes.AFRICA.getHabitantes());
        System.out.println("Continentes No. 2: "+Continentes.EUROPA);
        System.out.println("No. de paises en el 2do. continente: "+Continentes.EUROPA.getPaises());
        System.out.println("No. de habitantes en el 2do. continente: "+Continentes.EUROPA.getHabitantes());
        System.out.println("Continentes No. 3: "+Continentes.ASIA);
        System.out.println("No. de paises en el 3er. continente: "+Continentes.ASIA.getPaises());
        System.out.println("No. de habitantes en el 3er. continente: "+Continentes.ASIA.getHabitantes());
        System.out.println("Continentes No. 5: "+Continentes.OCEANIA);
        System.out.println("No. de paises en el 5to. continente: "+Continentes.OCEANIA.getPaises());
        System.out.println("No. de habitantes en el 5to. continente: "+Continentes.OCEANIA.getHabitantes());
        System.out.println("No. de paises en el 6to continente: "+Continentes.ANTARTIDA.getPaises());
        System.out.println("No. de habitantes en el 6to continente: "+Continentes.ANTARTIDA.getHabitantes());
    }
    
    
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer día de la semana");
                break;
            case MARTES:
                System.out.println("Segundo día de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer día de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto día de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto día de la semana");
                break;
            case SABADO:
                System.out.println("Sexto día de la semana");
                break;
            case DOMINGO:
                System.out.println("Séptimo día de la semana");
                break;
            default:
                System.out.println("Día no válido");
        }
    }
}
