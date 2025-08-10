package Abstract_Factory_Y_Builder.Vuelo;

class EjecutivoFactory implements VueloFactory {
    @Override
    public Vuelo crearVuelo(String horario) {
        DirectorVuelo director = new DirectorVuelo();
        Aeronave aeronave = director.construirVuelo(new BuilderEjecutivo(), "Embraer");
        return new VueloEjecutivo(horario, aeronave);
    }
} 