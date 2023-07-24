
package test;

/**
 *
 * @author santibox
 */
public class TestArreglos {
    public static void main(String[] args) {
        int edades[]=new int[3];
        System.out.println("Edades: "+ edades);
        
        edades[0] = 10;
        System.out.println("Edades 0: "+edades[0]);
        
        for (int i = 0; i < edades.length; i++){
            System.out.println("Elemento"+ i + ": " + edades[i]);
        }
        
        String frutas[] = {"banana", "manzana", "pera"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Fruta: "+ frutas[i]);
            
        }
    }
}
