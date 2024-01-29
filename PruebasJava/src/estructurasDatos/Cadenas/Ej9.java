package estructurasDatos.Cadenas;

import estructurasDatos.Main;

public class Ej9 {
    public static void ejecutar9(){
        System.out.print("Escribe tu frase. ");
        String frase= Main.leer.nextLine();
        letras(frase);
    }
    public static void letras(String frase) {
        for (int i = 1; i < frase.length(); i += 2) {
            System.out.print(frase.charAt(i));
        }
    }
}
