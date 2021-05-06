package modelo;

public class Rubro {
    private int id_rubro;
    private String nombre;
    
    public Rubro(){
        this.id_rubro=0;
        this.nombre="";
    }

    public int getId_rubro() {
        return id_rubro;
    }

    public void setId_rubro(int id_rubro) {
        this.id_rubro = id_rubro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
