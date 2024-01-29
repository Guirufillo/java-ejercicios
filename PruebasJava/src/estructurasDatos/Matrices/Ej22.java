package estructurasDatos.Matrices;

import estructurasDatos.Main;

public class Ej22 {
    public static void ejecutarEj22(){
        System.out.println("Introduce los 10 elementos del array");
        int[] p= new int[5];
        int[] s= new int[5];

        int arys = 0;

            for (int i = 0; i< p.length; i++){
                System.out.print("array["+(i+1)+"]= ");
                arys= Main.leer.nextInt();
                p[i]=arys;

            }
        for (int i = 0; i< s.length; i++){
            s[i] = p[i];

            if (s[i]<=10){
                s[i]=-1;
            }
        }

        System.out.println();
        System.out.println("array normal: ");
       for (int ray:p){
            System.out.print("["+ray+"] ");
        }

        System.out.println(" \n");
        System.out.println("array mayor de 10");
        for (int ray:s){
            System.out.print("["+ray+"] ");
        }
    }
}
