package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Conexion {
    private final static String SERVER="jdbc:oracle:thin:@//localhost:1521/XEPDB1";
    private final static String USER="odontologica_bd";
    private final static String PASS="odontologica_bd";
        
    public Connection getConnection(){
                 
        try{          
            Connection conn = DriverManager.getConnection(SERVER,USER,PASS);  
            return conn;        
        }
        catch(Exception err){
            System.out.println(err.getMessage());            
            return null;
        }    
    }
}