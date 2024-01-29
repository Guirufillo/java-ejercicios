package arrays;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {

        Scanner leer= new Scanner(System.in);

        int [] num= new int[5];
        int i;

        System.out.println("Por favor, introduzca 10 números enteros.");

        System.out.println("Pulse la tecla INTRO después de introducir cada número.");
        for ( i=0; i<5; i++) {
            num[i] = leer.nextInt();

        }
        System.out.println("\nLos números introducidos, al revés, son los siguientes:");
        for (i=4; i>=0; i--){
            System.out.print(num[i]+" ");
        }
    }
}
