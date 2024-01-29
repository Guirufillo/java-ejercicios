package estructurasDatos.Matrices;

import estructurasDatos.Main;

public class Ej13 {
    public static void ejecutarEj13(){
        int num[]= new int[5];
        int n;
        int sum = 0;

        for (int i=0; i< num.length; i++){
            System.out.print("Introduce numero: ");
            n= Main.leer.nextInt();
            num[i]=n;
        }
        System.out.println("************************\n");
        for (int nu:num) {
            System.out.print(nu+", ");
        }
        System.out.println("\n************************");

        for (int su:num) {
            sum+=su;
        }
        System.out.print("la suma de todo es: "+sum+"\n");
        System.out.print("La media es: "+sum/5);
    }
}
