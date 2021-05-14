package controlador;
import database.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import modelo.Cargo;
import modelo.Empleado;
import modelo.Rol;
import modelo.Sucursal;
import oracle.jdbc.OracleTypes;

public class ConEmpleado {
    public Empleado obtenerEmpleado(String usuario, String contrasena){
        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection();
        Empleado empleado = new Empleado();
        try{
            String query = "BEGIN PKG_EMPLEADO.SP_OBTENER_EMPLEADO(?,?,?);END;";
            CallableStatement call = (CallableStatement) con.prepareCall(query);
            call.setString(1, usuario);
            call.setString(2,contrasena);
            call.registerOutParameter(3, OracleTypes.CURSOR);
            
            call.execute();
            ResultSet rs = (ResultSet)call.getObject(3);
            
            while(rs.next()){
                          
                Rol rol = new Rol();
                rol.setId_rol(rs.getInt("id_rol"));

                Sucursal sucursal = new Sucursal();
                sucursal.setId_sucursal(rs.getInt("id_sucursal"));

                Cargo cargo = new Cargo();
                cargo.setId_cargo(rs.getInt("id_cargo"));

                empleado.setId_emp(rs.getInt("id_emp"));
                empleado.setRut(rs.getInt("rut"));
                empleado.setDv(rs.getString("dv"));
                empleado.setNombres(rs.getString("nombres"));
                empleado.setApellidos(rs.getString("apellidos"));
                empleado.setRol(rol);
                empleado.setSucursal(sucursal);
                empleado.setCargo(cargo);
                empleado.setUsuario(usuario);
                empleado.setContrasena(contrasena);
            }
            
        }
        catch(Exception e){
            System.out.println("Error|ConEmpleado:obtenerEmpleado: "+e.getMessage());
            empleado.setId_emp(0);
        }
        return empleado;
    }
}
