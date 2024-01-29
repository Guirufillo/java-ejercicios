package estructurasDatos.Cadenas;

import estructurasDatos.Main;

import java.util.Scanner;
public class Ej4 {
    public static void ejecutar4(){
        System.out.print("Escribe una frase y te dire numero de vocales y consonantes de cada palabra: ");
        String frase= Main.leer.nextLine();

        String[] palabras= frase.split(" ");

        for (String palabra:palabras) {
            int contVocal = 0;
            int contConsonante=0;
            for (int i = 0; i< palabra.length(); i++){
                if (palabra.charAt(i)=='a' || palabra.charAt(i)=='e' || palabra.charAt(i)=='i' || palabra.charAt(i)=='o'|| palabra.charAt(i)=='u' ){
                    contVocal++;
                }
                else{
                    contConsonante++;
                }
            }
            System.out.println("la palabra "+palabra+" tiene "+contVocal+" vocales y "+contConsonante+" consonantes");
        }
    }
}
