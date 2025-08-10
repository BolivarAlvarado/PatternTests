package Abstract_Factory_Y_Builder.Vehiculo;

public class VehiculoLujo extends Vehiculo {
    public VehiculoLujo() { this.tipo = "Lujo"; }

    @Override
    public void mostrarInfo() {
        System.out.println("Vehículo: " + tipo + 
            " | Proveedor: " + proveedor + 
            " | Color: " + color +
            " | Horario: " + horario +
            " | Extra: " + extra);
    }
}

