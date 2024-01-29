import dominio.*;
import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Producto producto;
        String nombre;
        float precio;
        int cantidad;

        Cliente cliente = new Cliente();
        cliente.setNif("5555-5");
        cliente.setNombre("Pepe");

        System.out.println("Ingrese una descripción de la factura");
        String descripcion = leer.nextLine();
        Factura factura = new Factura(descripcion, cliente);

        System.out.println();

        for (int i=0; i<2;i++){
         producto=new Producto();
            System.out.print("Ingrese producto nº "+producto.getCodigo()+": ");
            nombre = leer.nextLine();
            producto.setNombre(nombre);

            System.out.print("Ingrese el precio: ");
            precio = leer.nextFloat();
            producto.setPrecio(precio);

            System.out.print("Ingrese la cantidad: ");
            cantidad = leer.nextInt();

            DetalleFactura detalle = new DetalleFactura(cantidad,producto);
            factura.agregarDetallesFactura(detalle);

            System.out.println();
            leer.nextLine();
        }
        System.out.println(factura);
    }
}