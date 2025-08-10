package patterntests;

public abstract class ReservaDecorator implements ReservaInterface {
    protected ReservaInterface reservaDecorada;

    public ReservaDecorator(ReservaInterface reservaDecorada) {
        this.reservaDecorada = reservaDecorada;
    }

    @Override
    public double getPrecioTotal() {
        return reservaDecorada.getPrecioTotal();
    }

    @Override
    public String getDescripcion() {
        return reservaDecorada.getDescripcion();
    }

    @Override
    public void confirmarReserva() {
        reservaDecorada.confirmarReserva();
    }

    @Override
    public void cancelarReserva() {
        reservaDecorada.cancelarReserva();
    }
}
