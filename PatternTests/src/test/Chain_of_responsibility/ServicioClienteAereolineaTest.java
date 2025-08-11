package test.Chain_of_responsibility;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServicioClienteAereolineaTest {

    @Test // SCA01
    void puedeResolver_incidenciaAerolinea_devuelveTrue() {
        ServicioClienteAereolinea servicio = new ServicioClienteAereolinea();
        Incidencia inc = new Incidencia("INCIDENCIA2", "aerolinea");
        assertTrue(servicio.puedeResolver(inc));
    }

    @Test // SCA02
    void puedeResolver_incidenciaSimple_devuelveFalse() {
        ServicioClienteAereolinea servicio = new ServicioClienteAereolinea();
        Incidencia inc = new Incidencia("INCIDENCIA1", "simple");
        assertFalse(servicio.puedeResolver(inc));
    }
}
