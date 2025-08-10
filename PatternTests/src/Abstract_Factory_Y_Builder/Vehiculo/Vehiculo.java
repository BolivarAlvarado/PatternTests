package Abstract_Factory_Y_Builder.Vehiculo;

public abstract class Vehiculo {
    protected String tipo;
    protected String proveedor;
    protected String color;
    protected String horario;
    protected String extra;

    public abstract void mostrarInfo();

    public void setProveedor(String proveedor) { this.proveedor = proveedor; }
    public void setColor(String color) { this.color = color; }
    public void setHorario(String horario) { this.horario = horario; }
    public void setExtra(String extra) { this.extra = extra; }
}
