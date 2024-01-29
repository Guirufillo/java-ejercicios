package funciones;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);

        System.out.print("Escribe un numero de comienzo: ");
       int num1= leer.nextInt();

        System.out.print("Escribe otro numero de final: ");
        int num2= leer.nextInt();

        for (int i=0; i<10;i++){
            System.out.print(num(num1,num2)+" ");
        }

    }

    public static int num (int n1, int n2) {
        int ale= ((int)(Math.random()*(n2-n1)+n1));
return ale;
    }
}
