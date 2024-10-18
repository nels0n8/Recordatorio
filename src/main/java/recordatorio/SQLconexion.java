package recordatorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class SQLconexion {
    Calendario cal = new Calendario();
    
    //variables de conexion a la base de datos
    Connection conexion = null;
  
    /* se crea la clase con la varible de conexion que lleva los datos de la db*/
    String usuario= "ngr";
    String contrasena = "ngr";
    String db = "recordatorio";
    String ip = "localhost";
    String puerto = "1433";
 
    /*se crea metodo que regresa la conexion*/
    public Connection obtenerConexion (){
        try{
            /*string para crear cadena de conexion*/
            String cadenaConex = "jdbc:sqlserver://"+ip+":"+puerto+";databaseName="+db;
            
            conexion = DriverManager.getConnection(cadenaConex, usuario, contrasena);
            //JOptionPane.showMessageDialog(null, "Conexion exitosa"); 
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: "+e.toString());
            e.printStackTrace();
        }
        return conexion;
    }
    
    public void InsertarEvento(Connection conexion, Evento Evento){
        try{
            String cadenaInsert = "Insert into Evento (nombre, descripcion) values (?,?);";
            
            PreparedStatement statement = conexion.prepareStatement(cadenaInsert); //instancia de PreparedStatement (sentencias SQL) conexion que ya fue creada y usando el metodo
            statement.setString(1,cal.titulo); //1 hace referencia al primer ?
            statement.setString(2,cal.descripcion);//2 hace referecia al segndo ?
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: "+e.toString());
            e.printStackTrace();
        }

    }
    
    
}