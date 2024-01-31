package poo.ies.ej6;

import java.util.Scanner;

import static poo.ies.ej6.AlmacenBicis.bicicletas;

public class Tienda {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        AlmacenBicis almacen = new AlmacenBicis();

        Bicicleta[] nuevaBicicleta=new Bicicleta[4];
        nuevaBicicleta[0] = new Bicicleta(1, "HP", "mod", 6, 12, true, "21/05/2006", 1500);
        nuevaBicicleta[1] = new Bicicleta(2, "BH", "XM", 3, 17, true, "12/09/2009", 1700);
        nuevaBicicleta[2] = new Bicicleta(3, "BH", "Road", 2, 16, false, "30/08/2001", 900);
        nuevaBicicleta[3] = new Bicicleta(4, "CR", "pepino", 4, 14, false, "18/01/2004", 700);
        // Agrega las bicicletas al almacén
        almacen.agregarNuevasBicicletas(nuevaBicicleta);

        // Imprime la tabla después de agregar las bicicletas
        AlmacenBicis.imprimirTabla(bicicletas);

        int opcion;

        do {
            System.out.println("*************************\n" +
                    "** GESTIÓN DE BICICLETAS **\n" +
                    "*************************\n" +
                    "1.- Añadir bicicleta …\n" +
                    "2.- Vender bicicleta ...\n" +
                    "3.- Consultar bicicleta …\n" +
                    "4.- Mostrar stock\n" +
                    "------------------------------------\n" +
                    "0.- Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    almacen.agregarBicicleta();
                    break;

                case 2:
                    almacen.ventaBici();
                    break;

                case 3:
                    almacen.consultaBici();
                    break;

                case 4:
                    almacen.mostrarStockTotal();
                    AlmacenBicis.imprimirTabla(bicicletas);
                    break;
            }
        } while (opcion != 0);
    }
}