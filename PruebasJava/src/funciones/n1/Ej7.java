package funciones.n1;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Introuce un entero para calcular su factorial (n!): ");
        int n= leer.nextInt();
        System.out.println(factorial(n));
    }
    public static int factorial(int n){
        int aux=1;
       for (int i=n; i>=1;i--)
           aux = aux * i;

            return aux;
    }

}
