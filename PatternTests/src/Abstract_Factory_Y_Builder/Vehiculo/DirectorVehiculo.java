package Abstract_Factory_Y_Builder.Vehiculo;

public class DirectorVehiculo {
    public Vehiculo construirSUVPremium(VehiculoBuilder builder) {
        return builder
            .setProveedor("Toyota")
            .setColor("Negro")
            .setHorario("09:00 AM")
            .setExtras("GPS, Asientos de cuero, WiFi")
            .build();
    }

    public Vehiculo construirEconomicoExpress(VehiculoBuilder builder) {
        return builder
            .setProveedor("Nissan")
            .setColor("Blanco")
            .setHorario("08:00 AM")
            .setExtras("Aire acondicionado")
            .build();
    }
}

