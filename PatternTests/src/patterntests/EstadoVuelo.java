package patterntests;

public interface EstadoVuelo {
    void confirmar(Reserva r);
    void modificar(Reserva r);
    void cancelar(Reserva r);
    String getNombreEstado();
}
