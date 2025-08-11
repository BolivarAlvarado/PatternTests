package test.Abstract_Factory_Y_Builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehiculoSuvBuilderTest {

    @Test // VSB01
    void constructor_creaObjetoVehiculoSuvExitosamente() {
        VehiculoSuvBuilder builder = new VehiculoSuvBuilder();
        assertNotNull(builder);
    }

    @Test // VSB02
    void build_retornaObjetoVehiculoSuv() {
        VehiculoSuvBuilder builder = new VehiculoSuvBuilder();
        Vehiculo vehiculo = builder.build();
        assertTrue(vehiculo instanceof VehiculoSuv);
    }
}
