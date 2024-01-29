package funciones.n1;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
    Scanner leer= new Scanner(System.in);

        System.out.print("Inserte numero: ");
        int n= leer.nextInt();
        System.out.println("El numero dumatorio("+n+"): "+suma(n));
    }

    public static int suma(int n){
        int total=0;
        for (int i=1; i<=n; i++){
            total= total+i;
        }
        return total;
    }
}
