//se solicita calcular el área y perímetro de un Rectángulo
package e2.operadores;

import java.util.Scanner;

public class E2Operadores {

    public static void main(String[] args) {

        System.out.println("Proporcionar el alto");
        Scanner consola = new Scanner(System.in);
        int alto = Integer.parseInt(consola.nextLine());
        System.out.println("Proporsionar el ancho");
        int ancho = Integer.parseInt(consola.nextLine());

        var area = alto * ancho;
        int perimetro = (alto + ancho) * 2;
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }

}
