/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author santibox
 */
public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(1,2,3,4);//le paso 4 argumentos de mismo tipo
        imprimirNumeros(444,555);
        variosParametros("juan", 6,7,8,8);
    }
    
    private static void variosParametros(String nombre, int... numeros){
        System.out.println("nombre" + nombre);
        imprimirNumeros(numeros);
    }
    
    private static void imprimirNumeros(int... numeros){ //Se usa para parametros cuya cantidad puede variar
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento:" + numeros[i]);
        }
    }
}
