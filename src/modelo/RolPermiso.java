package modelo;

public class RolPermiso {
    private int id_rol_per;
    private boolean per_activo;
    private Rol rol;
    private Permiso permiso;
    
    public RolPermiso(){
        this.id_rol_per=0;
        this.per_activo=false;
        this.rol=new Rol();
        this.permiso=new Permiso();
    }

    public int getId_rol_per() {
        return id_rol_per;
    }

    public void setId_rol_per(int id_rol_per) {
        this.id_rol_per = id_rol_per;
    }

    public boolean isPer_activo() {
        return per_activo;
    }

    public void setPer_activo(boolean per_activo) {
        this.per_activo = per_activo;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Permiso getPermiso() {
        return permiso;
    }

    public void setPermiso(Permiso permiso) {
        this.permiso = permiso;
    }

}

