package estructurasDatos.Matrices;

import java.util.Random;

public class Ej19 {
    public static void ejecutarEj19(){

        int[] arrays1= new int[100];
        Random n=new Random();
        int num = 0;

        for (int i =0; i< arrays1.length;i++){
             num= n.nextInt(100);
             arrays1[i]=num;
        }
        mult5(arrays1);
        mult10(arrays1);
        n0(arrays1);
    }
    public static void mult5(int[] ray) {
        System.out.print("Multiplos de 5: ");
        for (int multi : ray) {
            if (multi % 5 == 0)
                System.out.print(multi + " ");
        }
        System.out.println();  // Agregamos un salto de línea al final
    }

    public static void mult10(int[] ray1) {
        System.out.print("Multiplos de 10: ");
        for (int multi : ray1) {
            if (multi % 10 == 0)
                System.out.print(multi + " ");
        }
        System.out.println();  // Agregamos un salto de línea al final
    }

    public static void n0(int[] ray2) {
        System.out.print("Numeros cero: ");
        for (int num : ray2) {
            if (num == 0)
                System.out.print(num + " ");
        }
        System.out.println();  // Agregamos un salto de línea al final
    }
}