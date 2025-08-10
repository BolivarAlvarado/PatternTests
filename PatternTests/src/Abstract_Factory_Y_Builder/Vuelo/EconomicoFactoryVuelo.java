package Abstract_Factory_Y_Builder.Vuelo;

class EconomicoFactoryVuelo implements VueloFactory {
    @Override
    public Vuelo crearVuelo(String horario) {
        DirectorVuelo director = new DirectorVuelo();
        Aeronave aeronave = director.construirVuelo(new BuilderEconomico(), "Boeing");
        return new VueloEconomico(horario, aeronave);
    }
}

