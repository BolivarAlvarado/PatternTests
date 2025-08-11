package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Map;

public class AdministradorTest {

    private Administrador admin;

    @BeforeEach
    void setUp() {
        admin = new Administrador();
    }

    @Test
    void Adm01_agregarPolitica_nuevaClave() {
        // Arrange
        Politica politicaJuan = new Politica("Juan");

        // Act
        admin.agregarPolitica("202311", politicaJuan);

        // Assert
        assertTrue(admin.getPoliticas().containsKey("202311"));
        assertEquals(politicaJuan, admin.getPoliticas().get("202311"));
    }

    @Test
    void Adm02_agregarPolitica_actualizarClaveExistente() {
        // Arrange
        Politica politicaJuan = new Politica("Juan");
        Politica politicaJose = new Politica("Jose");
        admin.agregarPolitica("202311", politicaJuan);

        // Act
        admin.agregarPolitica("202311", politicaJose);

        // Assert
        assertEquals(politicaJose, admin.getPoliticas().get("202311"));
    }

    @Test
    void Adm03_validarCancelacion_reservaExiste() {
        // Arrange
        Politica politicaReserva = new Politica("Reserva");
        admin.agregarPolitica("202311", politicaReserva);

        // Act
        boolean resultado = admin.validarCancelacion("202311", politicaReserva);

        // Assert
        assertTrue(resultado);
    }

    @Test
    void Adm04_validarCancelacion_politicaNoExiste() {
        // Arrange
        Politica politicaJose = new Politica("Jose");

        // Act
        boolean resultado = admin.validarCancelacion("202434", politicaJose);

        // Assert
        assertFalse(resultado);
    }
}
