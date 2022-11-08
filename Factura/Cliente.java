public class Cliente {
    private int codigo;
    private String nombre;
    
    public Cliente(int C, String N) {
        this.codigo = C;
        this.nombre = N;
    }

    public String getNombre() {
        return this.nombre;
    }
}