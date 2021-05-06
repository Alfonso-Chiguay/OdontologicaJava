package modelo;

public class OpedProduc {
    private int id_op_prod;
    private int cantidad;
    private int precio_clp;
    private OrdenPedido ordenpedido;
    private Producto producto;
    
    public OpedProduc(){
        this.id_op_prod=0;
        this.cantidad=0;
        this.precio_clp=0;
        this.ordenpedido = new OrdenPedido();
        this.producto = new Producto();
    }

    public int getId_op_prod() {
        return id_op_prod;
    }

    public void setId_op_prod(int id_op_prod) {
        this.id_op_prod = id_op_prod;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio_clp() {
        return precio_clp;
    }

    public void setPrecio_clp(int precio_clp) {
        this.precio_clp = precio_clp;
    }

    public OrdenPedido getOrdenpedido() {
        return ordenpedido;
    }

    public void setOrdenpedido(OrdenPedido ordenpedido) {
        this.ordenpedido = ordenpedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
}
