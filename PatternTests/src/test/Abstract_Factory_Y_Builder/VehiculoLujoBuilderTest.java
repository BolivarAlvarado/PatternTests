package test.Abstract_Factory_Y_Builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehiculoLujoBuilderTest {

    @Test // VLB01
    void constructor_creaObjetoVehiculoLujoExitosamente() {
        VehiculoLujoBuilder builder = new VehiculoLujoBuilder();
        assertNotNull(builder);
    }

    @Test // VLB02
    void build_retornaObjetoVehiculoLujo() {
        VehiculoLujoBuilder builder = new VehiculoLujoBuilder();
        Vehiculo vehiculo = builder.build();
        assertTrue(vehiculo instanceof VehiculoLujo);
    }
}
