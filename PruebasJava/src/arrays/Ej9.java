package arrays;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int i;
        int[] num= new int[5];

        System.out.print("Introduzca numeros y le dire cuales son par o impar: ");
        for ( i=0; i<5;i++){
        num[i]=leer.nextInt();
        }
        System.out.println();
        for ( i=0; i<5;i++) {
            if (num[i] % 2 == 0) {
                System.out.println(num[i] + " par");
            } else {
                System.out.println(num[i] + " impar");
            }
        }
    }
}
