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
    
    public Object[] buscarProveedor(String rut){
        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection();        
        Object[] retorno = new Object[2];
        try{
            String query = "BEGIN PKG_PROVEEDOR.SP_OBTENER_PROVEEDORES(?,?); END;";
            CallableStatement call = (CallableStatement) con.prepareCall(query);
            call.setString(1,rut);
            call.registerOutParameter(2, OracleTypes.CURSOR);
            
            call.execute();
            ResultSet rs = (ResultSet)call.getObject(2);
            while(rs.next()){              
                Proveedor proveedor = new Proveedor();
                proveedor.setId_proveedor(rs.getInt("ID_PROVEEDOR"));
                proveedor.setRut(rs.getInt("RUT"));
                proveedor.setDv(rs.getString("DV"));
                proveedor.setRazon_social(rs.getString("RAZON_SOCIAL"));
                Contacto contacto = new Contacto();
                contacto.setEmail(rs.getString("EMAIL"));
                contacto.setTelefono(rs.getString("TELEFONO"));
                contacto.setNombre(rs.getString("NOMBRECONTACTO"));
                contacto.setId_contacto(rs.getInt("ID_CONTACTO"));
                
                Rubro rubro = new Rubro();
                rubro.setNombre(rs.getString("NOMBRE"));
                rubro.setId_rubro(rs.getInt("ID_RUBRO"));
                
                proveedor.setRubro(rubro);
                contacto.setProveedor(proveedor);                              
                retorno[0]=proveedor;
                retorno[1]=contacto;                       
                
            }
            return retorno;
        }
        catch(Exception e){
            System.out.println("Error|ConProveedor:buscarProveedor: "+e.getMessage());
            Object[] o = {"no hay"};
            return o;
        }  
        
    }
    
    public int actualizarProveedor(int id_proveedor,String razon_social,int id_rubro,String contacto, String telefono, String email){
        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection();
        try{
            String query = "BEGIN PKG_PROVEEDOR.SP_MODIFICAR_PROVEEDOR(?,?,?,?,?,?);END;";
            CallableStatement call = (CallableStatement) con.prepareCall(query);
            call.setInt(1,id_proveedor);
            call.setString(2, razon_social);
            call.setInt(3, id_rubro);
            call.setString(4, contacto);
            call.setString(5, telefono);
            call.setString(6,email);
            
            call.execute();
            return 1;
                    
        }
        catch(Exception e){
            System.out.println("Error|ConProveedor:actualizarProveedor: "+e.getMessage());
            return -1;
        }
        
    }
    
    
   
    
}
