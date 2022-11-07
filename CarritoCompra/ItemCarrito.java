package CarritoCompra;

public class ItemCarrito {
    private String descripcion;
    private int importe;

    public ItemCarrito() {
    }

    public ItemCarrito(String descripcion, int importe) {
        this.descripcion = descripcion;
        this.importe = importe;
    }
    
    public int getImporte() {
        return this.importe;
    }
}