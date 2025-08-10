package patterntests;

public class ProveedorAutosConcrete {
    private String nombreProveedor;

    public ProveedorAutosConcrete(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public VehiculoConcrete crearVehiculo(String tipo) {
        // simplificado: tipo solo para descripción
        return new VehiculoConcrete(nombreProveedor + " - " + tipo);
    }
}

