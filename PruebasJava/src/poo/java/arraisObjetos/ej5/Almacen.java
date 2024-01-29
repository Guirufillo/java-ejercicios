package poo.java.arraisObjetos.ej5;

public class Almacen {
    private int codigo;
    private String descipcion;
    private double precioVenta;
    private double precioCompra;
    int cantidad;
    int incrementarStock;
    int decrementarStock;


    public Almacen(int codigo, String descipcion, double precioCompra, double precioVenta){
        this.codigo=codigo;
        this.descipcion=descipcion;
        this.precioCompra= precioCompra;
        this.precioVenta=precioVenta;

    }

    public void incrementarStock(int cantidad) {
        this.cantidad += cantidad;
    }

    public void decrementarStock(int cantidad) {
        this.cantidad -= cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescipcion() {
        return descipcion;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int stock) {
        this.cantidad = stock;
    }

    @Override
    public String toString() {

        String cadena = "\n------------------------------------------";
        cadena += "\nCódigo: " + this.codigo;
        cadena += "\ndescipcion: \": " + this.descipcion;
        cadena += "\nprecioVenta: " + this.precioVenta;
        cadena += "\nprecioCompra: " + this.precioCompra;
        cadena += "\nstock: " + this.cantidad;
        cadena += "\n------------------------------------------";

        return cadena;
    }
}
