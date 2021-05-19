package controlador;

import database.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import modelo.Contacto;
import modelo.Proveedor;
import oracle.jdbc.OracleTypes;

public class ConProveedor {
    public int CrearProveedor(Proveedor proveedor, Contacto contacto){
        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection();
        try{
            String query = "BEGIN PKG_PROVEEDOR.SP_INSERTAR_PROVEEDOR(?,?,?,?,?,?,?); END;";
            CallableStatement call = (CallableStatement) con.prepareCall(query);
            call.setInt(1,proveedor.getRut());
            call.setString(2, proveedor.getDv());
            call.setString(3, proveedor.getRazon_social());
            call.setInt(4, proveedor.getRubro().getId_rubro());
            call.setString(5, contacto.getNombre());
            call.setString(6, contacto.getTelefono());
            call.setString(7, contacto.getEmail());
            
            call.execute();
            System.out.println("Proveedor creado con exito");
            return 1;  
        }
        catch(Exception e){
            System.out.println("Error|ConProveedor:CrearProveedor: "+e.getMessage());            
            return 0;
        }
    }
}
