package patterntests;

public class NotificadorEmail implements ObservadorReserva {
    private Email email;

    public NotificadorEmail(Email email) {
        this.email = email;
    }

    @Override
    public void actualizar(Reserva reserva, String mensaje) {
        System.out.println("Enviando email a " + email.getCorreoElectronico() + ": " + mensaje +
                " (reserva " + reserva.getIdReserva() + ")");
    }
}

