package mundopc;

import cl.com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP,tecladoHP,ratonHP);
        
        Monitor monitorGamer = new Monitor("Gamer", 13);
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer,tecladoGamer,ratonGamer);
    
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        
        orden1.motrarOrden();
        //
        Monitor monitorAsus = new Monitor("Asus", 13);
        Teclado tecladoAsus = new Teclado("Bluetooth", "Asus");
        Raton ratonAsus = new Raton("bluetooth", "Asus");
        Computadora computadoraAsus = new Computadora("Computadora Asus", monitorAsus,tecladoAsus,ratonAsus);
        
        Monitor monitorAsusGamer = new Monitor("Asus Gamer", 13);
        Teclado tecladoAsusGamer = new Teclado("Bluetooth", "Asus Gamer");
        Raton ratonAsusGamer = new Raton("bluetooth", "Asus Gamer");
        Computadora computadoraAsusGamer = new Computadora("Computadora Asus Gamer", monitorAsusGamer,tecladoAsusGamer,ratonAsusGamer);
    
        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraAsus);
        orden2.agregarComputadora(computadoraAsusGamer);
        
        orden2.motrarOrden();
    }
}
