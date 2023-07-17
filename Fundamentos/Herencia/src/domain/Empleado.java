
package domain;

public class Empleado extends Persona{//empleado hereda las caracteristicas posibles desde la clase persona
    private int idEmpleado;
    private double sueldo;
    private static int contadorsEmpleado;

    /**
     *
     */
    public Empleado() {
        //super(); //simepre se hace esta llamada interna implicita, ya que extiende de la clase padre
        this.idEmpleado = ++Empleado.contadorsEmpleado;
        
    }
    public Empleado(double sueldo, String nombre) { //Construcor con caracteristicas de la clase Empleado (sueldo) y de la clase padre Persona (nombre)
        //super(nombre); //se utiliza para llamar al constructor de la clase padre (Persona) que requiere Nombre como argumento
        this(); //asi se llama al constructor vacio que se encuentra dentro de la misma clase, al estar este no se puede usar super
        this.nombre = nombre; //ya que no se puede usar super para pasar la variable, se llama a la variable nombre de la clase padre de esta forma ya que esta definida como PROTECTED
        this.sueldo = sueldo;
        //this.idEmpleado = ++Empleado.contadorsEmpleado;  //se usara el constructor vacio para esta linea
        
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); //esta clase se agregar automaticamente cuando agrego el metodo toString y deleccion ls opcion "use StringBuilder"
        sb.append("Empleado{");              //hace que se use sb.appen en lugar de + para concatenar las cadenas lo que es mas eficiente
        sb.append("idEmpleado=").append(this.idEmpleado);
        sb.append(", nombre:").append(this.nombre);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", Persona{").append(super.toString()).append("}"); //de esta forma se llama al to string directamente de la clase padre
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
