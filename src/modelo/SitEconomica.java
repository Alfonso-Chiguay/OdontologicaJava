package modelo;

public class SitEconomica {
    private int id_sit_econ;
    private int ingreso_min;
    private int ingreso_max;
    
    public SitEconomica(){
        this.id_sit_econ=0;
        this.ingreso_min=0;
        this.ingreso_max=0;
    }

    public int getId_sit_econ() {
        return id_sit_econ;
    }

    public void setId_sit_econ(int id_sit_econ) {
        this.id_sit_econ = id_sit_econ;
    }

    public int getIngreso_min() {
        return ingreso_min;
    }

    public void setIngreso_min(int ingreso_min) {
        this.ingreso_min = ingreso_min;
    }

    public int getIngreso_max() {
        return ingreso_max;
    }

    public void setIngreso_max(int ingreso_max) {
        this.ingreso_max = ingreso_max;
    }
    
}
