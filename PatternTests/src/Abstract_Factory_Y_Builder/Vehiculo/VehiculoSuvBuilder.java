package Abstract_Factory_Y_Builder.Vehiculo;

class VehiculoSuvBuilder implements VehiculoBuilder {
    private VehiculoSuv vehiculo;

    public VehiculoSuvBuilder() {
        this.vehiculo = new VehiculoSuv();
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
    public VehiculoBuilder setTipo(String tipo) {
        vehiculo.tipo = tipo;
        return this;
    }

    @Override
    public VehiculoBuilder setModelo(String modelo) {
        vehiculo.modelo = modelo;
        return this;
    }

    @Override
    public VehiculoBuilder setEstado(EstadoVehiculo estado) {
        vehiculo.estado = estado;
        return this;
    }

    @Override
    public Vehiculo build() {
        return vehiculo;
    }
}


