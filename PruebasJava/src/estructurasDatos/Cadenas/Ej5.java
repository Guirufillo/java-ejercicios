package estructurasDatos.Cadenas;

import estructurasDatos.Main;

import java.util.Scanner;

public class Ej5 {
    public static void ejecutar5(){

        System.out.print("Escribe una frase y te dire que palabra es la mas larga: ");
        String frase= Main.leer.nextLine();

        String[] palabras= frase.split(" ");

        int l1= 0;

        String p2 = " ";
        for (String palabra:palabras) {

            if(palabra.length() > p2.length()){
                p2=palabra;
            }

            for (int i = 0; i< palabra.length(); i++){
                if (i>l1){
                    l1=i+1;
                }
            }
        }
        System.out.println("La palabra "+p2+" con "+l1+" letras, es la más larga ");
    }
}

