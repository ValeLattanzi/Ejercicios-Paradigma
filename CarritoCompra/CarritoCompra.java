package CarritoCompra;

import java.util.ArrayList;

public class CarritoCompra {
    private int nroCarrito;
    private UsuarioRegistrado usuario;
    private ArrayList<ItemCarrito> items;

    public CarritoCompra() {
        // Inicializa las variables
        nroCarrito = 0;
        usuario = new UsuarioRegistrado();
        items = new ArrayList<ItemCarrito>();
    }

    /**
     * Añade un item al carrito
     * @param item -> Item para agregar
     */
    public void agregar(ItemCarrito item) {
        // 1.- Comprueba que el tamaño del vector sea menor a 5
        if (items.size() < 5) {
            // 2.- Añade el item 
            items.add(item);
        }
        else {
            System.out.println("Se ha alcanzado el limite de articulos.");
        }
    }

    /**
     * Calcula el importe total del carrito con los items agregados
     * @return Importe total
     */
    public int obtenerImporteTotal() {
        int _importeTotal = 0;
        
        // Recorre el arreglo de items sumarizando los importes de cada articulo
        for (ItemCarrito item : items) {
            _importeTotal += item.getImporte();
        }
        return _importeTotal;
    }

    /**
     * Asocia el carrito a un usuario
     * @param usuario -> Usuario registrado
     */
    public void setUsuario(UsuarioRegistrado usuario) {
        this.usuario = usuario;
    }

    public void setNumeroCarrito(int numero) {
        this.nroCarrito = numero;
    }

    public int getNumeroCarrito() {
        return this.nroCarrito;
    }

    @Override
    public String toString() {
        return "Carrito " + this.getNumeroCarrito() + " de " + 
        this.usuario.getNombreUsuario() + " por " + this.obtenerImporteTotal();
    }
}