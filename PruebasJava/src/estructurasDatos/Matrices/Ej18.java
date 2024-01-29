package estructurasDatos.Matrices;

import java.util.Random;

public class Ej18 {
    public static void ejecutarEj18(){
        int[] arrays1= new int[10];
        int[] arrays2= new int[10];

        System.out.print("Array 1: ");
        for (int i=0; i<arrays1.length; i++){
            Random n1= new Random();
            int num1=n1.nextInt(10-1+1)+1;
            arrays1[i]=num1;
            System.out.print(" "+num1);
        }

        System.out.print("\nArray 2: ");
        for (int i=0; i<arrays2.length; i++){
            Random n2= new Random();
            int num2=n2.nextInt(10-1+1)+1;
            arrays2[i]=num2;
            System.out.print(" "+num2);
        }

        System.out.println(" ");

        sumatorio(arrays1,arrays2);

        System.out.println(" ");

        division(arrays1, arrays2);

    }

    public static void sumatorio(int[] n1, int[] n2){
        System.out.print("suma arrays: ");
        for (int i=0; i<10;i++){
            int suma= n1[i]+n2[i];
            System.out.print(" ["+suma+"]");
        }
    }
    public static void division(int[] n1, int[] n2){
        System.out.print("divi arrays: ");
        for (int i=0; i<10;i++){
            double divi= (double) n1[i]/n2[i];
            System.out.printf(" [%.1f]",divi);
        }
    }
}
