package arrays;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int[] temperatura = new int[12];

        String icono="\u2584";
        int i, j;

        String[] mes = { "enero", "febrero", "marzo", "abril", "mayo", "junio",
                "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" };

        for (i = 0; i < 12; i++) {
            System.out.print("Introduzca la temperatura media de " + mes[i] + ": ");
            temperatura[i] = leer.nextInt();
        }
        for (i = 0; i < 12; i++) {
            System.out.printf( "%12s │", mes[i]);

            for (j = 0; j < temperatura[i]; j++) {
                System.out.print( icono);
            }
            System.out.print(" "+temperatura[i]+"ºC");
            System.out.println();
        }
    }
}
