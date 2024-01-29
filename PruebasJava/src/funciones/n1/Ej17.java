package funciones.n1;

import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);

        System.out.print("ancho: ");
        int ancho= leer.nextInt();

        System.out.print("alto: ");
        int alto= leer.nextInt();

        System.out.print("caracter: ");
        char c= leer.next().charAt(0);

        proceso(alto,ancho,c);
    }

    public static void proceso(int alto, int ancho, char c){

        for (int i=0; i<alto; i++){
            for (int j=0; j<ancho; j++){
                System.out.print(c);
            }
            System.out.println(" ");
        }
    }
}
