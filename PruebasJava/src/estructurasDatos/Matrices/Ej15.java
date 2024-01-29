package estructurasDatos.Matrices;

import estructurasDatos.Main;

public class Ej15 {
    public static void ejecutarEj15(){
        int num[]= new int[15];
        int n;
        int contador = 1;//Variable usada para controlar las columnas.
        final int COLUMNAS = 3;//Constante con el número de columnas que queremos.

        for (int i=0; i< num.length; i++){
            System.out.print("Introduce numero"+(i+1)+": ");
            n= Main.leer.nextInt();
            num[i]=n;
        }
        System.out.println("************************\n");

        for (int i = 0; i < num.length; i++){//bucle que se repite tantas veces como elementos tiene el array.
            System.out.printf("%5d", num[i]);//Imprimimos con un ancho de 5 caracteres el elemento.
            if (contador  % COLUMNAS == 0){ //Si el resto de la división entre contador y columnas es 0...
                System.out.println();       //Salto de línea.
            }
            contador++;//Sumamos uno al contador.
        }
    }
}
