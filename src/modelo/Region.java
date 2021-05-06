
package modelo;

public class Region {
    private int id_region;
    private String nombre;
    
    public Region(){
        this.id_region=0;
        this.nombre="";
    }

    public int getId_region() {
        return id_region;
    }

    public void setId_region(int id_region) {
        this.id_region = id_region;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return "Region{"+nombre+"}";
    }
}
