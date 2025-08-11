package Facade;

public class Usuario {
    private String idUser;
    private String nombre;
    private Email email;

    public Usuario(String idUser, String nombre, Email email) {
        this.idUser = idUser;
        this.nombre = nombre;
        this.email = email;
    }

    public String getIdUser() { return idUser; }
    public String getNombre() { return nombre; }
    public Email getEmail() { return email; }
}
