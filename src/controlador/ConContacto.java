package controlador;

import database.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;

public class ConContacto {
    public int actualizarContacto(int idContacto, String telefono, String email, String nombre){
        Conexion conexion = new Conexion();        
        Connection con = conexion.getConnection();
        
        try{
            String query = "BEGIN pkg_proveedor.SP_MODIFICAR_CONTACTO(?,?,?,?);END;";
            CallableStatement call = (CallableStatement) con.prepareCall(query);
            call.setInt(1, idContacto);           
            call.setString(2,telefono);
            call.setString(3,email);
            call.setString(4, nombre);
            call.executeUpdate();
            
            System.out.println("Contacto actualizado");
            return 1;
        }
        catch(Exception e){
            System.out.println("Error|ConCliente:ActualizarCliente: "+e.getMessage());
            return 0;
        }      
            
    }
}
