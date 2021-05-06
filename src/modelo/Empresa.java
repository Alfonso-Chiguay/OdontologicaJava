package modelo;

public class Empresa {
    private int id_empresa;
    private String razon_social;
    private int rut;
    private String dv;
    
    public Empresa(){
        this.id_empresa=0;
        this.razon_social="";
        this.rut=0;
        this.dv="";
    }

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }
    
    @Override
    public String toString() {
        return "Empresa{"+razon_social+"}";
    }
}
