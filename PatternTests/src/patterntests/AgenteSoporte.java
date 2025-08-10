package patterntests;

public class AgenteSoporte extends SoporteHandler {
    private String nombre;

    public AgenteSoporte(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean puedeResolver(Incidencia incidencia) {
        // Agente general solo resuelve incidencias simples
        return "simple".equalsIgnoreCase(incidencia.getTipo());
    }
}
