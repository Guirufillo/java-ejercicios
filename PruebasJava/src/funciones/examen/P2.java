package funciones.examen;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);

        System.out.print("Introudce una frase corta: ");
        String frase= leer.nextLine();
        System.out.print("Para e multiplo ingrese un numero: ");
        int num= leer.nextInt();

        System.out.println(cuentaPalabras(frase));
        System.out.println(pares(frase));
        System.out.println(multiplos(frase, num));

    }
    public static int cuentaPalabras(String frase){

        int cont=1;
        //No cuenta palabras, cuenta espacios en blanco
        for (int i=0; i<frase.length();i++){
            if (frase.charAt(i)==' ') { //  if (Character.isSpaceChar(frase.charAt(i)))
                cont++;
            }
        }
        return  cont;
    }

    public static String pares(String frase){
        String pPar = " ";
        for (int i=0; i<frase.length();i++){

            if (i % 2 == 0){
                pPar += Character.toUpperCase(frase.charAt(i));

            } else {
                pPar += Character.toLowerCase(frase.charAt(i));
            }
        }
        return pPar;
    }

    public static String multiplos(String frase, int n){

        String multi=" ";

        for (int i=0; i<frase.length();i++){
            if (i % n ==0){
                multi+=frase.charAt(i);
            }
        }
        return multi;
    }

}
