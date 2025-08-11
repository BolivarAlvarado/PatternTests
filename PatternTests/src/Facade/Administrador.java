package Facade;

import java.util.HashMap;
import java.util.Map;

public class Administrador {
    private Map<String, Politica> politicas = new HashMap<>();

    public void agregarPolitica(String clave, Politica p) {
        politicas.put(clave, p);
    }

    public boolean validarCancelacion(String clave, Reserva reserva) {
        Politica p = politicas.get(clave);
        if (p == null) return false;
        return p.aplicar(reserva);
    }
    public Politica getPolitica(String clave) {
    return politicas.get(clave);
    }
}
