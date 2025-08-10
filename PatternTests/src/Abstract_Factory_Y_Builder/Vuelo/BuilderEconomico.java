package Abstract_Factory_Y_Builder.Vuelo;

class BuilderEconomico implements VueloBuilder {
    private Aeronave aeronave = new Aeronave();
    private boolean disponibilidad;
    @Override
    public void setProveedor(String proveedor) { aeronave.setProveedor(proveedor); }
    @Override
    public void configurarAsientos() { aeronave.setTipoAsiento("Económico"); }
    @Override
    public void configurarComida() { aeronave.setServicioComida(false); }
    @Override
    public Aeronave getResultado() { return aeronave; }
    @Override 
    public boolean verificarDisponibilidad(){return disponibilidad;}
}
