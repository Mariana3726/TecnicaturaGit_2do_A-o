package mundopc;

import ar.com.system2025.mundopc.*; //* para que se importen todas las clases y no una por una

public class mundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13); //importar clase
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        
        //creamos otros objetos de diferente marca
        Monitor monitorGamer = new Monitor("Gamer", 32); 
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        
        //otro objeto
        Monitor monitorDELL = new Monitor("DELL", 24); 
        Teclado tecladoGenius = new Teclado("Bluetooth", "Genius");
        Raton ratonGenius = new Raton("Bluetooth", "Genius");
        Computadora computadoraDell = new Computadora("Computadora DELL", monitorDELL, tecladoGenius, ratonGenius);
        
        //otro objeto
        Monitor monitorSamsung = new Monitor("Samsung", 34); 
        Teclado tecladoSamsung = new Teclado("USB", "Samsung");
        Raton ratonSamsung = new Raton("USB", "Genius");
        Computadora computadoraSamsung = new Computadora("Computadora Samsung", monitorSamsung, tecladoSamsung, ratonSamsung);
        
        //otro objeto
        Monitor monitorAsus = new Monitor("Asus", 34); 
        Teclado tecladoAsus = new Teclado("USB", "Asus");
        Raton ratonAsus = new Raton("USB", "Asus");
        Computadora computadoraAsus = new Computadora("Computadora Asus", monitorAsus, tecladoAsus, ratonAsus);
        
        //otro objeto
        Monitor monitoriQual = new Monitor("iQual", 20); 
        Teclado tecladoiQual = new Teclado("USB", "iQual");
        Raton ratoniQual = new Raton("USB", "iQual");
        Computadora computadoraiQual = new Computadora("Computadora iQual", monitoriQual, tecladoiQual, ratoniQual);
        
        //otro objeto
        Monitor monitorLenovo = new Monitor("Lenovo", 20); 
        Teclado tecladoLenovo = new Teclado("USB", "Lenovo");
        Raton ratonLenovo = new Raton("USB", "Lenovo");
        Computadora computadoraLenovo = new Computadora("Computadora Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        
        //otro objeto
        Monitor monitorAcer = new Monitor("Acer", 24); 
        Teclado tecladoAcer = new Teclado("Bluetooth", "Acer");
        Raton ratonAcer = new Raton("USB", "Acer");
        Computadora computadoraAcer = new Computadora("Computadora Acer", monitorAcer, tecladoAcer, ratonAcer);
        
        //otro objeto
        Monitor monitorApple = new Monitor("Apple", 24); 
        Teclado tecladoApple = new Teclado("Bluetooth", "Apple");
        Raton ratonApple = new Raton("USB", "Apple");
        Computadora computadoraApple = new Computadora("Computadora Apple", monitorApple, tecladoApple, ratonApple);
        
        //otro objeto
        Monitor monitorMSI = new Monitor("MSI", 38); 
        Teclado tecladoMSI = new Teclado("Bluetooth", "MSI");
        Raton ratonMSI = new Raton("USB", "MSI");
        Computadora computadoraMSI = new Computadora("Computadora MSI", monitorMSI, tecladoMSI, ratonMSI);
        
        //otro objeto
        Monitor monitorLG = new Monitor("LG", 38); 
        Teclado tecladoLG = new Teclado("Bluetooth", "LG");
        Raton ratonLG = new Raton("USB", "LG");
        Computadora computadoraLG = new Computadora("Computadora LG", monitorLG, tecladoLG, ratonLG);
        
        //otro objeto
        Monitor monitorHuawei = new Monitor("Huawei", 38); 
        Teclado tecladoHuawei = new Teclado("Bluetooth", "Huawei");
        Raton ratonHuawei = new Raton("USB", "Huawei");
        Computadora computadoraHuawei = new Computadora("Computadora Huawei", monitorHuawei, tecladoHuawei, ratonHuawei);
        
        Orden orden1 = new Orden(); //inicializamos el arreglo aún vacío
        Orden orden2 = new Orden(); //una nueva lista para el objeto orden2
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden2.agregarComputadora(computadoraDell);
        orden2.agregarComputadora(computadoraSamsung);
        orden2.agregarComputadora(computadoraAsus);
        orden2.agregarComputadora(computadoraiQual);
        orden2.agregarComputadora(computadoraLenovo);
        orden2.agregarComputadora(computadoraAcer);
        orden2.agregarComputadora(computadoraApple);
        orden2.agregarComputadora(computadoraMSI);
        orden2.agregarComputadora(computadoraLG);
        orden2.agregarComputadora(computadoraHuawei);
        
        Computadora computadorasVarias = new Computadora("Computadoras de diferentes marcas", monitorHP, tecladoGamer, ratonHP);
        orden2.agregarComputadora(computadorasVarias);
        
        orden1.mostrarOrden();
        orden2.mostrarOrden();
        
    }
}
