/*Se solicita crear una clase llamada Caja con las siguientes características:
• Debe tener 3 atributos de tipo entero (ancho, alto y profundo)
• Debe tener 2 constructores, uno vacío y uno con 3 argumentos, uno
por cada atributo de la clase.
• Debe tener el método que calcule el volumen de la caja según la
formula de la lámina anterior.
• Crear una clase de prueba para crear un objeto de tipo caja que tenga
como valores: ancho=3, alto= 2, profundo = 6 y que mande a imprimir
el volumen de la caja según los valores proporcionados
anteriormente
*/
package caja;


public class PruebaCaja {
    public static void main(String[] args) {
        var ancho = 3;
        var alto = 2;
        var profundo = 6;
        
        //Con constructor vacio
        Caja caja1 = new Caja();
        caja1.alto = alto;
        caja1.ancho = ancho;
        caja1.profundo = profundo;
        System.out.println("El volumen de la caja 1 es:" +caja1.volumenCaja() + "m3");
        
        //Con contructor con argumentos
        Caja caja2 = new Caja(2, 2, 2);
        System.out.println("El volumen de la caja 2 es:" +caja2.volumenCaja() + "m3");
        
    }
}
