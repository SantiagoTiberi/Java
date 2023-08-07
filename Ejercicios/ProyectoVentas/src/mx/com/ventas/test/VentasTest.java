
package mx.com.ventas.test;

import ar.com.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("pantalon", 10000);
        Producto producto2 = new Producto("Camisa", 5000);
        
        Orden orden1 = new Orden();
               
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto1);
        
        orden1.mostrarOrden();
    }
}
