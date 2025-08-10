package Abstract_Factory_Y_Builder.Vehiculo;

public interface VehiculoBuilder {
    VehiculoBuilder setProveedor(String proveedor);
    VehiculoBuilder setColor(String color);
    VehiculoBuilder setHorario(String horario);
    VehiculoBuilder setExtras(String extras);
    Vehiculo build();
}


