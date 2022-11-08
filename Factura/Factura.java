import java.util.ArrayList;

public class Factura {
    private int numeroFactura;
    private ArrayList<ItemFactura> listOf_Items;
    private Cliente cliente;

    public Factura() {
        listOf_Items = new ArrayList<ItemFactura>();
    }

    public void agregarItem(ItemFactura item) {
        if (listOf_Items.size() < 10) {
            listOf_Items.add(item);
        }
        else {
            System.out.println("La lista de encuentra llena.");
        }
    }

    public int obtenerImporteTotal() {
        int _total = 0;
        for (ItemFactura item : listOf_Items) {
            _total += item.getImporte();
        }
        return _total;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    @Override
    public String toString() {
        return "Factura " + this.numeroFactura + " de " +
         this.cliente.getNombre() + " por $" + this.obtenerImporteTotal();
    }
}
