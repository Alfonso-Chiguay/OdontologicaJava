package modelo;

public class Boleta {
    private int id_boleta;
    private String fecha;
    private int monto_total;
    private TipoPago tipo_pago;
    private Empleado empleado;
    private EspHora esp_hora;
    
    public Boleta(){
        this.id_boleta=0;
        this.fecha="";
        this.monto_total=0;
        this.tipo_pago= new TipoPago();
        this.empleado=new Empleado();
        this.esp_hora=new EspHora();
    }

    public int getId_boleta() {
        return id_boleta;
    }

    public void setId_boleta(int id_boleta) {
        this.id_boleta = id_boleta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getMonto_total() {
        return monto_total;
    }

    public void setMonto_total(int monto_total) {
        this.monto_total = monto_total;
    }

    public TipoPago getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(TipoPago tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public EspHora getEsp_hora() {
        return esp_hora;
    }

    public void setEsp_hora(EspHora esp_hora) {
        this.esp_hora = esp_hora;
    }
    
    
}
