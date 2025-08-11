package test.Chain_of_responsibility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IncidenciaTest {

    @Test // Inc1
    void constructor_valido_creaIncidencia() {
        Incidencia inc = new Incidencia("Se ha caído la página", "simple");
        assertEquals("simple", inc.getTipo());
    }

    @Test // Inc2
    void constructor_tipoVacio_lanzaExcepcion() {
        assertThrows(IllegalArgumentException.class,
                () -> new Incidencia("Se ha caído la página", ""));
    }

    @Test // Inc3
    void constructor_tipoInvalido_lanzaExcepcion() {
        assertThrows(IllegalArgumentException.class,
                () -> new Incidencia("Se ha caído la página", "Complejo"));
    }
}
