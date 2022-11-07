package CarritoCompra;

public class UsuarioRegistrado {
    private String email;
    private String nombreUsuario;

    public UsuarioRegistrado(String email, String nombreUsuario) {
        this.email = email;
        this.nombreUsuario = nombreUsuario;
    }

    public UsuarioRegistrado() {

    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

}
