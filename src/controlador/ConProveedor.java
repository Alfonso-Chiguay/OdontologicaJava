package controlador;

import database.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Contacto;
import modelo.Proveedor;
import modelo.Rubro;
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
    
    public void listarProveedor(String rut, JTable tabla){
        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection();        
        DefaultTableModel table = (DefaultTableModel) tabla.getModel();
        table.setRowCount(0);
        try{
            String query = "BEGIN PKG_PROVEEDOR.SP_OBTENER_PROVEEDORES(?,?); END;";
            CallableStatement call = (CallableStatement) con.prepareCall(query);
            call.setString(1,rut);
            call.registerOutParameter(2, OracleTypes.CURSOR);
            
            call.execute();
            ResultSet rs = (ResultSet)call.getObject(2);
            while(rs.next()){              
                
                Object fila[] = {
                                rs.getInt("ID_PROVEEDOR"),
                                String.valueOf(rs.getInt("RUT"))+"-"+rs.getString("DV"),
                                rs.getString("RAZON_SOCIAL"),
                                rs.getString("EMAIL"),
                                rs.getString("TELEFONO"),
                                rs.getString("NOMBRE")              
              };
              table.addRow(fila);    
            }
            
        }
        catch(Exception e){
            System.out.println("Error|ConProveedor:listarProveedor: "+e.getMessage());
        }                
    }
    
    public boolean eliminarProveedor(int idProveedor){
        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection(); 
        try{
            String query = "BEGIN PKG_PROVEEDOR.SP_ELIMINAR_PROV(?); END;";
            CallableStatement call = (CallableStatement) con.prepareCall(query);
            call.setInt(1,idProveedor);
            call.execute();
            System.out.println("Proveedor eliminado correctamente");
            return true;
        }
        catch(Exception e){
            System.out.println("Error|ConProveedor:eliminarProveedor: "+e.getMessage());
            return false;
        }                
        
    }
    
    public boolean existeProveedor(String rut, String dv){
        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection();  
        String rut_bd="";
        String rut_jv=rut+"-"+dv;
        boolean retorno=false;
        try{
            String query = "BEGIN PKG_PROVEEDOR.SP_OBTENER_PROVEEDORES(?,?); END;";
            CallableStatement call = (CallableStatement) con.prepareCall(query);
            call.setString(1,rut);
            call.registerOutParameter(2, OracleTypes.CURSOR);
            
            call.execute();
            ResultSet rs = (ResultSet)call.getObject(2);
                        
            while(rs.next()){                              
                rut_bd = String.valueOf(rs.getInt("RUT"))+"-"+rs.getString("DV");
                if(rut_bd.equals(rut_jv)) {
                    retorno=true;
                    break;
                }                 
            }
        }
        catch(Exception e){
            System.out.println("Error|ConProveedor:existeProveedor: "+e.getMessage()); 
        }
        
        return retorno;
    }
}
