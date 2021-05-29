package controlador;

import database.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;

public class ConOrdenPedido {
    public int generarNumPedido(){
        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection();
        int numPedido=-1;
        try{
            String query = "{? = call PKG_ORDEN_PEDIDO.FN_NUM_OPEDIDO}";
            CallableStatement call = (CallableStatement) con.prepareCall(query);
            call.registerOutParameter(1, OracleTypes.NUMERIC);
            call.execute();
            
            numPedido = call.getInt(1);
        }
        catch(Exception e){
            System.out.println("Error|ConOrdenPedido:generarNumPedido: "+e.getMessage());
        }      
        
        return numPedido;
    }   
   
    public int crearOPedidoInicial(int idOPedido, int idEmpleado){
        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection();
        int respuesta=-1;
        try{
            String query="BEGIN PKG_ORDEN_PEDIDO.SP_GENERAR_OPEDIDO(?,?);END;";
            CallableStatement call = (CallableStatement) con.prepareCall(query);
            call.setInt(1, idOPedido);
            call.setInt(2, idEmpleado);
            call.execute();
            respuesta=1;
        }
        catch(Exception e){
            System.out.println("Error|ConOrdenPedido:crearOPedido: "+e.getMessage());
        }               
        return respuesta;
    }
    
    public void asociarOPedido(int idOPedido, int idProducto, int cantidad, int precio){
        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection();
        
        try{
            String query="BEGIN PKG_ORDEN_PEDIDO.SP_ASOCIAR_OPEDIDO_PROD(?,?,?,?);END;";
            CallableStatement call = (CallableStatement) con.prepareCall(query);
            call.setInt(1, idOPedido);
            call.setInt(2, idProducto);
            call.setInt(3, cantidad);
            call.setInt(4, precio);
            call.execute();
            
        }
        catch(Exception e){
            System.out.println("Error|ConOrdenPedido:asociarOPedido: "+e.getMessage());
        }               
        
    }

    public ArrayList<Object[]> obtenerOPedido(int idOPedido){
        ArrayList<Object[]> listaOpedido = new ArrayList<Object[]>();
        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection();
        try{
            String query="BEGIN PKG_ORDEN_PEDIDO.SP_OBTENER_OPEDIDO(?,?);END;";
            CallableStatement call = (CallableStatement) con.prepareCall(query);
            call.setInt(1, idOPedido);
            call.registerOutParameter(2, OracleTypes.CURSOR);
            call.execute();
            
            ResultSet rs = (ResultSet)call.getObject(2);
            
            while(rs.next()){
                if(rs.getString("RECEPCIONADO").equals("Y")){
                    Object[] o={                        
                        rs.getString("NOMBRES")+" "+rs.getString("APELLIDOS"),
                        rs.getString("FECHA_RECEPCION"),
                        rs.getString("FECHA_CREACION"),
                        rs.getString("ESTADO"),
                        rs.getInt("ID_PRODUCTO"),
                        rs.getInt("CANTIDAD"),
                        rs.getInt("PRECIO_CLP"),
                        rs.getInt("CANTIDAD")*rs.getInt("PRECIO_CLP"),
                        rs.getString("NOMBRE")                    
                    }; 
                    
                    listaOpedido.add(o);                    
                }
                else{
                    Object[] o={
                        rs.getString("NOMBRES")+" "+rs.getString("APELLIDOS"),
                        "NO HA SIDO RECEPCIONADO",
                        rs.getString("FECHA_CREACION"),
                        rs.getString("ESTADO"),
                        rs.getInt("ID_PRODUCTO"),
                        rs.getInt("CANTIDAD"),
                        rs.getInt("PRECIO_CLP"),
                        rs.getInt("CANTIDAD")*rs.getInt("PRECIO_CLP"),
                        rs.getString("NOMBRE")                    
                    }; 
                    
                    listaOpedido.add(o); 
                }
            }
        }
        catch(Exception e){
            System.out.println("Error|ConOrdenPedido:obtenerOPedido: "+e.getMessage());
            Object[] o={"NO EXISTE"};
            listaOpedido.clear();
            listaOpedido.add(o);
        }
        
        return listaOpedido;
    }
    
    public int aprobarRechazar(int idOPedido, String estado){
        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection();
        try{
            String query = "BEGIN PKG_ORDEN_PEDIDO.SP_APROBAR_RECHAZAR(?,?);END;";
            CallableStatement call = (CallableStatement) con.prepareCall(query);
            call.setInt(1, idOPedido);
            call.setString(2, estado);
            call.execute();
            if(estado.equals("A")) System.out.println("ORDEN APROBADA");
            else System.out.println("ORDEN RECHAZADA");
            
            return 1;
        }
        catch(Exception e){
            System.out.println("Error|ConOrdenPedido:aprobarRechazar: "+e.getMessage());
            return -1;
        }
        
    }
    
}
    


