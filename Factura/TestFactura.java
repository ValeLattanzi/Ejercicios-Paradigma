public class TestFactura {
    public static void main(String[] args) {
        Factura factura = new Factura();
        ItemFactura itemFactura1 = new ItemFactura(500, "item1");
        ItemFactura itemFactura2 = new ItemFactura(500, "item2");
        Cliente cliente = new Cliente(123, "Alumno");
        factura.setCliente(cliente);
        factura.setNumeroFactura(777);
        factura.agregarItem(itemFactura1);
        factura.agregarItem(itemFactura2);
        System.out.println(factura.obtenerImporteTotal());
        System.out.println(factura.toString());
    }
}
