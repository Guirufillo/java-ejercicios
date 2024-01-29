package estructurasDatos.Matrices;

import estructurasDatos.Main;

import java.util.Random;

public class Ej27 {
    public static void ejecutarEj27(){

        int[] v= new int[50];
        int[] p= new int[20];
        int[][] m = new int[20][50];
        Random n=new Random();
        int num;

        for (int i=0; i< v.length; i++){
            num= n.nextInt(20);
            v[i]=num;
            System.out.print(v[i]+", ");
        }
        System.out.println(" ");

        for (int j=0; j< p.length; j++){
            num= n.nextInt(10);
            p[j]=num;
            System.out.print(p[j]+", ");
        }
        System.out.println(" ");

        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < v.length; j++) {
                m[i][j] = p[i] * v[j];
            }
        }

        // Imprimir la matriz
        for (int i = 0; i < m.length; i++) {
            System.out.print("matriz " + (i + 1) + ": ");
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

    }
}
