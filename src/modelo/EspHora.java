package modelo;

public class EspHora {
    private int id_esphora;
    private boolean disponible;
    private Especialista especialista;
    private Horario horario;
    private Cliente cliente;
    
    public EspHora(){
        this.id_esphora=0;
        this.disponible=false;
        this.especialista=new Especialista();
        this.horario = new Horario();        
    }

    public int getId_esphora() {
        return id_esphora;
    }

    public void setId_esphora(int id_esphora) {
        this.id_esphora = id_esphora;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Especialista getEspecialista() {
        return especialista;
    }

    public void setEspecialista(Especialista especialista) {
        this.especialista = especialista;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}
