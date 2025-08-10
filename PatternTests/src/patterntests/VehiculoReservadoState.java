package patterntests;

public class VehiculoReservadoState implements EstadoVehiculo {
    @Override
    public void confirmar(VehiculoConcrete v) {
        System.out.println("Vehículo ya reservado.");
    }

    @Override
    public void mantener(VehiculoConcrete v) {
        v.setEstado(new VehiculoMantenimientoState());
    }

    @Override
    public void liberar(VehiculoConcrete v) {
        v.setEstado(new VehiculoDisponibleState());
    }

    @Override
    public String getEstadoNombre() { return "Reservado"; }
}

