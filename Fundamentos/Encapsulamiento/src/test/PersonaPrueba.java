
package test;
import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("juan", 5000.00, false);
        System.out.println("persona1 nombre: " + persona1.getNombre());
        //persona1.nombre = "juan carlos"; //este nose puede usar ya que el atributo es privado y para cambiarlo se usa el metodo setNombre comop esta abajo
        persona1.setNombre("juan carlos");
//        System.out.println("persona1 nombre actualizado: " + persona1.getNombre());
//        System.out.println("persona1 sueldo: " + persona1.getSueldo());
//        System.out.println("persona1 eliminado: " + persona1.isEliminado());
        System.out.println("persona1: " + persona1.toString());
        System.out.println("persona1: " + persona1); //el metodo println llama al metodo toString implicitamente por lo que no es necesario agregarlo a la linea
    }
 
}
