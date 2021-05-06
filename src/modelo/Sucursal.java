package modelo;

public class Sucursal {
    private int id_sucursal;
    private String direccion;
    private int id_encargado;
    private Empleado empleado;
    private Empresa empresa;
    private Comuna comuna;
    
    public Sucursal(){
        this.id_sucursal=0;
        this.direccion="";
        this.id_encargado=0;
        this.empleado= new Empleado();
        this.empresa= new Empresa();
        this.comuna = new Comuna();
    }

    public int getId_sucursal() {
        return id_sucursal;
    }

    public void setId_sucursal(int id_sucursal) {
        this.id_sucursal = id_sucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getId_encargado() {
        return id_encargado;
    }

    public void setId_encargado(int id_encargado) {
        this.id_encargado = id_encargado;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Comuna getComuna() {
        return comuna;
    }

    public void setComuna(Comuna comuna) {
        this.comuna = comuna;
    }
    
    
    
    
    @Override
    public String toString() {
        return "Sucursal{"+direccion+"}";
    }
}
