package Abstract_Factory_Y_Builder.Vehiculo;

public class VehiculoSuv extends Vehiculo {
    public VehiculoSuv() { this.tipo = "SUV"; }

    @Override
    public void mostrarInfo() {
        System.out.println("=== Vehículo Económico ===");
        System.out.println("ID: " + idVehiculo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Proveedor: " + proveedor);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Estado: " + estado);
        System.out.println("==========================\n");
    }
}