package estructurasDatos.Matrices;

import java.util.Random;

public class Ej25 {
    public static void ejecutarEj25() {
        int[] v = new int[5]; //{1,3,5,7,8};
        int[] p = new int[5];
        Random n = new Random();
        int contador = 0;


        for (int i = 0; i < v.length; i++) {
            v[i] = n.nextInt(20);
            System.out.print(v[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < p.length; i++) {
            p[i] = v[i];
            if (p[i] % 2 == 0) {
                System.out.print(p[i] + " ");
                contador++;
            }
        }
        if (contador==0){
            System.out.println("No hay pares para imprimir");
        }
    }
}