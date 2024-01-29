package bucles;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {

        Scanner leer= new Scanner(System.in);

        System.out.print("Introduce una cifra y te diré cuantos digitos tiene: ");
        int num= leer.nextInt();
        
        int i=1;
        while (i<=num){
            num/= 10;
        i++;
        }
        System.out.println("El numero ingresado tiene "+i+ " cifras");
    }
}
