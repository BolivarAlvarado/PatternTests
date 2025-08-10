package Chain_of_responsability;

public class ServicioClienteAereolinea extends SoporteHandler { 
    @Override
    public boolean puedeResolver(Incidencia incidencia) {
        return "aerolinea".equalsIgnoreCase(incidencia.getTipo());
    }
}

