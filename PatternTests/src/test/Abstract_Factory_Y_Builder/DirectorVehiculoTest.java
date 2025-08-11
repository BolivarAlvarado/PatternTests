package test.Abstract_Factory_Y_Builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DirectorVehiculoTest {

    @Test // DV01
    void construirAutoBasico_construyeObjetoCorrectamente() {
        VehiculoBuilder builder = new VehiculoLujoBuilder();
        DirectorVehiculo director = new DirectorVehiculo(builder);

        Vehiculo vehiculo = director.construirAutoBasico();

        assertNotNull(vehiculo.getTipo());
        assertNotNull(vehiculo.getProveedor());
        assertNotNull(vehiculo.getModelo());
        assertNotNull(vehiculo.getColor());
        assertNotNull(vehiculo.getEstado());
    }
}
