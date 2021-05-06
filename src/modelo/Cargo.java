package modelo;
    
    
public class Cargo {
    private int id_cargo;
    private String nombre;
    
    public Cargo(){
        this.id_cargo=0;
        this.nombre="";
    }

    public int getId_cargo() {
        return id_cargo;
    }

    public void setId_cargo(int id_cargo) {
        this.id_cargo = id_cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return "Cargo{"+nombre+"}";
    }
}
