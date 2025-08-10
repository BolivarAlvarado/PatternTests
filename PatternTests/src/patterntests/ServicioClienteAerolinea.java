
package patterntests;

public class ServicioClienteAerolinea extends SoporteHandler { // Cambiar a Aereo
    @Override
    public boolean puedeResolver(Incidencia incidencia) {
        return "aerolinea".equalsIgnoreCase(incidencia.getTipo());
    }
}

