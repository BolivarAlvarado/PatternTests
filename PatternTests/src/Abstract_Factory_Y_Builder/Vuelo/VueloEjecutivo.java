package Abstract_Factory_Y_Builder.Vuelo;


class VueloEjecutivo implements Vuelo {
    private String horario;
    private Aeronave aeronave;

    public VueloEjecutivo(String horario, Aeronave aeronave) {
        this.horario = horario;
        this.aeronave = aeronave;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Vuelo Ejecutivo - Horario: " + horario);
        aeronave.mostrarConfiguracion();
    }
}


