
package operaciones;

public class Operaciones { //se usa estatic para no instanciar objetos de esta clase y poder usar directamente este metodo en el main del test si necesidad de generar un objeto
    public static int sumar(int a, int b){
        System.out.println("sumar(int a, int b)");
        return a + b;
    }

    public static double sumar(double a, double b){
        System.out.println("sumar(double a, double b)");
        return a + b;
    }
}
