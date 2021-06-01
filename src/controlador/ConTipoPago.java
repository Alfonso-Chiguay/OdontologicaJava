package controlador;

import database.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.Moneda;
import modelo.TipoPago;
import oracle.jdbc.OracleTypes;

public class ConTipoPago {
    public ArrayList<TipoPago> listarTPagoPorMoneda(int id_moneda){
        ArrayList<TipoPago> lista = new ArrayList<TipoPago>();
        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection();
        try{
            String query = "BEGIN PKG_HORA_MEDICA.SP_OBTENER_TPAGOS(?,?);END;";
            CallableStatement call = (CallableStatement) con.prepareCall(query);
            call.setInt(1, id_moneda);
            call.registerOutParameter(2, OracleTypes.CURSOR);
            call.execute();
            
            ResultSet rs = (ResultSet)call.getObject(2);
            while(rs.next()){
                TipoPago tpago = new TipoPago();
                tpago.setId_tipo_pago(rs.getInt("ID_TIPO_PAGO"));
                tpago.setNombre(rs.getString("NOMBRE"));                                
                        
                lista.add(tpago);                
            }   
        }
        catch(Exception e){
            System.out.println("Error|ConTipoPago:listarTPago: "+e.getMessage());
        }
        
        return lista;
    }
}
