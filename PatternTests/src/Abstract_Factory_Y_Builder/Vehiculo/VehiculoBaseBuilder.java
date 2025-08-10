package Abstract_Factory_Y_Builder.Vehiculo;

public class VehiculoBaseBuilder implements VehiculoBuilder {
    private Vehiculo vehiculo;

    public VehiculoBaseBuilder(VehiculoFactory factory) {
        this.vehiculo = factory.crearVehiculo(); // Aquí usa Abstract Factory
    }

    @Override
    public VehiculoBuilder setProveedor(String proveedor) {
        vehiculo.setProveedor(proveedor);
        return this;
    }

    @Override
    public VehiculoBuilder setColor(String color) {
        vehiculo.setColor(color);
        return this;
    }

    @Override
    public VehiculoBuilder setHorario(String horario) {
        vehiculo.setHorario(horario);
        return this;
    }

    @Override
    public VehiculoBuilder setExtras(String extras) {
        vehiculo.setExtra(extras);
        return this;
    }

    @Override
    public Vehiculo build() {
        return vehiculo;
    }
}