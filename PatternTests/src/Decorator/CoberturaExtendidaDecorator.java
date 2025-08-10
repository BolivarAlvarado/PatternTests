package Decorator;

public class CoberturaExtendidaDecorator extends ReservaDecorator {
    private double precioCobertura;

    public CoberturaExtendidaDecorator(ReservaInterface reservaDecorada, double precioCobertura) {
        super(reservaDecorada);
        this.precioCobertura = precioCobertura;
    }

    @Override
    public double getPrecioTotal() {
        return super.getPrecioTotal() + precioCobertura;
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Cobertura extendida";
    }
}

