package modelo;

public class TipoPago {
    private int id_tipo_pago;
    private String nombre;
    private Moneda moneda;
    
    public TipoPago(){
        this.id_tipo_pago=0;
        this.nombre="";
        this.moneda=new Moneda();
    }

    public int getId_tipo_pago() {
        return id_tipo_pago;
    }

    public void setId_tipo_pago(int id_tipo_pago) {
        this.id_tipo_pago = id_tipo_pago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }
    
    
        
}
