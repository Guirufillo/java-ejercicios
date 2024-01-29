package funciones.n1;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Inserte numero: ");
        int n = leer.nextInt();
        tabla(n);
        System.out.println("Gracias por participar");

    }

    public static void tabla(int num) {
        Scanner leer = new Scanner(System.in);

        while (num > 0){
            for (int i = 1; i <= 10; i++) {
                int tabla = num * i;
                System.out.println(num+"*" + i + "=" + tabla);
            }
            System.out.println("ingresa otro numero: ");
            num = leer.nextInt();
        }
    }
}
