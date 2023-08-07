/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ggm.mundopc;

/**
 *
 * @author santibox
 */
public class Raton extends DispositivoEntrada {
    private final int idRaton;//las asigno como final ya que no se deben porder modificar desde otro objeto
    private static int contadorRatones;

    public Raton( String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
        
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ", contadorRatones=" + contadorRatones + '}';
    }




    
    
}
