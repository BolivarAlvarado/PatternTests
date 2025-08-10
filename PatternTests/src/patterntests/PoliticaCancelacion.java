package patterntests;

public class PoliticaCancelacion implements Politica {
    private int diasAntesParaCancelar;
    private double porcentajePenalidad;

    public PoliticaCancelacion(int diasAntesParaCancelar, double porcentajePenalidad) {
        this.diasAntesParaCancelar = diasAntesParaCancelar;
        this.porcentajePenalidad = porcentajePenalidad;
    }

    @Override
    public boolean aplicar(Reserva reserva) {
        // Simplificado: siempre se aplica en este ejemplo
        return true;
    }

    @Override
    public String getDescripcion() {
        return "Política de cancelación: " + diasAntesParaCancelar + " días, penalidad " + porcentajePenalidad;
    }
}

