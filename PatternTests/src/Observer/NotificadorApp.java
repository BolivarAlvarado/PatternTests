package Observer;

import Facade.Reserva;


public class NotificadorApp implements ObservadorReserva {
    private String deviceId;

    public NotificadorApp(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public void actualizar(Reserva reserva, String mensaje) {
        System.out.println("Notificación app (" + deviceId + "): " + mensaje + " (reserva " + reserva.getIdReserva() + ")");
    }
}
