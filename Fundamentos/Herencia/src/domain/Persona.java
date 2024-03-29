
package domain;


public class Persona {
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;

    public Persona(){ //constructor vacio
    }
    
    public Persona(String nombre){ //constructor con 1 argumento
        this.nombre = nombre;
    }

    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", direccion=" + direccion + ", direccion de guardado" + super.toString() + '}';
    }//en este caso el super.toString trae el constructor de la clase padre que es "object" la cual se asigna siempre implicitamente en la clase padre
    //esta es la direcion en memoria del objetos creado
    
    
    
} 
    
