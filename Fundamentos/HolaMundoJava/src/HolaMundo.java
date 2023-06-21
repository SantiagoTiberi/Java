
import java.util.Scanner;


public class HolaMundo {

    public static void main(String args[]) {
        //Defino la variable
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        System.out.println("Hola Mundo desde Java");

        //Modifico el valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);

        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);

        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);

        //var hace inferencia de tipos en Java
        var miVariableEntera2 = 10;
        System.out.println(miVariableEntera2);

        var miVariableCadena2 = "nueva cadena";
        System.out.println("variabe:" + miVariableCadena2);

        //Valores permitidos en el nombre de variables
        var miVariable = 1;
        var _miVariable = 2;
        var $Variable = 3;
        //var óVariable = 4; //no se recomemineda
        //var #variable = 8; //no se pueden usar caracteres especiales

        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var i = 3;
        var j = 4;

        System.out.println(i + j);//se realiza la suma de numeros
        System.out.println(i + j + usuario); //Evaluación de izq a der, realiza suma
        System.out.println(usuario + i + j);//contexto cadena, todo es una cadena
        System.out.println(usuario + (i + j));//uso de parentesis modifican la prioridad en la evaluacion

        var nombre = "Karla";

        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b\b" + nombre);
        System.out.println("Comilla simple: \'" + nombre + "\'");
        System.out.println(" Comilla doble: \"" + nombre + "\"");

        System.out.println("Escribe tu nombre:");
        Scanner consola = new Scanner(System.in);
        var usuario2 = consola.nextLine();
        System.out.println("usuario = " + usuario2);
        System.out.println("Escribe el titulo:");
        var titulo2 = consola.nextLine();
        System.out.println("Resultado: " + titulo2 + " " + usuario2);

    }
}
