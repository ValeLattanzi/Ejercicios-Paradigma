package CarritoCompra;

public class TestCarritoCompra { 
    public static void main(String[] args) {
        CarritoCompra carrito = new CarritoCompra();
        ItemCarrito item1 = new ItemCarrito("Preentreno", 100);
        ItemCarrito item2 = new ItemCarrito("Proteina", 20);
        UsuarioRegistrado usuario = new UsuarioRegistrado("vale.lattanzi@gmail.com", "Marcelo");    
        carrito.setNumeroCarrito(123);
        carrito.setUsuario(usuario);
        carrito.agregar(item1);
        carrito.agregar(item2);
        System.out.println(carrito.obtenerImporteTotal());
        System.out.println(carrito.toString());
    }
}