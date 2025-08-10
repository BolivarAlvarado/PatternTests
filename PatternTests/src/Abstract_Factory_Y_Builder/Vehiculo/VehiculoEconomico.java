package Abstract_Factory_Y_Builder.Vehiculo;

public class VehiculoEconomico extends Vehiculo {
    public VehiculoEconomico() { this.tipo = "Económico"; }

    @Override
    public void mostrarInfo() {
        System.out.println("Vehículo: " + tipo + 
            " | Proveedor: " + proveedor + 
            " | Color: " + color +
            " | Horario: " + horario +
            " | Extra: " + extra);
    }
}

