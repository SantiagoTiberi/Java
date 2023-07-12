
package test;

import domain.Persona;

public class PersonaPrueba {
    static int hola;
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");        
        Persona persona2 = new Persona("Karla");

        imprimir(persona1);//dentro de un metodo static los metodos y variables llamados tambien deben ser static y no se puede usar THIS
        imprimir(persona2);
        imprimir(new Persona("carlos"));//En este caso solo se invoca al constructor
        hola = 8;
        System.out.println("hola" + hola);
    }
    
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
}
