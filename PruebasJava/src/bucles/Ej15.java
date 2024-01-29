package bucles;

import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);

        System.out.print("Dame una base: ");
        int base= leer.nextInt();

        System.out.print("Dame un exponente :");
        int exp= leer.nextInt();

       int i=1;
       while (i<=exp){
           System.out.print(base+"^"+i+", ");
           i++;
       }

    }
}
