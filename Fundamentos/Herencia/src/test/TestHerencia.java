
package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;


public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(5000.00, "Carlos");
        System.out.println("empleado1: " + empleado1);
        var fecha = new Date();
        Cliente cliente1 = new Cliente(true, fecha,"Santi", 'm', 28, "Cordoba");
        System.out.println("cliente1" + cliente1);
    }
 
}
