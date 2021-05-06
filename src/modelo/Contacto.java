package modelo;

public class Contacto {
    private int id_contacto;
    private String nombre;
    private String telefono;
    private String email;
    private Proveedor proveedor;
    
    public Contacto(){
        this.id_contacto=0;
        this.nombre="";
        this.telefono ="";
        this.email="";
        this.proveedor = new Proveedor();
    }

    public int getId_contacto() {
        return id_contacto;
    }

    public void setId_contacto(int id_contacto) {
        this.id_contacto = id_contacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    
    
}

