package prueba;

import javax.swing.*;

public class Arreglos {
    public static void main(String[] args) {

      /*  int tpar=0;
        int timp=0;

        pares = 0;

      int[] numeros = new int[4];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=i*3;
            System.out.println("i = " + numeros[i]);
        }*/

        /*String[][] nombres=new String[3][2];
        nombres[0][0]="pepe";
        nombres[0][1]="pepa";
        nombres[1][0]="josefa";
        nombres[1][1]="paco";
        nombres[2][0]="lucas";
        nombres[2][1]="pancha";*/

        String[][] nombres= {{"pepe","pepa"},{"pipo", "rebeca"}, {"puru","rutu"}};

        for (String[] fila:nombres) {
            for (String nombre:fila) {
                System.out.print( nombre + "\t");
            }
            System.out.println();
        }
    }
}
