package odontologicaescritorio;
import vista.Login;
import database.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import sun.security.util.Length;

public class main {

        public static void main(String[] args) {
            ArrayList<String> lista = new ArrayList<>();
            Conexion conexion = new Conexion();
            try {
            Connection conn = conexion.getConnection();
            Statement stmt = conn.createStatement();
            String consulta = "SELECT razon_social FROM empresa";
            ResultSet rs = stmt.executeQuery(consulta);
            
            while(rs.next()){
                lista.add(rs.getString(1));
                System.out.println(rs.getString(1));
            }
            
            if(lista.contains("empresa de prueba")){
                System.out.println("YES");
            }
        } 
        catch (Exception e) {
            System.out.println("ERROR [Query]: "+e.getMessage());
        }        
            Login ventanaLogin = new Login();
            ventanaLogin.setVisible(true);
             
    }
    
}
