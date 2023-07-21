
package domain;

public final class Persona { //esta clase no podra extenderse como clase padre ya que es FINAL
    public final static int CONSTANTE = 1; //asi se definen las constantes en java y se usa mayuscula
    
    private String nombre;
    
    public final void imprimir(){ //si este metodo es llamado por una clase hija no permite que lo modifique desde la clase hija
        System.out.println("Metodo imprimir");
    
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
