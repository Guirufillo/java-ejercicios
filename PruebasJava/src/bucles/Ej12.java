package bucles;

import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args){

       int n=0;
       int axu=1;
       int suma=0;

        for( int i=0; i<=20; i++){
         n=axu;
         axu=suma;
         suma= n+axu;

            System.out.print(suma+",");
        }
    }
}
