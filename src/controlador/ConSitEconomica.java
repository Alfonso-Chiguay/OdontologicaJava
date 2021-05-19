package controlador;

import database.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.SitEconomica;
import oracle.jdbc.OracleTypes;

public class ConSitEconomica {
    public ArrayList<SitEconomica> listarSituaciones(){
        ArrayList<SitEconomica> lista = new ArrayList<>();
        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection();
        try{
            String query = "BEGIN PKG_SIT_ECONOMICA.SP_OBTENER_SITUACIONES(?);END;";
            CallableStatement call = (CallableStatement) con.prepareCall(query);
            call.registerOutParameter(1, OracleTypes.CURSOR);
            
            call.execute();
            ResultSet rs = (ResultSet)call.getObject(1);
            while(rs.next()){
                SitEconomica sitec = new SitEconomica();
                sitec.setId_sit_econ(rs.getInt("id_sit_econ"));
                sitec.setIngreso_min(rs.getInt("ingreso_min"));
                sitec.setIngreso_max(rs.getInt("ingreso_max"));
                lista.add(sitec);
            }
        }
        catch(Exception e){
            System.out.println("Error|ConSitEconomica:listarSituaciones: "+e.getMessage());
        }        
        return lista;
    }
    
    public SitEconomica obtenerPorId(int id_site){
        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection();
        SitEconomica sitec = new SitEconomica();
        try{
            String query = "BEGIN PKG_SIT_ECONOMICA.sp_obtener_sitEconomica(?,?);END;";
            CallableStatement call = (CallableStatement) con.prepareCall(query);
            call.setInt(1, id_site);
            call.registerOutParameter(2, OracleTypes.CURSOR);
            
            call.execute();
            ResultSet rs = (ResultSet)call.getObject(2);
            while(rs.next()){               
                sitec.setId_sit_econ(rs.getInt("id_sit_econ"));
                sitec.setIngreso_min(rs.getInt("ingreso_min"));
                sitec.setIngreso_max(rs.getInt("ingreso_max"));                
            }            
        }
        catch(Exception e){
            System.out.println("Error|ConSitEconomica:obtenerPorId: "+e.getMessage());
        } 
        return sitec;
    }
}
