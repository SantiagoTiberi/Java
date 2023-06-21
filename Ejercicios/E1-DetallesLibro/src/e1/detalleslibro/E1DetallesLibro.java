
import java.util.Scanner;

public class E1DetallesLibro {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        System.out.println("Proporsionar el titulo: \t");
        var titulo = consola.nextLine();
        System.out.println("Proporsionar el autor: \t");
        var autor = consola.nextLine();
        System.out.println(titulo + "\tfue escrito por\t" + autor);
    }
}
