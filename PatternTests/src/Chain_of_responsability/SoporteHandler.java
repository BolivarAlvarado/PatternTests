package Chain_of_responsability;

public abstract class SoporteHandler {
    protected SoporteHandler siguiente;

    public void setSiguiente(SoporteHandler s) { this.siguiente = s; }

    public abstract boolean puedeResolver(Incidencia incidencia);
    public void manejar(Incidencia incidencia) {
        if (puedeResolver(incidencia)) {
            System.out.println(this.getClass().getSimpleName() + " resolvió la incidencia: " + incidencia.getDescripcion());
        } else if (siguiente != null) {
            System.out.println(this.getClass().getSimpleName() + " no puede resolver, pasando a siguiente.");
            siguiente.manejar(incidencia);
        } else {
            System.out.println("Incidencia no resuelta: " + incidencia.getDescripcion());
        }
    }
}
