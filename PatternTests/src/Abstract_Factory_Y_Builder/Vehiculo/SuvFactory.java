package Abstract_Factory_Y_Builder.Vehiculo;

public class SuvFactory implements VehiculoFactory {
    @Override
    public Vehiculo crearVehiculo() {
        return new VehiculoSuv();
    }
}
