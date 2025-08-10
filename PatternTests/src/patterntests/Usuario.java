package patterntests;

public class Usuario {
    private int idUser;
    private String nombre;
    private Email email;

    public Usuario(int idUser, String nombre, Email email) {
        this.idUser = idUser;
        this.nombre = nombre;
        this.email = email;
    }

    public int getIdUser() { return idUser; }
    public String getNombre() { return nombre; }
    public Email getEmail() { return email; }
}
