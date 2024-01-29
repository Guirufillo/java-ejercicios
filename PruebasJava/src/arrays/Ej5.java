package arrays;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);

        int[] num= new int[5];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int i;
        System.out.println("Introduce numero y aprieta intro");

        for ( i=0; i<5;i++){
            num[i]= leer.nextInt();

            if(num[i] > max){
                max= num[i];
            }
            if(num[i] < min){
                min= num[i];
            }
        }
        System.out.println(" ");

        for( i=0; i<5;i++){
            System.out.print(num[i]);

            if (num[i]==max){
                System.out.print(" maximo");
            }
            if (num[i]==min){
                System.out.print(" minimo");
            }
            System.out.println();
        }
        
    }
}
