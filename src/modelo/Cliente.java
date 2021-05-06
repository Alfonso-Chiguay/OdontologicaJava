package modelo;

public class Cliente {
    private int id_cliente;
    private int rut;
    private String dv;
    private String nombres;
    private String apellidos;
    private String usuario;
    private String contrasena;
    private String fecha_creacion;
    private String email;
    private SitEconomica sit_economica;
    
    public Cliente(){
        this.id_cliente=0;
        this.rut=0;
        this.dv="";
        this.nombres="";
        this.apellidos="";
        this.usuario="";
        this.contrasena="";
        this.fecha_creacion="";
        this.email="";
        this.sit_economica=new SitEconomica();
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
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

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SitEconomica getSit_economica() {
        return sit_economica;
    }

    public void setSit_economica(SitEconomica sit_economica) {
        this.sit_economica = sit_economica;
    }
    
    
    
}
