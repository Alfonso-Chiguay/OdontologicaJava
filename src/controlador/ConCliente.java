package controlador;

import database.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.Cliente;
import modelo.SitEconomica;
import oracle.jdbc.OracleType;
import oracle.jdbc.OracleTypes;

public class ConCliente {
    public int CrearCliente(Cliente cliente){
        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection();        
        try{
            String query = "BEGIN PKG_CLIENTE.SP_INSERTAR_CLIENTE(?,?,?,?,?,?,?,?);END;";
            CallableStatement call = (CallableStatement) con.prepareCall(query);
            call.setInt(1, cliente.getRut());
            call.setString(2,cliente.getDv());
            call.setString(3,cliente.getNombres());
            call.setString(4,cliente.getApellidos());
            call.setString(5, cliente.getUsuario());
            call.setString(6, cliente.getContrasena());
            call.setString(7, cliente.getEmail());
            call.setInt(8, cliente.getSit_economica().getId_sit_econ());            
            call.executeUpdate();
            
            System.out.println("Cliente creado");
            return 1;
        }
        catch(Exception e){
            System.out.println("Error|ConCliente:CrearCliente: "+e.getMessage());
            return 0;
        }        
    }
    
    public ArrayList<Cliente> filtrarCliente(String rut){
        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection(); 
        ArrayList<Cliente> lista = new ArrayList<>();                
        try{
            String query = "BEGIN PKG_CLIENTE.SP_FILTRAR_CLIENTE(?,?);END;";
            CallableStatement call = (CallableStatement) con.prepareCall(query);
            call.setString(1, rut);
            call.registerOutParameter(2, OracleTypes.CURSOR);
            
            call.execute();
            ResultSet rs = (ResultSet)call.getObject(2);
            while(rs.next()){
                Cliente c = new Cliente();
                c.setId_cliente(rs.getInt("ID_CLIENTE"));
                c.setRut(rs.getInt("RUT"));  
                c.setDv(rs.getString("DV"));
                c.setNombres(rs.getString("NOMBRES"));
                c.setApellidos(rs.getString("APELLIDOS"));
                c.setEmail(rs.getString("EMAIL"));
                lista.add(c);
            }            
        }
        catch(Exception e){
            System.out.println("Error|ConCliente:filtrarCliente: "+e.getMessage());
        }        
        return lista;
    }
    
    public boolean EliminarCliente(int id_cliente){
        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection();
        try{
            String query = "BEGIN PKG_CLIENTE.SP_ELIMINAR_CLIENTE(?); END;";
            CallableStatement call = (CallableStatement) con.prepareCall(query);
            call.setInt(1, id_cliente);
            call.execute();
            
            System.out.println("Cliente eliminado");
            return true;            
        }
        catch(Exception e){
            System.out.println("Error|ConCliente:EliminarCliente: "+e.getMessage());
            return false;
        }        
    }
    
    public Cliente clientePorId(int id_cliente){
        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection(); 
        Cliente c = new Cliente();              
        try{
            String query = "BEGIN PKG_CLIENTE.SP_CLIENTE_POR_ID(?,?);END;";
            CallableStatement call = (CallableStatement) con.prepareCall(query);
            call.setInt(1, id_cliente);
            call.registerOutParameter(2, OracleTypes.CURSOR);
            
            call.execute();
            ResultSet rs = (ResultSet)call.getObject(2);
            while(rs.next()){                
                c.setId_cliente(rs.getInt("ID_CLIENTE"));
                c.setRut(rs.getInt("RUT"));  
                c.setDv(rs.getString("DV"));
                c.setNombres(rs.getString("NOMBRES"));
                c.setApellidos(rs.getString("APELLIDOS"));
                c.setEmail(rs.getString("EMAIL"));
                c.setContrasena(rs.getString("CONTRASENA"));
                
                ConSitEconomica conSite = new ConSitEconomica();
                SitEconomica site = conSite.obtenerPorId(rs.getInt("ID_SIT_ECON"));
                
                c.setSit_economica(site);                               
            }            
        }
        catch(Exception e){
            System.out.println("Error|ConCliente:clientePorId: "+e.getMessage());
        }        
        return c;
    }
    
    
    public int ActualizarCliente(Cliente cliente){
        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection();        
        try{
            String query = "BEGIN PKG_CLIENTE.SP_MODIFICAR_CLIENTE(?,?,?,?,?,?);END;";
            CallableStatement call = (CallableStatement) con.prepareCall(query);
            call.setInt(1, cliente.getId_cliente());           
            call.setString(2,cliente.getNombres());
            call.setString(3,cliente.getApellidos());
            call.setString(4, cliente.getContrasena());
            call.setString(5, cliente.getEmail());
            call.setInt(6, cliente.getSit_economica().getId_sit_econ());            
            call.executeUpdate();
            
            System.out.println("Cliente modificado");
            return 1;
        }
        catch(Exception e){
            System.out.println("Error|ConCliente:ActualizarCliente: "+e.getMessage());
            return 0;
        }        
    }
    
    
}
