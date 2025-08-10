package Decorator;

public class SeguroViajeDecorator extends ReservaDecorator {
    private double precioSeguro;

    public SeguroViajeDecorator(ReservaInterface reservaDecorada, double precioSeguro) {
        super(reservaDecorada);
        this.precioSeguro = precioSeguro;
    }

    @Override
    public double getPrecioTotal() {
        return super.getPrecioTotal() + precioSeguro;
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Seguro de viaje";
    }
}
