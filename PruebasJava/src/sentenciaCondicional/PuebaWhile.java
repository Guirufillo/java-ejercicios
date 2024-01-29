package sentenciaCondicional;

import java.util.Scanner;

public class PuebaWhile {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);

        int numero;
        String continua;

        do {
        System.out.print("Dime un numero: ");
        numero = leer.nextInt();

        if (numero % 2 == 0){
            System.out.println("Que bonito es el "+ numero);
        }else {
            System.out.println("No me gustan los números impares, adiós.");
        }
            System.out.print("¿Quiere continuar? (s/n): ");
            continua= leer.next().toUpperCase();

        } while((numero % 2 == 0) && (continua.equals("S")) );
    }
}
