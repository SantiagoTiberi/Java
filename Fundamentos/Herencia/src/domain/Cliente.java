
package domain;

import java.util.Date;


public class Cliente extends Persona{
    private int idCliente;
    private static int contadorCliente;
    private boolean vip;
    private Date fechaRegistro;

    public Cliente(boolean vip, Date fechaRegistro, String nombre, char genero, int edad, String direccion){
        super(nombre, genero, edad, direccion);
        this.vip = vip;
        this.fechaRegistro = fechaRegistro;
        this.idCliente = ++Cliente.contadorCliente;
    }
    
    
    public int getIdCliente() {
        return this.idCliente;
    }
    
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append("vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append('}');
        return sb.toString();
    }

    


    
    
   
}
