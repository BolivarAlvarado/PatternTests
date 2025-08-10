package patterntests;

public class VehiculoConcrete implements Vehiculo {
    private String proveedor;
    private EstadoVehiculo estado;

    public VehiculoConcrete(String proveedor) {
        this.proveedor = proveedor;
        this.estado = new VehiculoDisponibleState();
    }

    public void setEstado(EstadoVehiculo estado) { this.estado = estado; }
    public EstadoVehiculo getEstado() { return estado; }

    @Override
    public String getProveedor() { return proveedor; }

    @Override
    public String mostrarDetalles() {
        return "Vehículo proveedor: " + proveedor + " - Estado: " + estado.getEstadoNombre();
    }

    // operaciones delegadas al estado
    public void confirmar() { estado.confirmar(this); }
    public void mantener() { estado.mantener(this); }
    public void liberar() { estado.liberar(this); }
}

