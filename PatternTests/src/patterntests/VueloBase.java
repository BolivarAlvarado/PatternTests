package patterntests;

public abstract class VueloBase implements Vuelo {
    protected String horario;
    protected String provider;

    public VueloBase(String horario, String provider) {
        this.horario = horario;
        this.provider = provider;
    }

    @Override
    public String mostrarDetalles() {
        return "Vuelo " + provider + " - horario: " + horario;
    }
}

