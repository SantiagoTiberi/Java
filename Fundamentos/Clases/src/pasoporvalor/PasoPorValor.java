
package pasoporvalor;


public class PasoPorValor {
    public static void main(String[] args) {
        var x = 10;
        System.out.println("x =" + x);
        
        cambioValor(x);
        
        System.out.println("x nuevo valor = " + x);
    }
    
    public static void cambioValor(int arg1){ //cuando se pasa por valor no se modifica el valor de la variable (x) de la funcion llamadora
        System.out.println("arg1 =" + arg1); //solo se pasa una copia del valor al metodo que es llama
        arg1 = 15;
    }
}
