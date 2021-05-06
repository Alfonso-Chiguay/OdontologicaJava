package modelo;

public class OrdenPedido {
    private int id_opedido;
    private String fecha_creacion;
    private boolean recepcionado;
    private String fecha_recepcion;
    private Empleado empleado;
    
    public OrdenPedido(){
        this.id_opedido=0;
        this.fecha_creacion="";
        this.recepcionado=false;
        this.fecha_recepcion="";
        this.empleado=new Empleado();
    }

    public int getId_opedido() {
        return id_opedido;
    }

    public void setId_opedido(int id_opedido) {
        this.id_opedido = id_opedido;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public boolean isRecepcionado() {
        return recepcionado;
    }

    public void setRecepcionado(boolean recepcionado) {
        this.recepcionado = recepcionado;
    }

    public String getFecha_recepcion() {
        return fecha_recepcion;
    }

    public void setFecha_recepcion(String fecha_recepcion) {
        this.fecha_recepcion = fecha_recepcion;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    @Override
    public String toString() {
        return "Orden pedido{"+Integer.toString(id_opedido)+", "+fecha_creacion+", "+empleado.getNombres()+"}";
    }
}
