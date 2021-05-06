package modelo;

public class Producto {
    private int id_producto;
    private String nombre;
    private int stock_real;
    private int stock_critico;
    private int precio_costo;
    private Categoria categoria;
    private Proveedor proveedor;
    
    public Producto(){
        this.id_producto=0;
        this.nombre="";
        this.stock_real=0;
        this.stock_critico=0;
        this.precio_costo=0;
        this.categoria = new Categoria();
        this.proveedor = new Proveedor();
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock_real() {
        return stock_real;
    }

    public void setStock_real(int stock_real) {
        this.stock_real = stock_real;
    }

    public int getStock_critico() {
        return stock_critico;
    }

    public void setStock_critico(int stock_critico) {
        this.stock_critico = stock_critico;
    }

    public int getPrecio_costo() {
        return precio_costo;
    }

    public void setPrecio_costo(int precio_costo) {
        this.precio_costo = precio_costo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    
    
}
