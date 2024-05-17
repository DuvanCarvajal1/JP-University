import java.util.*;

public class Ayuda {
   

    Estado estado;
    private Date fechaAsignacion;
    private Date fechaEntrega;

    public Ayuda() {
    }

    public Ayuda(Estado estado, Date fechaAsignacion, Date fechaEntrega) {
        this.estado = estado;
        this.fechaAsignacion = fechaAsignacion;
        this.fechaEntrega = fechaEntrega;
    }
    

    public Estado getEstado() {
        return estado;
    }

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }


    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String imprimirInfoAyudas()
    {
        String informacion;
        informacion =  estado  + ", " + fechaAsignacion.obtenerFecha() + ", " + fechaEntrega.obtenerFecha();
        return informacion;
    }
   public String imprimirInfoNoAyudas(){
        String informacion;
        informacion = estado;
        return informacion;
   }
    public String imprimirAyudas()
    {
        String informacion;
        informacion = estado ;
        return informacion;
    }
}

