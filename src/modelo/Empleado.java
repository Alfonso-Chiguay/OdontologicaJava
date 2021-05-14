package modelo;

public class Empleado {
    private int id_emp;
    private int rut;
    private String dv;
    private String nombres;
    private String apellidos;
    private Sucursal sucursal;
    private Cargo cargo;
    private Rol rol;
    private String usuario;
    private String contrasena;
    
    public Empleado(){
        this.id_emp = 0;
        this.rut = 0;
        this.dv="";
        this.nombres="";
        this.apellidos="";
        this.sucursal=new Sucursal();
        this.cargo=new Cargo();
        this.rol=new Rol();
        this.usuario="";
        this.contrasena="";
    }

    public int getId_emp() {
        return id_emp;
    }

    public void setId_emp(int id_emp) {
        this.id_emp = id_emp;
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

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
    @Override
    public String toString() {
        return "Empleado{"+nombres+" "+apellidos+", "+cargo.getNombre()+"}";
    }
}
