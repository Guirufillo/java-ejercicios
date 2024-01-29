package estructurasDatos.Cadenas;

import estructurasDatos.Main;

public class Ej7 {
    public static void ejecutar7(){
        System.out.print("Escribe tu frase favorita: ");
        String frase= Main.leer.nextLine();

        String [] palabras=frase.split(" ");

        for (String palabra:palabras) {
            System.out.println(palabra);
        }
    }
}
