
package recordatorio;

/**
 se crea la clase evento con todos los atributos que espera la base de datos
 * los demas atributos son ID, autoincrementales
 */

public class Evento { //clase
    
    public String nombre;
    public String descripcion;
    
    public Evento(String nombre, String descripcion){ //constructor de la clase
        
    this.nombre=nombre;
    this.descripcion=descripcion;
    
    }
}
