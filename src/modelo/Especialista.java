package modelo;

public class Especialista {
    private int id_esp;
    private String nombres;
    private String apellidos;
    private Especialidad especialidad;
    
    public Especialista(){
        this.id_esp=0;
        this.nombres="";
        this.apellidos="";
        this.especialidad=new Especialidad();
    }

    public int getId_esp() {
        return id_esp;
    }

    public void setId_esp(int id_esp) {
        this.id_esp = id_esp;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
    
    
}
