package patterntests;

public class EstadoVueloEjemplo implements EstadoVuelo {
    private String nombre;

    public EstadoVueloEjemplo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void confirmar(Reserva r) {
        System.out.println("Estado vuelo ("+nombre+"): confirmar reserva " + r.getIdReserva());
    }

    @Override
    public void modificar(Reserva r) {
        System.out.println("Estado vuelo ("+nombre+"): modificar reserva " + r.getIdReserva());
    }

    @Override
    public void cancelar(Reserva r) {
        System.out.println("Estado vuelo ("+nombre+"): cancelar reserva " + r.getIdReserva());
    }

    @Override
    public String getNombreEstado() {
        return nombre;
    }
}

