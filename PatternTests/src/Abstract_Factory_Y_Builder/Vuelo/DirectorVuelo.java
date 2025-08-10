package Abstract_Factory_Y_Builder.Vuelo;

class DirectorVuelo {
    public Aeronave construirVuelo(VueloBuilder builder, String proveedor) {
        builder.setProveedor(proveedor);
        builder.configurarAsientos();
        builder.configurarComida();
        return builder.getResultado();
    }
}

