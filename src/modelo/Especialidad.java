package modelo;

public class Especialidad {
    private int id_especialidad;
    private String nombre;
    
    public Especialidad(){
        this.id_especialidad=0;
        this.nombre="";
    }

    public int getId_especialidad() {
        return id_especialidad;
    }

    public void setId_especialidad(int id_especialidad) {
        this.id_especialidad = id_especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
