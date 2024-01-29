package funciones.n1;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce un caracter: ");
        char l= leer.next().charAt(0);
        System.out.print("Introuce un entero para repetir letra: ");
        int n1= leer.nextInt();
        System.out.print("Introuce otro entero para repetir filas: ");
        int n2= leer.nextInt();

        repe(l,n1,n2);

    }
    public static void repe(char letra, int num1, int num2) {

        for (int j = 0; j < num2; j++){
            for (int i = 0; i < num1; i++) {
                System.out.print(letra);
            }
            System.out.println(" ");
        }
    }
}
