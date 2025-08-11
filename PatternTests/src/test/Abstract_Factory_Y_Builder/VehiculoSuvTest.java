package test.Abstract_Factory_Y_Builder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehiculoSuvTest {

    @Test // VS01
    void mostrarInfo_noLanzaErrores() {
        VehiculoSuv suv = new VehiculoSuv();
        assertDoesNotThrow(suv::mostrarInfo);
    }
}
