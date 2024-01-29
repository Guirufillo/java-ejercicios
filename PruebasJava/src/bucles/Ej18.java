package bucles;

import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);

        System.out.print("introduce un numero entero: ");
        int n1= leer.nextInt();

        System.out.print("introduce otro numero entero: ");
        int n2= leer.nextInt();

        int nMayor=0;
        int nMenor=0;
        int resultado=0;

        if (n1 < n2){
            nMayor= n2;
            nMenor= n1;
        } else  {
            nMayor= n1;
            nMenor= n2;
        }

        for( int i=nMenor; i< nMayor; i+=7){
             resultado=i;
            System.out.print(resultado+",");
        }
    }
}
