package Abstract_Factory_Y_Builder.Vehiculo;

public class VehiculoSuv extends Vehiculo {
    public VehiculoSuv() { this.tipo = "SUV"; }

    @Override
    public void mostrarInfo() {
        System.out.println("Vehículo: " + tipo + 
            " | Proveedor: " + proveedor + 
            " | Color: " + color +
            " | Horario: " + horario +
            " | Extra: " + extra);
    }
}