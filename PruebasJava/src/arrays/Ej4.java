package arrays;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int[] numero= new int[5];
        int[] cuadrado= new int[5];
        int[] cubo= new int[5];
        int i;

        for ( i=0; i<5; i++) {
            numero[i] = (int)(Math.random()*101);
            cuadrado[i]=numero[i]*numero[i] ;
            cubo[i]=numero[i]*numero[i]*numero[i] ;
        }

        System.out.println("  n  │   n²  │    n³\n ────┼───────┼─────────");
        for ( i=0; i<5; i++) {
            System.out.printf("%4d │ %5d │%8d \n", numero[i], cuadrado[i], cubo[i]);
        }
    }
}
