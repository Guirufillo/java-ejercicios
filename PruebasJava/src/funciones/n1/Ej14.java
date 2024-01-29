package funciones.n1;

import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int n1= leer.nextInt();

        System.out.print("Introduce otro numero: ");
        int n2= leer.nextInt();

        System.out.println("número combinatorio "+ n1+" sobre " +n2+" = "+resultado(n1,n2));
    }
    public static long factorial(int n){
        long k = 1;
        for (int i=n; i>1;i--){
            k= k*i;
        }
        return k;
    }
    public static long resultado(int n1, int n2){

        /* n1= factorial(n1);
            n2= factorial(n2);
            long x=factorial(n1-n2);
            long total= n1/(n2*x);*/

        return factorial(n1)/(factorial(n2) * factorial(n1-n2));
    }
}
