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

    public List<Producto> buscarProductoCategoria(Categoria categoria) {
        List<Producto> productosCategoria = new ArrayList<>();
        for (Producto producto : this.productos) {
            if (producto.getTipo().equals(categoria)) {
                productosCategoria.add(producto);
            }

        }
        return productosCategoria;
    }
    public boolean productoExiste(Producto producto) {
        for (Producto p : this.productos) {
            if (producto.getNombre().equals(p.getNombre())) {
                return true;
            }
        }
        return false;
    }
    public boolean agregarProducto(Producto producto) {
        if (!productoExiste(producto)) {
            this.productos.add(producto);
            System.out.println("El produdcto ha sido agregado con exito");
            return true;
        } else {
            System.out.println("El producto ya se encuentra en la tienda");
            return false;
        }
    }
    public void modifcarDescripcion(String descripcion, String nombre){
        for(Producto producto : this.productos){
            if(producto.getNombre().equals(nombre)){
                producto.setDescripcion(descripcion);
                break;
            }
        }
    }
    public void eliminarProducto(String nombre){
        for(Producto producto : this.productos){
            if(producto.getNombre().equals(nombre)){
                productos.remove(producto);
                break;
            }
        }
    }
    public void generarCompra(String nombre){
        for(Producto producto : this.productos){
            if(producto.getNombre().equals(nombre)){
                producto.quitarStock();
            }
        }
    }
}


