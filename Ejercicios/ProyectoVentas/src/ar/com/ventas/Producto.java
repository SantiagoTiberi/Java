
package ar.com.ventas;

/**
 *
 * @author santibox
 */
public class Producto {
    private final int idProducto; // uso final para que no se pueda cambiar su valor, solo en la inicializacion mediante el constructor
    private String nombre;
    private double precio;
    private static int contadorProductos;
    
    private Producto(){ //constructor privado (solo se puede usar en esta clase) que inicializara la variable idProducto
        this.idProducto = ++Producto.contadorProductos;
    }

    public Producto(String nombre, double precio) {
        this(); //se llama al constructor privado de esta clase
        this.nombre = nombre;
        this.precio = precio;
        
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
    
    
    
}
