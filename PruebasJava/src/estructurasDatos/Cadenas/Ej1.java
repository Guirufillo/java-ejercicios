package estructurasDatos.Cadenas;
import estructurasDatos.Main;

import java.util.Scanner;
public class Ej1 {
        //static Scanner leer;
        public static void execute() {

            StringBuilder nuevaFrase = new StringBuilder();

            System.out.println("Escribe una frase: ");
            String frase = Main.leer.nextLine();

            //División de la frase en palabras:
            String[] palabras = frase.split(" ");

            for(String palabra: palabras) {
               nuevaFrase.append (Character.toUpperCase(palabra.charAt(0)));

               for (int i=1;i<palabra.length();i++){
                   nuevaFrase.append (palabra.charAt(i));
                }
                nuevaFrase.append(" ");
            }
            System.out.println(nuevaFrase);
        }
    }
