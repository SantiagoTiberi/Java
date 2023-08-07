/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ggm.mundopc;

/**
 *
 * @author santibox
 */
public class Monitor {
    private final int idMonitor;//las asigno como final ya que no se deben porder modificar desde otro objeto
    private String marca;
    private double tamanio;
    private static int contadorMonitores;

    private Monitor() {
        this.idMonitor = ++this.contadorMonitores; 
    }
        
    public Monitor(String marca, double tamaño) {
        this(); //se llama al constructor privado de esta clase
        this.marca = marca;
        this.tamanio = tamaño;
    }



    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tama\u00f1o=" + tamanio + ", contadorMonitores=" + contadorMonitores + '}';
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return this.tamanio;
    }

    public void setTamaño(double tamaño) {
        this.tamanio = tamaño;
    }

    public int getContadorMonitores() {
        return this.contadorMonitores;
    }

    public void setContadorMonitores(int contadorMonitores) {
        this.contadorMonitores = contadorMonitores;
    }

    public int getIdMonitor() {
        return this.idMonitor;
    }

    
    
}
