package poo.java.ObjetosSimples.ej2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer= new Scanner(System.in);
        int km;
        int opcion=0;
        Bicicleta BH= new Bicicleta(15);
        Coche Ibiza= new Coche(1600);

        while (opcion !=8){
        System.out.println("\n   VEHÍCULOS\n" +
                "   =========\n" +
                "1. Anda con la bicicleta\n" +
                "2. Haz el caballito con la bicicleta\n" +
                "3. Anda con el coche\n" +
                "4. Quema rueda con el coche\n" +
                "5. Ver kilometraje de la bicicleta\n" +
                "6. Ver kilometraje del coche\n" +
                "7. Ver kilometraje total\n" +
                "8. Salir\n");
                System.out.print( " Elige una opción (1-8): ");

                    opcion=leer.nextInt();

                System.out.println("\n");


            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántos kilómetros quiere recorrer? ");
                    km = leer.nextInt();
                    BH.recorre(km);
                    break;
                case 2:
                    BH.hazCaballito();
                    break;
                case 3:
                    System.out.print("¿Cuántos kilómetros quiere recorrer? ");
                    km = leer.nextInt();
                    Ibiza.recorre(km);
                    break;
                case 4:
                    Ibiza.quemaRuedas();
                    break;
                case 5:
                    System.out.println("La bicicleta lleva recorridos ");
                    System.out.println(BH.getKilometrosRecorridos() + " Km");
                    break;
                case 6:
                    System.out.println("El coche lleva recorridos ");
                    System.out.println(Ibiza.getKilometrosRecorridos() + " Km");
                    break;
                case 7:
                    System.out.println("Los vehículos llevan recorridos ");
                    System.out.println(Vehiculo.getKilometrosTotales() + " Km");
                default:
            }
        }
    }
}
