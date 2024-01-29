package aleatorios;

import java.util.Objects;
import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        char c='\u2764';
        System.out.println(c);

        Scanner leer=new Scanner(System.in);
        int minimo=0;
        int maximo=100;
        int cont=0;
        int num = 0;
        boolean acertado=false;

        do {
            num= (int)(Math.random()*(maximo-minimo)+minimo);
            System.out.println(num);

            System.out.print("El número que estás pensando es :mayor, menor , o he acertado: ");
            String mon= leer.next();

            if (mon.equals("mayor")) {
                minimo = num + 1;
            }
            if (mon.equals("menor")) {
                maximo = num - 1;
            }
            if (mon.equals("acertado")) {
                acertado=true;
                System.out.println("Acertaste!!");
            }
        }while (!acertado);

           // System.out.println("Acertaste!!");

            //System.out.println("No lo has conseguido");

    }
}
