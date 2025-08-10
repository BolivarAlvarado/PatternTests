package Abstract_Factory_Y_Builder.Vuelo;

class VueloEconomico implements Vuelo {
    private String horario;
    private Aeronave aeronave;

    public VueloEconomico(String horario, Aeronave aeronave) {
        this.horario = horario;
        this.aeronave = aeronave;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Vuelo Económico - Horario: " + horario);
        aeronave.mostrarConfiguracion();
    }
}
