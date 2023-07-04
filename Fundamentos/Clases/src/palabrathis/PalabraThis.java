
package palabrathis;


public class PalabraThis {//en java solo se puede tener una clase publica en el mismo archivos, las demas clases en el mismo archivo solo se puede usar dentro del mismo archivo o paquete
    public static void main(String[] args) {
        Persona persona = new Persona("juan", "perez");
        System.out.println("persona = " +persona);
        System.out.println("persona nombre= " +persona.nombre);
        System.out.println("persona apellido= " +persona.apellido);
    }
}

class Persona{
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){//Contructor (no hace falta agregar el public al principio en este caso)
        //super(); SIEMPRE en el contructor se hace una llamada implicita al constructor de la clase Padre (object) que es "super()"
    
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("objeto persona usando this:" + this); //al imprimir this dentro de la clase se imprime la direccion del objeto donde se escribio this
        //Imprimir imprimir = new Imprimir();//nuevo objeto de tipo imprimir
        new Imprimir().imprimir(this); //para acceder a los metodos y atributos del objeto se puede hacer asi, sin asignar una variable como se ve en la linea de arriba
    }
}

class Imprimir{
    
    public Imprimir(){
        super();//el constructor de la clase object (padre) para reservar memoria(NO ES NECESARIO ESCRIBIRLO)
    }
    
    public void imprimir(Persona persona){
        System.out.println("persona desde imprimir:" + persona);
        System.out.println("impresion del objeto actual(this)" + this);
    }
}