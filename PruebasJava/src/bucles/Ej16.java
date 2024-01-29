package bucles;

import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);

        System.out.print("Dame un numero: ");
        int numeroIntroducido= leer.nextInt();

        boolean esPrimo = true;

        for (int i = 2; i < numeroIntroducido; i++) {
            if ((numeroIntroducido % i) == 0) {
                esPrimo = false;
            }
        }

        if (esPrimo) {
            System.out.println("El número introducido es primo.");
        } else {
            System.out.println("El número introducido no es primo.");
        }
    }
}
