package estructurasDatos.Cadenas;

import estructurasDatos.Main;

public class Ej8 {
    public static void ejecutar8(){
        System.out.print("Introduce una frase chula: ");
        String frase= Main.leer.nextLine();

        String [] palabras=frase.split(" ");
        int i;
        for (String palabra:palabras) {

            for ( i=0; i<palabra.length();i++){

            }
            System.out.println(palabra+"    "+i);
        }

    }
}
