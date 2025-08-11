package Abstract_Factory_Y_Builder.Vehiculo;

interface VehiculoBuilder {
    
    VehiculoBuilder setProveedor(String proveedor);
    VehiculoBuilder setColor(String color);
    VehiculoBuilder setTipo(String tipo);
    VehiculoBuilder setModelo(String modelo);
    VehiculoBuilder setEstado(EstadoVehiculo estado);
    Vehiculo build();
}
