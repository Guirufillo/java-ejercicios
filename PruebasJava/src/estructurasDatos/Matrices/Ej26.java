package estructurasDatos.Matrices;

import estructurasDatos.Main;

import java.util.Random;

public class Ej26 {
    public static void ejecutarEj26(){
        int[][] matriz= new int[4][8];
        int[][] matriz2= new int[8][4];
        Random n = new Random();

        int sumaTotal=0;

        int max=100;
        int min=0;

       System.out.println("Toda la matriz (por filas)");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("matriz "+(i+1)+": ");

            for (int z = 0; z < matriz[i].length; z++) {
                matriz[i][z] = n.nextInt(100);
                System.out.print(matriz[i][z] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("La matriz traspuesta (por columnas)");
        for (int i = 0; i < matriz2.length; i++) {
            System.out.print("matriz "+(i+1)+": ");

            for (int z = 0; z < matriz2[i].length; z++) {
                matriz2[i][z] = matriz[z][i];
                System.out.print(matriz2[i][z] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("La matriz por filas con la suma total de cada fila");
        for (int i = 0; i < matriz.length; i++) {
            int suma=0;
            System.out.print("matriz "+(i+1)+": ");
            for (int z = 0; z < matriz[i].length; z++) {

                suma+=matriz[i][z];
                System.out.print(matriz[i][z] + " ");
            }
            System.out.print(" suma: "+suma);
            System.out.println();
            sumaTotal+=suma;
        }
        System.out.println();
        System.out.println("Los valores máximo y mínimo de la matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int z = 0; z < matriz[i].length; z++) {

              if (matriz[i][z] < max){
                  max=matriz[i][z] ;
              }
              if(matriz[i][z] > min){
                    min=matriz[i][z] ;
                }
            }
        }
        System.out.println("maximo es: "+min);
        System.out.println("minimo es: "+max);

        System.out.println();
        System.out.println("La media de toda la matriz es: "+sumaTotal/4);

        System.out.println();
        System.out.println("Dime la fila?: ");
        int fila= Main.leer.nextInt();
        System.out.println("Dime la columna?: ");
        int columna= Main.leer.nextInt();

        System.out.print("Se encuentra el numero ["+ matriz[fila][columna] + "]");

        System.out.println(" ");
        System.out.println("Indique una fila");
         fila= Main.leer.nextInt();
        System.out.print("La fila "+fila+" es :");
        for (int i = fila; i == fila; i++) {
            for (int z = 0; z < matriz[i].length; z++) {
                System.out.print(" [" + matriz[fila][z] + "]");
            }
        }

        System.out.println(" ");
        System.out.println("Indique una Columna");
        columna= Main.leer.nextInt();
        System.out.print("La columna "+columna+" es :");
        for (int i = 0; i<matriz.length; i++) {
            for (int z = columna; z == columna; z++) {
                System.out.print(" [" + matriz[i][columna] + "]");
            }
        }

        System.out.println(" ");
        System.out.println("Suma columna 7");

            for (int i = 0; i<matriz.length; i++)  {
                System.out.print("matriz "+(i+1)+": ");
                int sumatorio=0;
               for (int z = 0; z < matriz[i].length; z++){
                    if (z == matriz[i].length - 1) { //7==matriz[7],verifica si estamos en la última columna. Esta es una manera clara y efectiva de determinar cuándo almacenar el resultado en la última columna.
                        matriz[i][z] = sumatorio; //imprime la suma total.
                    } else {
                        sumatorio += matriz[i][z];
                    }
                    System.out.print(" [" + matriz[i][z] + "]");
                }
                System.out.println();
            }
             /* for (int i = 0; i<matriz.length; i++) {
                        System.out.print("matriz "+(i+1)+": ");
                        int sumatorio=0;

                        for (int z = 0; z < matriz[i].length - 1; z++) {
                            sumatorio += matriz[i][z]; // Acumulamos la suma de las siete primeras columnas
                            System.out.print(" [" + matriz[i][z] + "]");
                        }
                        matriz[i][matriz[i].length - 1] = sumatorio; // Guardamos la suma en la última columna
                        System.out.print(" [" + matriz[i][matriz[i].length - 1] + "]");
                        System.out.println();
                    }*/
    }
}
