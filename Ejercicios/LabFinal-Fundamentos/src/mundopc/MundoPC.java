/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundopc;

import com.ggm.mundopc.*;


public class MundoPC {
    public static void main(String[] args) {
        //Creo los objetos
        Monitor monitor1 = new Monitor("samsung", 13);
        Raton raton1 = new Raton("usb", "Logitech");
        Teclado teclado1 = new Teclado("usb", "noga");
        Computadora computadora1 = new Computadora("PC1", monitor1, teclado1, raton1);
        
        Monitor monitorHP = new Monitor("HP", 30);
        Raton ratonHP = new Raton("wifi", "HP");
        Teclado tecladoHP = new Teclado("wifi", "HP");
        Computadora computadoraHP = new Computadora("PC HP", monitorHP, tecladoHP, ratonHP);
        
        //Se crean las ordenes con los objetos ya creados
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadora1);
        orden1.mostrarOrden();
        
    }
 
}
