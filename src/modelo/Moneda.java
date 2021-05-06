package modelo;

public class Moneda {
    private int id_moneda;
    private String abreviacion;
    private String nombre;
    private int valor_clp;
    
    public Moneda(){
        this.id_moneda=0;
        this.abreviacion="";
        this.nombre="";
        this.valor_clp=0;
    }

    public int getId_moneda() {
        return id_moneda;
    }

    public void setId_moneda(int id_moneda) {
        this.id_moneda = id_moneda;
    }

    public String getAbreviacion() {
        return abreviacion;
    }

    public void setAbreviacion(String abreviacion) {
        this.abreviacion = abreviacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor_clp() {
        return valor_clp;
    }

    public void setValor_clp(int valor_clp) {
        this.valor_clp = valor_clp;
    }
    
    
}
