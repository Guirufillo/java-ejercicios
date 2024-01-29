package funciones;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);

        System.out.println("introduce un lado del cuadrado");
        int lado1= leer.nextInt();

        System.out.println("introduce otro lado del cuadrado");
        int lado2= leer.nextInt();

        int cuadrado=cubo(lado1,lado2);
        System.out.println("el area del cuadrado es: "+cuadrado);

    }

    public static int cubo(int a, int b){
        int cuadrado= a*b;
        return cuadrado;
    }
}
