package controlador;

import database.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.EspHora;
import modelo.Especialidad;
import modelo.Especialista;
import modelo.Horario;
import oracle.jdbc.OracleTypes;

public class ConEspHora {
    public ArrayList<EspHora> listarEspHora(int id_especialidad, String fecha){
        //fecha en formato dd-MM-yyyy
        
        ArrayList<EspHora> listaRetorno = new ArrayList<>();
        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection();
        
        int day = Integer.parseInt(fecha.split("-")[0]);
        int month = Integer.parseInt(fecha.split("-")[1]);
        int year = Integer.parseInt(fecha.split("-")[2]);
        
        try{
            String query= "BEGIN PKG_HORA_MEDICA.SP_HORAS_DISP(?,?,?,?,?);END;";
            CallableStatement call = (CallableStatement) con.prepareCall(query);
            call.setInt(1, id_especialidad);
            call.setInt(2, day);
            call.setInt(3, month);
            call.setInt(4, year);
            call.registerOutParameter(5, OracleTypes.CURSOR);
            
            call.execute();
            ResultSet rs = (ResultSet)call.getObject(5);
            while(rs.next()){ 
                Especialista especialista = new Especialista();
                especialista.setId_esp(rs.getInt("ID_ESP"));
                especialista.setNombres(rs.getString("NOMBRES"));
                especialista.setApellidos(rs.getString("APELLIDOS"));
                
                Especialidad especialidad = new Especialidad();
                especialidad.setId_especialidad(id_especialidad);
                especialidad.setNombre(rs.getString("NOMBRE"));
                
                especialista.setEspecialidad(especialidad);
                
                Horario horario = new Horario();
                horario.setId_horario(rs.getInt("ID_HORARIO"));
                horario.setDia(day);
                horario.setMes(month);
                horario.setAnio(year);
                horario.setHora_ini(rs.getString("HORA_INI"));
                horario.setHora_fin(rs.getString("HORA_FIN"));
                
                EspHora espHora = new EspHora();
                espHora.setDisponible(true);
                espHora.setEspecialista(especialista);
                espHora.setHorario(horario);
                espHora.setId_esphora(rs.getInt("ID_ESPHORA"));
                
                listaRetorno.add(espHora);
            }  
        }
        catch(Exception e){
            System.out.println("Error|ConEspHora:listarEspHora: "+e.getMessage());
        }
        
        return listaRetorno;
    }
    
    public int reservarHora(int id_espHora, int id_cliente){
        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection();
        
        try{
            String query= "BEGIN PKG_HORA_MEDICA.SP_TOMAR_HORA(?,?);END;";
            CallableStatement call = (CallableStatement) con.prepareCall(query);
            call.setInt(1, id_espHora);
            call.setInt(2, id_cliente);
            call.execute();
            return 1;
        }
        catch(Exception e){
            System.out.println("Error|ConEspHora:reservarHora: "+e.getMessage());
            return 0;
        }
    }
}
