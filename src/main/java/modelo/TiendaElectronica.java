package modelo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
            Scanner sc =  new Scanner(System.in);
            System.out.println("Seleccione que categoria de productos desea ver: \n1)Computadoras\n2)Teclados\n3)Auriculares\n4)Celulares\n5)Mouses");
            int opcion = sc.nextInt();
            if (producto.getTipo().equals(Categoria.COMPUTADORAS)&&opcion==1) {
                return producto;
            }
            if (producto.getTipo().equals(Categoria.TECLADOS)&&opcion==2) {
                    return producto;
                }
            if (producto.getTipo().equals(Categoria.AURICULARES)&&opcion==3) {
                    return producto;
                }
            if (producto.getTipo().equals(Categoria.CELULARES)&&opcion==4) {
                    return producto;
                }
            if (producto.getTipo().equals(Categoria.MOUSE)&&opcion==5) {
                    return producto;
            }
        }
        return null;
    }
    public boolean productoExiste(Producto producto) {
        for (Producto p : this.productos) {
            if (producto.getNombre().equals(p.getNombre())) {
                return true;
            }
        }
        return false;
    }
    public boolean agregarProducto(Producto prodcuto) {
        if (!productoExiste(prodcuto)) {
            this.productos.add(prodcuto);
            System.out.println("El produdcto ha sido agregado con exito");
            return true;
        } else {
            System.out.println("El producto no ha podido ser agregado");
            return false;
        }
    }
    public void modifcarDescripcion(){

    }
}


