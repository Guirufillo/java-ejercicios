package estructurasDatos.Cadenas;
import estructurasDatos.Main;

import java.util.Scanner;
public class Ej2 {

    static Scanner lector;
    public static void execute() {
        int contVocal=0;
        int contConsonante=0;
        System.out.print("Ingrese una frase: ");
        String frase= Main.leer.nextLine();

        for (int i=0; i<frase.length();i++){
        if (frase.charAt(i)=='a' || frase.charAt(i)=='e' || frase.charAt(i)=='i' || frase.charAt(i)=='o'|| frase.charAt(i)=='u' ){
            contVocal++;
        }
        else{
            if (frase.charAt(i)==' '){
                contConsonante--;
            }
            contConsonante++;
        }
        }
        System.out.println("la frase tiene "+contVocal+" vocales y "+contConsonante+" consonantes");
    }
}
