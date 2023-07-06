package caja;

/**
 *
 * @author santi
 */
public class Caja {
    int ancho;
    int alto;
    int profundo;
    
    public Caja(){
    //Constructor vacio
    }
        
    
    public Caja(int alto, int ancho, int prof){
        //constructor con 3 argumentos
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = prof;
    }
    
    public int volumenCaja(){
        int volumen = this.alto*this.ancho*this.profundo;
        return volumen;
    }
}
