
package domain;


public class Persona {

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        contadorPersonas = aContadorPersonas;
    }
    private int idPersona;
    private String nombre;
    private static int contadorPersonas;//La variable se asocia con la clase y no con los objetos por lo que con cada objeto ue se cree no se inicialiara nuevamente si no mantendra su valor 
    
    public Persona(String nombre){
        this.nombre = nombre;
        //Incrementar el contador por cada objeto nuevo
        Persona.contadorPersonas++; //para atributos estaticos se recomeinda que se anteponga el nombre de la clase en lugar de usar this. de esta forma se diferenciara con las variables locales
        //Asignar el nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersonas;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }


    
}
