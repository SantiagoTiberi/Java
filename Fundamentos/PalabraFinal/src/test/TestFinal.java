
package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        //miVariable = 4; //l tener la palabra fial en la definicion de la variable no me permite que cambiar su valor
        int c = Persona.CONSTANTE;
        
        final Persona persona1 = new Persona();//Este obsejo es final por lo que no se le podra cambiar el tipo de constructor 
        //persona1 = new Persona(); //Esto no se puede hacer ya que se declaro como final el objeto persona1, lo que hace que no pueda apuntar a otro objeto solo al que se definio al principio
        //NO PODEMOS MODIFICAR EL OBJETO AL CUAL APUNTA LA VARIABLE persona1 PERO SI EL CONTENIDO DE LA MISMA, LO QUE SE HACE EN LA LINEA DE ABAJO
        persona1.setNombre("Jean");
        System.out.println("persona1 nombre: " + persona1.getNombre());
        
       
    }
 
}
