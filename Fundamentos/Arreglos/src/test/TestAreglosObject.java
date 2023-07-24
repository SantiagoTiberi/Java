
package test;

import domain.Persona;

public class TestAreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        
        personas[0] = new Persona("santi"); //se asigna un objeto a cada elemento del arreglo
        personas[1] = new Persona("juan");
        
        System.out.println("personas:" + personas[0]);
        System.out.println("personas:" + personas[1]);
        
        for (int i = 0; i < personas.length; i++){
            System.out.println("Persona"+ i + ": " + personas[i]);
        }
    }
}
