package controlador;

import database.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.Producto;
import oracle.jdbc.OracleTypes;

public class ConProducto {
    public ArrayList<Producto> listarProducto(){
        ArrayList<Producto> lista = new ArrayList<>();
        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection();
        try{
            String query = "BEGIN PKG_ORDEN_PEDIDO.SP_LISTAR_PRODUCTOS(?); END;";
            CallableStatement call = (CallableStatement) con.prepareCall(query);
            call.registerOutParameter(1, OracleTypes.CURSOR);
            
            call.execute();
            ResultSet rs = (ResultSet)call.getObject(1);
            while(rs.next()){
                Producto producto = new Producto();
                producto.setId_producto(rs.getInt("ID_PRODUCTO"));
                producto.setNombre(rs.getString("NOMBRE"));
                producto.setStock_real(rs.getInt("STOCK_REAL"));
                producto.setStock_critico(rs.getInt("STOCK_CRITICO"));
                producto.setPrecio_costo(rs.getInt("PRECIO_COSTO"));
                lista.add(producto);
            }
        }
        catch(Exception e){
            System.out.println("Error|ConProducto:listarProducto: "+e.getMessage());
        }
        
        return lista;
    }
}
