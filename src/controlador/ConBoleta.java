package controlador;

import database.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import modelo.Boleta;
import oracle.jdbc.OracleTypes;

public class ConBoleta {
    public int generarNumeroBoleta(){
        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection();
        int numeroBoleta;
        try{
            String query = "{? = call PKG_HORA_MEDICA.FN_NUM_BOLETA}";
            CallableStatement call = (CallableStatement) con.prepareCall(query);
            call.registerOutParameter(1, OracleTypes.NUMERIC);
            call.execute();
            
            numeroBoleta = call.getInt(1);
            
        }
        catch(Exception e){
            System.out.println("Error|ConBoleta:generarNumeroBoleta: "+e.getMessage());
            numeroBoleta = -1;
        }
        return numeroBoleta;
    }
    
    public int guardarBoleta(Boleta boleta){
        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection();
        try{
            String query = "BEGIN PKG_HORA_MEDICA.SP_GENERAR_BOLETA(?,?,?,?,?);END;";
            CallableStatement call = (CallableStatement) con.prepareCall(query);
            
            call.setInt(1, boleta.getId_boleta());
            call.setInt(2, boleta.getMonto_total());
            call.setInt(3, boleta.getEmpleado().getId_emp());
            call.setInt(4, boleta.getTipo_pago().getId_tipo_pago());
            call.setInt(5, boleta.getEsp_hora().getId_esphora());
            call.execute();
            System.out.println("Boleta guardada con exito");
            return 1;
        }
        catch(Exception e){
            System.out.println("Error|ConBoleta:guardarBoleta: "+e.getMessage());
            return -1;
        }
    }
}
