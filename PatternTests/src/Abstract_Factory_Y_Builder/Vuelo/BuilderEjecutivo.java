package Abstract_Factory_Y_Builder.Vuelo;

class BuilderEjecutivo implements VueloBuilder {
    private Aeronave aeronave = new Aeronave();

    @Override
    public void setProveedor(String proveedor) { aeronave.setProveedor(proveedor); }
    @Override
    public void configurarAsientos() { aeronave.setTipoAsiento("Ejecutivo"); }
    @Override
    public void configurarComida() { aeronave.setServicioComida(true); }
    @Override
    public Aeronave getResultado() { return aeronave; }
}

