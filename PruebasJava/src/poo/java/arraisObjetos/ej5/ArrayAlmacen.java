package poo.java.arraisObjetos.ej5;

import poo.java.arraisObjetos.ej4.Disco;

public class ArrayAlmacen {

    private Almacen[] producto;

    public ArrayAlmacen(int numProductos){

        producto = new Almacen[numProductos];
    }

    public void listadoProductos(){
        for (Almacen productos : producto){
            if(productos!=null){
                System.out.println(productos.toString());
                return;
            }
        }
        System.out.println("No hay productos en el almacen");
    }

    public void altaProducto(int codigo, String descipcion, double precioCompra, double precioVenta){
        for (int i= 0; i< producto.length; i++){
            if(producto[i] !=null && producto[i].getCodigo()==codigo){
                System.out.println("Error: Ya existe un producto con ese codigo");
                return;
            }
        }
        for (int i= 0; i< producto.length; i++){
            if (producto[i]==null){
                producto[i]= new Almacen(codigo, descipcion, precioCompra, precioVenta);
                System.out.println("Producto "+codigo+", agregado con exito.");
                System.out.println(toString());
                return;
            }

        }
        System.out.println("no hay espacio disponible en el almacen para agregar mas productos");
    }

    public void bajaProducto(int codigo){
        for (int i = 0; i < producto.length; i++) {
            if (producto[i] !=null && producto[i].getCodigo()==codigo){
                producto[i]= null;
                System.out.println("Producto "+codigo+" ha sido dado de baja con exito.");
                System.out.println(toString());
                return;
            }
        }
        System.out.println("El producto con código "+codigo+" no esta en la lista.");
    }

    public void modProducto(int codigo, String descipcionMod, double precioCompraMod, double precioVentaMod){
        for (int i=0;i< producto.length; i++){
            if (producto[i]!=null && producto[i].getCodigo()==codigo){
                producto[i].setDescipcion(descipcionMod);
                producto[i].setPrecioCompra(precioCompraMod);
                producto[i].setPrecioVenta(precioVentaMod);
                System.out.println("Producto "+codigo+" modificado con exito");
                System.out.println(toString());
            }
        }
    }

    public void entradaMercancia(int codigo, int cantidad) {
        for (Almacen productos : producto) {
            if (productos != null && productos.getCodigo() == codigo) {
                productos.incrementarStock(cantidad);
                System.out.println("Entrada de mercancía realizada con éxito.");
                System.out.println(productos.toString());
                return;
            }
        }
        System.out.println("Producto con código " + codigo + " no encontrado en el almacén.");
    }

    public void salidaMercancia(int codigo, int cantidad) {
        for (Almacen producto : this.producto) {
            if (producto != null && producto.getCodigo() == codigo) {
                if (producto.getCantidad() >= cantidad) {
                    producto.decrementarStock(cantidad);
                    System.out.println("Salida de mercancía realizada con éxito.");
                    System.out.println(producto.toString());
                } else {
                    System.out.println("Error: No hay suficiente mercancía en el almacén.");
                }
                return;
            }
        }
        System.out.println("Producto con código " + codigo + " no encontrado en el almacén.");
    }

    public String toString() {
        String resultado = "Lista de productos:\n";

        for (Almacen producto : this.producto) {
            if (producto != null) {
                resultado = resultado + producto.toString() + "\n";
            }
        }
        return resultado;
    }
}
