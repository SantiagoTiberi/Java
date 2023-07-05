
package operaciones;

public class Aritmetica { //clase primera letra con mayuscula
    //Atributos de la clase siempre en minuscula
    int a;
    int b;
    
    //Constructor vacio
    public Aritmetica(){ //el constructor reserva el espacio de memoria cunado es llamado y puede ser vacio o no, en caso de no declararlo el programa lo hae por default
        System.out.println("Ejecutando constructor vacio");
    }
    
    public Aritmetica(int a, int b){//se puede usar mas de un contructor
        this.a = a;
        this.b = b;
        System.out.println("EjecutandoConstructor con argumentos");
    }
    
    //Metodo
    public void sumar(){//metodo en formato camello
        int resultado = this.a + this.b;
        System.out.println("resultado= " + resultado);
    }
    
    public int sumarConRetorno(){
        //int reultado = a + b;
        //return resultado;
        return this.a + this.b;
        
    }
    
    public int sumarConArgumentos(int arg1, int arg2){
        this.a = arg1; //this es opcional, hace refencia a un atributo de la clase y no a la variable local de cada metodo, debe ir si o si dentro de la misma clase
        b = arg2;
        //return a + b;
        return sumarConRetorno();
    }
}
