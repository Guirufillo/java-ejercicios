package poo.ies.ej6;

import java.util.Scanner;

import static poo.ies.ej6.Bicicleta.*;

public class Tienda {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        AlmacenBicis almacen = new AlmacenBicis(10);

        Bicicleta[] bici=new Bicicleta[10];

        bici[0] = new Bicicleta(1, "HP", "mod", 6, 12, true, "21/05/2006", 1500);
        bici[1] = new Bicicleta(2, "BH", "XM", 3, 17, true, "12/09/2009", 1700);
        bici[2] = new Bicicleta(3, "BH", "Road", 2, 16, false, "30/08/2001", 900);
        bici[3] = new Bicicleta(4, "CR", "pepino", 4, 14, false, "18/01/2004", 700);
        int opcion;
        // Agrega las bicicletas al almacén
        almacen.agregarBicicletas(bici);

        // Imprime la tabla después de agregar las bicicletas
        AlmacenBicis.imprimirTabla(almacen.getBicicletas());


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

                    almacen.addBicicleta();
                    break;

                case 2:
                    almacen.ventaBici();
                    break;

                case 3:
                    almacen.consultaBici();
                    break;

                case 4:
                    almacen.mostrarStockTotal();
                    AlmacenBicis.imprimirTabla(AlmacenBicis.bicicletas);
                    break;
            }
        } while (opcion != 0);
    }
}