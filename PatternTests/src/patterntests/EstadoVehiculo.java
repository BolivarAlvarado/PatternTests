package patterntests;

public interface EstadoVehiculo {
    void confirmar(VehiculoConcrete v);
    void mantener(VehiculoConcrete v);
    void liberar(VehiculoConcrete v);
    String getEstadoNombre();
}

