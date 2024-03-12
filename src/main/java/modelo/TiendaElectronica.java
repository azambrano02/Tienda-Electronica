package modelo;
import java.util.ArrayList;
import java.util.List;

public class TiendaElectronica {
    private String nombre;
    private String direccion;
    private List<Producto> productos;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Producto> getProductos() {
        return this.productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public TiendaElectronica(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.productos = new ArrayList<>();
    }

    public void MostrarProductos() {
        System.out.println("Productos de la tienda electronica " + nombre + ": ");
        for (Producto producto : productos) {
            System.out.println(" " + producto.getNombre() + ", \n" + producto.getDescripcion() + "\n$" + producto.getPrecio() + "\nStock disponible: " + producto.getStock() + "\nCategoria: " + producto.getTipo());
        }
    }

    public Producto buscarProductoNombre(String nombre) {
        for (Producto producto : this.productos) {
            if (producto.getNombre().equals(nombre)) {
                System.out.println("El producto " + nombre + " se encuentra en la tienda");
                return producto;
            }
            System.out.println("El producto " + nombre + " no se encuentra en la tienda");
        }
        return null;
    }

    public Producto buscarProductoCategoria() {
        for (Producto producto : this.productos) {
            if (producto.getTipo().equals(Categoria.COMPUTADORAS)) {
                return producto;
            }
            if (producto.getTipo().equals(Categoria.TECLADOS)) {
                    return producto;
                }
            if (producto.getTipo().equals(Categoria.AURICULARES)) {
                    return producto;
                }
            if (producto.getTipo().equals(Categoria.CELULARES)) {
                    return producto;
                }
            if (producto.getTipo().equals(Categoria.MOUSE)) {
                    return producto;
            }
        }
        return null;
    }
}


