package estructurasDatos.Matrices;

import estructurasDatos.Main;

import java.util.Random;

public class Ej20 {
    public static void ejecutarEj20(){

        int[] arrays= new int[10];
        Random n=new Random();
        int num = 0;
        System.out.print("array: ");
        for (int i =0; i< arrays.length;i++){
            num= n.nextInt(8);
            arrays[i]=num;
            System.out.print("["+arrays[i]+"]");
        }
        System.out.println(" ");
        System.out.println("Busca la posicion de tu numero");
        int numero= Main.leer.nextInt();

        arry(arrays, numero);

    }
    public static void arry(int []array,int num){
        for (int i=0;i< array.length;i++){
            if (num== array[i]){
                System.out.println("Posicion: "+i);
            }
        }

    }
}
