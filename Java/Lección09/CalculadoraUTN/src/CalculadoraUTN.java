import java.util.Scanner;

public class CalculadoraUTN {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (true) { //va a ser un ciclo infinito


            System.out.println("******* Aplicación Calculadora *******");
            mostrarMenu(); //cargamos el menú a través de esta función
            try{
                var operacion = Integer.parseInt(entrada.nextLine());
                if (operacion >= 1 && operacion <= 4) {

                    ejecutarOperacion(operacion, entrada);

                } //Fin del if
                else if (operacion == 5) {
                    System.out.println("Fin");
                    break; //rompe el ciclo y sale
                } else {
                    System.out.println("Opción errónea: " + operacion);
                }
                //imprimimos un salto de línea antes de repetir el menú
                System.out.println();
            } catch (Exception e){ //fin try, comienzo catch

                System.out.println("Ocurrió un error: "+ e.getMessage());
                System.out.println();
            } //fin catch
        } //fin ciclo while
    } //Fin main

    private static void mostrarMenu(){
        //Mostramos el Menú
        System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                    """);
        System.out.print("Operación a realizar?: ");
    } //fin método mostrarMenu

    private static void ejecutarOperacion(int operacion, Scanner entrada){
        System.out.print("Ingrese el valor para el operando1: ");
        var operando1 = Double.parseDouble(entrada.nextLine());
        System.out.print("Ingrese el valor para el operando2: ");
        var operando2 = Double.parseDouble(entrada.nextLine());
        Double resultado;
        switch (operacion) {
            case 1 -> {
                resultado = operando1 + operando2;
                System.out.println("Resultado de la suma: " + resultado);
            }
            case 2 -> {
                resultado = operando1 - operando2;
                System.out.println("Resultado de la resta: " + resultado);
            }
            case 3 -> {
                resultado = operando1 * operando2;
                System.out.println("Resultado de la multiplicación: " + resultado);
            }
            case 4 -> {
                resultado = operando1 / operando2;
                System.out.println("Resultado de la división: " + resultado);
            }
            default -> System.out.println("Opción errónea: " + operacion);
        } //Fin switch
    } //fin método ejecutarOperacion
} //Fin clase









