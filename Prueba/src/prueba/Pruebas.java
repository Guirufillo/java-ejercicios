
package prueba;

import javax.swing.*;

import java.util.Scanner;

public class Pruebas {

    public static void main(String[] args) {

       int [][] matrix=new int[6][5];
       for(int i=0;i<6;i++){
           System.out.println();
           for(int j=0;j<5;j++){
               System.out.print(matrix [i][j] +" ");
           }
       }

        /*int[][] matrix={
                {12,34,67,76},
                {98,34,65,9},
                {45,67,89,12}
        };
        for(int i=0;i<3;i++){
            System.out.println();
                for(int j=0;j<4;j++){
                    System.out.print(j+" ");
                }
        }


        /*for (int i=0;i<1000;i++){
        int numAleatorio=(int)(Math.random()*(6-1+1)+1);
        System.out.println(numAleatorio);}*/


      /* Scanner entrada=new Scanner(System.in);
        int num=0;
		String paises[] = new String[4];

				for(int i=0;i< paises.length;i++){
					//paises[i]= JOptionPane.showInputDialog("introduce país " +(i+1));}
					System.out.println("introduce país " +(i+1));
						paises[i]= entrada.nextLine();}

				for(String elemento:paises){

                    num++;
				System.out.println(" El País numero " +num+": es "+ elemento);}


		entrada.close();*/
    }
}