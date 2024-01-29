package bucles;

import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        System.out.print("Dame una base: ");
        int base= leer.nextInt();

        System.out.print("Dame un exponente :");
        int exp= leer.nextInt();

        int a=0;
        int b=0;
        int c=base;

        for (int i=0; i < exp; i++){
           a=c;
           b=a*base;
           c=b;
        }
        System.out.println("resultado: "+a);
    }
}
