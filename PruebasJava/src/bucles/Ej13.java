package bucles;

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {

        Scanner leer= new Scanner(System.in);
        int contador=0;
        int nPlus=0;
        int nNegativo=0;
        int n=0;


        for (int i=0; i<5; i++){

            System.out.print("introduce numero: ");
             n= leer.nextInt();

            if (n > 0){
                contador= nPlus++;
            } else if (n <= 0) {
                contador= nNegativo++;
            }
        }
        System.out.println("numero positivos: "+nPlus);
        System.out.println("Numero negativos: "+nNegativo);
    }
}
