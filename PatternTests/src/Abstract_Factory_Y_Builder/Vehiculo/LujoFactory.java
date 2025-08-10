package Abstract_Factory_Y_Builder.Vehiculo;

public class LujoFactory implements VehiculoFactory {
    @Override
    public Vehiculo crearVehiculo() {
        return new VehiculoLujo();
    }
}
