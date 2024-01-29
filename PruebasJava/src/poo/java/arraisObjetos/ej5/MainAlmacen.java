package poo.java.arraisObjetos.ej5;

import java.util.Scanner;

public class MainAlmacen {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion = 9;

        ArrayAlmacen almacen = new ArrayAlmacen(10);

        do {
            System.out.println("introduzca su opcion:");
            System.out.print("1. agregar producto\n"
                    + "2. modificar producto\n"
                    + "3. eliminar producto\n"
                    + "4. listar productos\n"
                    + "5. Entrada de mercancía\n"
                    + "6. Salida de mercancía\n"
                    + "7. Salir\n"
                    + "Opcion elegida:");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce un codigo:" );
                    int codigo= leer.nextInt();
                    leer.nextLine();
                    System.out.println("Introduce una descripcion: ");
                    String descripcion= leer.nextLine();
                    System.out.print("Introduce precio de compra: ");
                    double precioCompra= leer.nextDouble();
                    System.out.print("Introduce precio de venta: ");
                    double precioVenta= leer.nextDouble();
                    almacen.altaProducto(codigo,descripcion, precioCompra, precioVenta);
                    break;
                case 2:
                    System.out.print("Introduce un codigo:" );
                    codigo= leer.nextInt();
                    System.out.print("Introduce una descripcion: ");
                    String descripcionMod= leer.nextLine();
                    System.out.print("Introduce precio de compra: ");
                    double precioCompraMod= leer.nextDouble();
                    System.out.print("Introduce precio de venta: ");
                    double precioVentaMod= leer.nextDouble();
                    almacen.modProducto(codigo,descripcionMod, precioCompraMod, precioVentaMod);
                    break;
                case 3:
                    System.out.print("Introduce un codigo:" );
                    codigo= leer.nextInt();
                    almacen.bajaProducto(codigo);
                    break;
                case 4:
                    almacen.listadoProductos();
                    break;
                case 5:
                    System.out.print("Ingrese el código del producto: ");
                    int codigoEntrada = leer.nextInt();
                    System.out.print("Ingrese la cantidad de mercancía a añadir: ");
                    int cantidadEntrada = leer.nextInt();
                    almacen.entradaMercancia(codigoEntrada, cantidadEntrada);
                    break;
                case 6:
                    System.out.print("Ingrese el código del producto: ");
                    int codigoSalida = leer.nextInt();
                    System.out.print("Ingrese la cantidad de mercancía a sacar: ");
                    int cantidadSalida = leer.nextInt();
                    almacen.salidaMercancia(codigoSalida, cantidadSalida);
                    break;
                case 7:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 7);
    }
}
