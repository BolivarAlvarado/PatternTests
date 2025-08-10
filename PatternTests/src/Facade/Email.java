package Facade;

public class Email {
    private String correoElectronico;

    public Email(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    @Override
    public String toString() {
        return correoElectronico;
    }
}
