package Abstract_Factory_Y_Builder.Vehiculo;

public class EconomicoFactory implements VehiculoFactory {
    @Override
    public Vehiculo crearVehiculo() {
        return new VehiculoEconomico();
    }
}

