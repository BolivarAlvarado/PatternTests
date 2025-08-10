package Abstract_Factory_Y_Builder.Vuelo;

interface VueloBuilder {
    void setProveedor(String proveedor);
    void configurarAsientos();
    void configurarComida();
    Aeronave getResultado();
    boolean verificarDisponibilidad();
}
