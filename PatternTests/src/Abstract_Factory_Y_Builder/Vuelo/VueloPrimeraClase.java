package Abstract_Factory_Y_Builder.Vuelo;


class VueloPrimeraClase extends Vuelo {
    private String horario;
    private Aeronave aeronave;

    public VueloPrimeraClase(String horario, Aeronave aeronave) {
        this.horario = horario;
        this.aeronave = aeronave;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Vuelo Primera Clase - Horario: " + horario);
        aeronave.mostrarConfiguracion();
    }
}
