package modelo;

public class Informe {
    private int id_informe;
    private String fecha_emision;
    private String formato;
    private String nombre;
    private Empleado empleado;
    
    public Informe(){
        this.id_informe=0;
        this.fecha_emision="";
        this.formato="";
        this.nombre="";
        this.empleado = new Empleado();
    }

    public int getId_informe() {
        return id_informe;
    }

    public void setId_informe(int id_informe) {
        this.id_informe = id_informe;
    }

    public String getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(String fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    

}
