package estructurasDatos.Cadenas;

import estructurasDatos.Main;

import java.util.*;

public class Ej3 {
    static Scanner lector;
    public static void execute() {
        System.out.println("Escribe una frase: ");
        String frase = Main.leer.nextLine();
        int cont=0;
        //División de la frase en palabras:
        String[] palabras = frase.split(" ");

        for (int i=0; i< palabras.length; i++){
            cont++;
        }

        System.out.println("La frase "+frase+" tiene "+cont+" palabras");
    }

     /*   String frase;
        System.out.print("Frase: ");
        frase = Main.lector.nextLine();
        System.out.println("La frase " + frase + " tiene " + nPalabras(frase) + " palabras");
    }
    public static int nPalabras(String frase) {
        return frase.split(" ").length;
    }*/
}