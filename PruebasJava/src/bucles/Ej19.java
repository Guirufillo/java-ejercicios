package bucles;

import java.util.Scanner;

public class Ej19 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);

        System.out.print("Introduzca la altura de la piramide: ");
        int alt= leer.nextInt();

        System.out.print("Introduzca el relleno de la piramide: ");
        String relleno= leer.next();

        for (int i=1; i<= alt; i++){
            for (int z=1; z <= alt-i; z++){
                System.out.print(" ");
            }
                for(int j=1; j <= i; j++) {
                    System.out.print(relleno);
                }
            System.out.println(" ");
        }
    }
}
