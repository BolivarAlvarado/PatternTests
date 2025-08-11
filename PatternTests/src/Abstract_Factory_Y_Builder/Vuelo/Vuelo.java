package Abstract_Factory_Y_Builder.Vuelo;

import java.time.LocalDateTime;

public abstract class Vuelo {
    protected EstadoVuelo estado;
    protected String idVuelo;
    protected String origen;
    protected String destino;
    protected LocalDateTime fechaSalida;
    protected LocalDateTime fechaLlegada;
    protected double precioBase;
    protected int asientosDisponibles;
    protected int capacidad;
    
    public abstract void mostrarDetalles();

    public void setEstado(EstadoVuelo estado) {
        this.estado = estado;
    }

    public void setIdVuelo(String idVuelo) {
        this.idVuelo = idVuelo;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setFechaLlegada(LocalDateTime fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void setAsientosDisponibles(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
