package Abstract_Factory_Y_Builder.Vehiculo;

public class DirectorVehiculo {
    private VehiculoBuilder builder;

    public DirectorVehiculo(VehiculoBuilder builder) {
        this.builder = builder;
    }

    public Vehiculo construirAutoBasico() {
        return builder.setTipo("Auto")
                      .setProveedor("Ford")
                      .setModelo("Focus")
                      .setColor("Blanco")
                      .setEstado(EstadoVehiculo.DISPONIBLE)
                      .build();
    }
}
