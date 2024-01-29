package estructurasDatos.Matrices;

import java.util.Random;

public class Ej23 {
    public static void ejecutarEj23(){
        int[] vector=new int[5];
        int[] arr=new int[5];
        Random n= new Random();
        int num;
        System.out.println("vector normal");
        for (int i=0;i< vector.length;i++){
            num= n.nextInt(20);
            vector[i]=num;
            System.out.print(num+" ");
        }
        System.out.println(" ");
        System.out.println("vector al reves");
        for (int i= arr.length-1; i>=0; i--){
            arr[i]=vector[i];
            System.out.print(arr[i]+" ");
        }

    }
}
