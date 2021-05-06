package modelo;

public class Permiso {
    private int id_permiso;
    private String nombre;
    
    public Permiso(){
        this.id_permiso=0;
        this.nombre="";
    }

    public int getId_permiso() {
        return id_permiso;
    }

    public void setId_permiso(int id_permiso) {
        this.id_permiso = id_permiso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
