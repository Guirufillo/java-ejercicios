package bucles;

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int num= leer.nextInt();

        for(int i=0;i<5;i++){
            num++;

            System.out.println(num+"  "+(num*2)+"  "+(num*3));
        }

    }
}
