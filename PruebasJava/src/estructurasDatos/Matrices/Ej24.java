package estructurasDatos.Matrices;

import java.util.Random;

public class Ej24 {
    public static void ejecutarEj24(){

        int[] v=new int[10];
        int[] p=new int[10];
        Random n=new Random();
        int num=0;

        for (int i=0; i< v.length; i++){
            v[i]=n.nextInt(20);
            System.out.print(v[i]+" ");
        }
        System.out.println();
        for (int i=0; i< p.length; i++){
            p[i]= v[i];
            num+=p[i];
            System.out.print(num+" ");
        }
    }
}
