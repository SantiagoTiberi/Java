
package operaciones;


public class PruebaAritmetica {
    public static void main(String[] args) {
        //Variables locales
        var a = 5; //var solo se puede usar dentro de un metodo como variable local
        var b= 2;
        miMetodo();
        
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("arimetica2 a: " + aritmetica2.a);
        System.out.println("arimetica2 b: " + aritmetica2.b);
        
        
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("arimetica1 a: " + aritmetica1.a);
        System.out.println("arimetica1 b: " + aritmetica1.b);
        
        
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        aritmetica1.sumar();
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado desde la prueba = " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(5, 8);
        System.out.println("resultado con argumentos = " + resultado);
        
        
    }
    
    public static void miMetodo(){
        //la veraable a esta fuera del alcance donde fue definida
        //a = 10;
        System.out.println("otro metodo");
    }
            
    
}
