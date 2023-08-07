
package com.ggm.mundopc;

public class Orden {
    private final int idOrden; //las asigno como final ya que no se deben porder modificar desde otro objeto
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS){
            this.computadoras[this.contadorComputadoras] = computadora;
            this.contadorComputadoras++;
        }
        else{
            System.out.println("Se supero el limite de computadoras: " +Orden.MAX_COMPUTADORAS);
        }
        
    }
    
    public void mostrarOrden(){
        System.out.println("Orden: "+ contadorOrdenes);
        System.out.println("Computadoras de la orden: "+contadorComputadoras);
        for (int i = 0; i < this.contadorComputadoras; i++){ 
            System.out.println(this.computadoras[i]);        
        }
    }
    
}
