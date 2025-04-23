package enumeraciones;

public enum Continentes {
    AFRICA(54, "1.2 billones"),
    EUROPA(44, "3 billones"),
    ASIA(49, "1.1 billones"),
    AMERICA(35, "3.5 billones"),
    OCEANIA(16, "1.3 millones"),
    ANTARTIDA(0, "0 habitantes");
    
    private final int paises;
    private String habitantes;
    
    Continentes(int paises, String habitantes){
        this.paises = paises;
        this.habitantes = habitantes;
    }
    
    //método get
    public int getPaises(){
        return this.paises;
    }
    
    public String getHabitantes(){
        return this.habitantes;
    }
}