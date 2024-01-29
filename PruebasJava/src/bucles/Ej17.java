package bucles;

import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);


      /*  System.out.print("Introduce un número entero positivo: ");
        int n = leer.nextInt();
        int numero =n;
        int num=5;
        int a=n;
        int b=0;

            if (numero > 0) {
                for (int i = 0; i <= num; i++) {
                    b = ++n;
                    a = a + b;
                }
                System.out.println("la suma de los "+num+" numeros sigientes a "+numero+" es "+ a);

            }else{
                 System.out.println("No ha introducido un numero entero positivo");
                }*/


        int n=0;
        int num=5;
        do{
            System.out.print("Introduce un número entero positivo: ");
            n = leer.nextInt();

            if(n < 0){
                System.out.println("No ha introducido un numero entero positivo");
            }

        }while(n <0);

        int a=0;
            for (int i=n; i<n+num;i++){
                a=a+i;
            }
        System.out.println("la suma de los "+num+" numeros sigientes a "+n+" es "+ a);
    }
}
