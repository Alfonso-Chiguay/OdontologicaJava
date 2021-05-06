package modelo;

public class Proveedor {
    private int id_proveedor;
    private int rut;
    private String dv;
    private String razon_social;
    private String fecha_creacion;
    private Rubro rubro;
    
    public Proveedor(){
        this.id_proveedor=0;
        this.rut=0;
        this.dv="";
        this.razon_social="";
        this.fecha_creacion="";
        this.rubro = new Rubro();
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
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

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Rubro getRubro() {
        return rubro;
    }

    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }
    
    
}
