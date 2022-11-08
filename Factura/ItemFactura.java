public class ItemFactura {
    private int importe;
    private String descripcion;

    public ItemFactura(int I, String D) {
        this.importe = I;
        this.descripcion = D;
     }

    public int getImporte() {
        return this.importe;
    }
}
