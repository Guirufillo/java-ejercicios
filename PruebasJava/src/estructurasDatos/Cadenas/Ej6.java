package estructurasDatos.Cadenas;

import estructurasDatos.Main;

public class Ej6 {
    public static void ejecutar6() {
        System.out.println("Introduce una frase: ");
        String frase= Main.leer.nextLine();

        System.out.println("cuantas veces quieres que se repita: ");
        int num= Main.leer.nextInt();

        for (int i=0; i<num; i++){
            System.out.println(frase);
        }

    }
}
