package controlador;

import database.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.Especialidad;
import oracle.jdbc.OracleTypes;


public class ConEspecialidad {
    public ArrayList<Especialidad> listarEspecialidad(){
        ArrayList<Especialidad> lista = new ArrayList<>();
        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection();
        
        try{
            String query= "BEGIN PKG_HORA_MEDICA.SP_OBTENER_ESPECIALIDADES(?);END;";
            CallableStatement call = (CallableStatement) con.prepareCall(query);
            call.registerOutParameter(1, OracleTypes.CURSOR);
            
            call.execute();
            ResultSet rs = (ResultSet)call.getObject(1);
            while(rs.next()){ 
                Especialidad especialidad = new Especialidad();
                especialidad.setId_especialidad(rs.getInt("id_especialidad"));
                especialidad.setNombre(rs.getString("nombre"));
                lista.add(especialidad);                    
            }            
            
        }
        catch(Exception e){
            System.out.println("Error|ConRubro:listarRubro: "+e.getMessage());
        }                  
        
        return lista;
    }
}
