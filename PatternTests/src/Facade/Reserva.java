package Facade;

import Observer.ObservadorReserva;
import Decorator.ReservaInterface;
import java.util.ArrayList;
import java.util.List;

public class Reserva implements ReservaInterface {
    private int idReserva;
    private Usuario usuario;
    private double precioBase;
    private String descripcion;
    private List<ObservadorReserva> observadores = new ArrayList<>();

    public Reserva(int idReserva, Usuario usuario, double precioBase, String descripcion) {
        this.idReserva = idReserva;
        this.usuario = usuario;
        this.precioBase = precioBase;
        this.descripcion = descripcion;
    }

    @Override
    public double getPrecioTotal() {
        return precioBase;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void confirmarReserva() {
        notifyObservadores("Reserva confirmada");
    }

    @Override
    public void cancelarReserva() {
        notifyObservadores("Reserva cancelada");
    }

    public void agregarObservador(ObservadorReserva o) {
        observadores.add(o);
    }

    public void eliminarObservador(ObservadorReserva o) {
        observadores.remove(o);
    }

    private void notifyObservadores(String mensaje) {
        for (ObservadorReserva o : observadores) {
            o.actualizar(this, mensaje);
        }
    }

    // getters
    public int getIdReserva() { return idReserva; }
    public Usuario getUsuario() { return usuario; }
    public double getPrecioBase() { return precioBase; }
}
