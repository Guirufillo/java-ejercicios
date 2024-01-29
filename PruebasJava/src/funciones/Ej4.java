package funciones;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);

        System.out.print("dime un numero y te dire su factorial: ");
        int num= leer.nextInt();

        System.out.println(fac(num));



    }
    public static int fac(int n){
        int total = 1;
        for (int i=n; i > 0; i--){
             total= total*i;
        }
        return total;
    }
}
