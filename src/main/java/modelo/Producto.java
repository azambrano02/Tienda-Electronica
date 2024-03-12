package modelo;

public abstract class Producto {
    protected String nombre;
    protected String descripcion;
    protected double precio;
    protected int stock;

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public double getPrecio(){
        return this.precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public int getStock(){
        return this.stock;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
    public Producto(String nombre, String descripcion, double precio, int stock){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }
    public abstract Categoria getTipo();

    public int agregarStock(){
        return (stock+1);
    }
    public int quitarStock(){
        return (stock-1);
    }
}
