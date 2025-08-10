package Abstract_Factory_Y_Builder.Vuelo;

class PrimeraClaseFactory implements VueloFactory {
    @Override
    public Vuelo crearVuelo(String horario) {
        DirectorVuelo director = new DirectorVuelo();
        Aeronave aeronave = director.construirVuelo(new BuilderPrimeraClase(), "Airbus");
        return new VueloPrimeraClase(horario, aeronave);
    }
}

