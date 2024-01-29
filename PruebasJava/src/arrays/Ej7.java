package arrays;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int[] num =new int[10];
        int i;
        int mostrado;
        int sus;

        System.out.println("array original");
        for (i=0;i<10;i++){
            num[i]=(int)(Math.random()*20);
            System.out.print(num[i]+" ");
        }
        System.out.println();
        System.out.println("Introduzca un número de los que se han mostrado: ");
         mostrado= leer.nextInt();

        System.out.println("Introduzca el valor por el que quiere sustituirlo: ");
        sus= leer.nextInt();

        for (i=0;i<10;i++) {
            if (num[i] == mostrado) {
                num[i] = sus;
                System.out.print("\033[32m \"" + num[i] + "\"");
            } else {
                System.out.print("\033[38m "+ num[i]);
            }

        }
    }
}
