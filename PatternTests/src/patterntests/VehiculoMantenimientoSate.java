package patterntests;

public class VehiculoMantenimientoState implements EstadoVehiculo {
    @Override
    public void confirm

ar(VehiculoConcrete v) {
        System.out.println("No se puede confirmar: en mantenimiento.");
    }

    @Override
    public void mantener(VehiculoConcrete v) {
        System.out.println("Ya en mantenimiento.");
    }

    @Override
    public void liberar(VehiculoConcrete v) {
        v.setEstado(new VehiculoDisponibleState());
    }

    @Override
    public String getEstadoNombre() { return "Mantenimiento"; }
}

