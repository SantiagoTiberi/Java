
package pasoporreferencia;
import clases.Persona;
/**
 *
 * @author santibox
 */
public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        System.out.println("persona1 nombre:" +persona1.nombre );
        cambiaValor(persona1);
        //persona1 =  cambiaValor(persona1); //para es caso de una funcion que devuelva el valor
        System.out.println("persona1 nuevo nombre:" +persona1.nombre);
                
    }
    
    //public static Persona cambiaValor(Persona persona){ //declaracion del metodo para que devuelva el valor del objeto
    public static void cambiaValor(Persona persona){ //al pasar un objeto si se cambia el valor de los atributos ya que en estos casos se envia la direccion donde se encuentra la variable objeto
        persona.nombre = "Karla";
        //return persona;
    }
}
