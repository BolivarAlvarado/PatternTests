package patterntests;

public class VehiculoDisponibleState implements EstadoVehiculo {
    @Override
    public void confirmar(VehiculoConcrete v) {
        System.out.println("Confirmando vehículo...");
        v.setEstado(new VehiculoReservadoState());
    }

    @Override
    public void mantener(VehiculoConcrete v) {
        System.out.println("Mandando vehículo a mantenimiento...");
        v.setEstado(new VehiculoMantenimientoState());
    }

    @Override
    public void liberar(VehiculoConcrete v) {
        System.out.println("Vehículo ya está disponible.");
    }

    @Override
    public String getEstadoNombre() { return "Disponible"; }
}

