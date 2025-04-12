/*Esta clase no desciende de ninguna otra clase. Primero se crean los atributos.
Mientras el programa no tenga el constuctor la línea del private final se marcará como error. 
Luego de la creación de los atributos se creará el constructor vacío, el cual se creará 
de manera privada debido a que será llamado desde el constructor público que es donde 
encontramos cargados los atributos. El constructor vacío hará el incremento de 
cada uno de los monitores. Luego se creará el constructor público, luego se agregarán los Getter
and Setter, el get es el que obtiene el valor y el set es sólo para lectura y por último 
se agregará el toString.*/


package ar.com.system2025.mundopc;

public class Monitor {  //creamos los atributos para la clase Monitor
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;
    
    private Monitor(){ //constructor vacío, lo va a estar llamando desde el público
        this.idMonitor = ++Monitor.contadorMonitores;
    }
    
    public Monitor(String marca, double tamanio){
        this(); //acá llamamos al constructor vacío
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    
    //ingresamos manualmente el getIdMonitor
    public int getIdMonitor(){
        return this.idMonitor; //para obtener el valor del idMonitor
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + '}';
    }
    
}
