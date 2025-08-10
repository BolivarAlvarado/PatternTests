package patterntests;

public interface Politica {
    boolean aplicar(Reserva reserva);
    String getDescripcion();
}

