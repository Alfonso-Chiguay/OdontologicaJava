package modelo;

public class Horario {
    private int id_horario;
    private int dia;
    private String hora_ini;
    private String hora_fin;
    
    public Horario(){
        this.id_horario=0;
        this.dia=0;
        this.hora_ini="";
        this.hora_fin="";
    }

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getHora_ini() {
        return hora_ini;
    }

    public void setHora_ini(String hora_ini) {
        this.hora_ini = hora_ini;
    }

    public String getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(String hora_fin) {
        this.hora_fin = hora_fin;
    }
    
    
}
