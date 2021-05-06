package modelo;

public class Comuna {
    private int id_comuna;
    private String nombre;
    private Region region;
    
    public Comuna(){
        this.id_comuna=0;
        this.nombre="";
        this.region = new Region();
    }

    public int getId_comuna() {
        return id_comuna;
    }

    public void setId_comuna(int id_comuna) {
        this.id_comuna = id_comuna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
    
    @Override
    public String toString() {
        return "Comuna{"+nombre+"}";
    }
}
