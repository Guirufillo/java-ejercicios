package estructurasDatos.Matrices;

import java.util.Random;

public class Ej28 {
    public static void ejecutarEj28() {
        char[] letra = new char[10];
        Random l = new Random();

        // Generar letras aleatorias y mostrarlas
        for (int i = 0; i < letra.length; i++) {
            int leti = l.nextInt(26) + 65; // (90-65+1)=26 Cambiado para que solo genere letras mayúsculas
            letra[i] = (char) leti;
            System.out.print(letra[i] + ", ");
        }
        System.out.println(" ");

        // Contar la frecuencia de cada letra mayúscula
        int[] frecuenciaLetras = new int[26];
        for (int i = 0; i < letra.length; i++) {
            char letraActual = letra[i];

            // Verificar si es una letra mayúscula
            if (letraActual >= 'A' && letraActual <= 'Z') {
                // Incrementar la frecuencia de la letra correspondiente
                frecuenciaLetras[letraActual- 'A']++; // es como decir letra actual-1, para que comienze desde 0, a=0, b=1
            }
        }

        // Mostrar la frecuencia de cada letra mayúscula
        char letraActual = 'A';
        for (int i = 0; i < frecuenciaLetras.length; i++) {
            System.out.println(letraActual + " --> " + frecuenciaLetras[i]);
            letraActual++;
        }
    }
}