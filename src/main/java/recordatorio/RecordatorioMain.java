package recordatorio;

import java.sql.Connection;
public class RecordatorioMain {

       public static void main(String[] args) {
         
        /*probar conexion con SQL*/   
        /* se crea variabe "con" de tipo de la clase creada anteriormente con la cadena de conexion*/
        SQLconexion con = new SQLconexion(); 
        /*se crea variable "conexion" de tipo Connection para obtener la cadena con el metodo creado en 
        ConexionSQL.java
        el obtenerConexion
        */
        Connection conexion = con.obtenerConexion();
        
        /*si al ejecutar da un error de TCP, habilitamos el TCP en SQLManager(cajita roja)
        habilitamos el TCP en Configuracion de red. Despues reiniciar servicis de SQL server
        */
     
        //___________________________________________________________________________________________//
        
        Calendario cal = new Calendario(); //insancia de la clase Calendario en el formulario
        Evento evento = new Evento(cal.titulo,cal.descripcion);//averiguar como enviar lo del formulario
        
        
    }
       
     
}
