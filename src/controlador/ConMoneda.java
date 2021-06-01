package controlador;

import database.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.Moneda;
import oracle.jdbc.OracleTypes;

public class ConMoneda {
    public ArrayList<Moneda> listarMonedas(){
        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection();
        ArrayList<Moneda> lista = new ArrayList<Moneda>();
        try{
            String query = "BEGIN PKG_HORA_MEDICA.SP_OBTENER_MONEDAS(?);END;";
            CallableStatement call = (CallableStatement) con.prepareCall(query);
            call.registerOutParameter(1, OracleTypes.CURSOR);
            call.execute();
            
            ResultSet rs = (ResultSet)call.getObject(1);
            while(rs.next()){
                Moneda m = new Moneda();
                m.setId_moneda(rs.getInt("ID_MONEDA"));
                m.setAbreviacion(rs.getString("ABREVIACION"));
                m.setNombre(rs.getString("NOMBRE"));
                m.setValor_clp(rs.getInt("VALOR_CLP"));
                lista.add(m);                
            }   
            
        }
        catch(Exception e){
            System.out.println("Error|ConMoneda:listarMonedas: "+e.getMessage());
        }
        
        return lista;
    }
    

    
}
