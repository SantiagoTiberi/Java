
package clases;

public class PruebaPersona {

    public static void main(String[] args) {
        //declaracion de la variable
        Persona persona1; //variable del tipo Persona
        //creacion del objeto
        persona1 = new Persona();//creacion objeto del tipo persona, Persona() es el constructor que permite crear objetos del tipo de clase definida (reserva memoria para ese elemento)
                                 //persona1 apunta al objeto que se creo en el espacio de memoria reservado por el constructor
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.desplegarInformacion();
        
        
        Persona persona2 = new Persona();
        
        System.out.println("Persona 1: " + persona1);
        System.out.println("Persona 2: " + persona2); //se imprime la direccion de memoria donde se guardo el objeto
        
        persona2.desplegarInformacion();
        persona2.nombre = "Karla";
        persona2.apellido = "Lara";
        persona2.desplegarInformacion();
    }
    
}
