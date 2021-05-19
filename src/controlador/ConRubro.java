package controlador;

import database.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.Rubro;
import oracle.jdbc.OracleTypes;

public class ConRubro {
    public ArrayList<Rubro> listarRubro(){
        ArrayList<Rubro> lista = new ArrayList<>();
        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection();
        
        try{
            String query= "BEGIN PKG_RUBRO.SP_OBTENER_RUBROS(?);END;";
            CallableStatement call = (CallableStatement) con.prepareCall(query);
            call.registerOutParameter(1, OracleTypes.CURSOR);
            
            call.execute();
            ResultSet rs = (ResultSet)call.getObject(1);
            while(rs.next()){ 
                Rubro rubro = new Rubro();
                rubro.setId_rubro(rs.getInt("id_rubro"));
                rubro.setNombre(rs.getString("nombre"));
                lista.add(rubro);                    
            }            
            
        }
        catch(Exception e){
            System.out.println("Error|ConRubro:listarRubro: "+e.getMessage());
        }                       
        return lista;
    }
}
