package funciones.n1;

import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        System.out.println("Introduce una letra");
        char letra= leer.nextLine().charAt(0);;

        System.out.println("Introduce un numero");
        int num= leer.nextInt();


        contador(num,letra);
    }
    public static void contador(int n, char l){

        String num= String.valueOf(n);
        String letra= String.valueOf(l);

        //convertimos a cadena(String) el numero y la letra.

        int i=0, j = 0, k=0,z=0;
        for (i=0; i<10;i++) {
            for (j = 0; j < 10; j++) {
                for (k = 0; k < 10; k++) {
                    for (z = 0; z < 10; z++) {

                        String aux=i+"-"+j+"-"+k+"-"+z; //aux es un String  "0-0-0-0"

                        System.out.println(aux.replace(num,letra)); //replace: reemplaza numero por letra letra;
                    }
                }
            }
        }
    }
}
