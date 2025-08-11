package test.Chain_of_responsibility;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AgenteSoporteTest {

    @Test // AS01
    void puedeResolver_incidenciaSimple_devuelveTrue() {
        AgenteSoporte agente = new AgenteSoporte();
        Incidencia inc = new Incidencia("INCIDENCIA1", "simple");
        assertTrue(agente.puedeResolver(inc));
    }

    @Test // AS02
    void puedeResolver_incidenciaAerolinea_devuelveFalse() {
        AgenteSoporte agente = new AgenteSoporte();
        Incidencia inc = new Incidencia("INCIDENCIA2", "aerolinea");
        assertFalse(agente.puedeResolver(inc));
    }
}
