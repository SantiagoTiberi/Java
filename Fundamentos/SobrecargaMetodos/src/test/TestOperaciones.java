
package test;

import operaciones.Operaciones;


public class TestOperaciones {
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(5, 3);
        System.out.println("Resultado = " + resultado);
        
        var resultado2 = Operaciones.sumar(2.5, 1);
        System.out.println("Resultado = " + resultado2);
    }
}
