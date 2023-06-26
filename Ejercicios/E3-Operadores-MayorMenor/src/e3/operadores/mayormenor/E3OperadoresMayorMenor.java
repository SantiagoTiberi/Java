//Solicitar al usuario dos valores, y determinar cual número es el mayor
package e3.operadores.mayormenor;

import java.util.Scanner;

public class E3OperadoresMayorMenor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Primer numero:");
        int valor1 = Integer.parseInt(scan.nextLine());
        System.out.println("Segundo numero:");
        int valor2 = Integer.parseInt(scan.nextLine());
        System.out.println("El numero mayor es :");
        //System.out.println(valor1 > valor2 ? valor1 : valor2);

        if (valor1 > valor2) {
            System.out.println("El primer valor es mayor:" + valor1);

        } else {
            System.out.println("El segundo numero es mayor:" + valor2);
        }

    }

}
