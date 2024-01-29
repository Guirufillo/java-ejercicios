package estructurasDatos.Cadenas;

import estructurasDatos.Main;

import java.sql.Array;
import java.util.Arrays;
import java.util.Locale;

public class Ej11 {
    public static void ejecutarEj11(){

        System.out.print("Escribe tu nombre: ");
        String nombre= Main.leer.next();
        System.out.print("Escribe tu primer apellido: ");
        String primer=Main.leer.next();
        System.out.print("Escribe tu segundo apellido: ");
        String segundo=Main.leer.next();

        String completo= nombre+" "+primer+" "+segundo;
        //apartado a) El nombre completo con todos el caracteres en minúscula, después en mayúscula y después su longitud.
        System.out.println("Apartado a) \n");

        System.out.println(completo.toLowerCase());
        System.out.println(completo.toUpperCase());
        System.out.println(completo.length());
        System.out.println("*********************************");

        //Apartado b) Los 5 primeros caracteres de la cadena (solo en el caso de que la longitud sea de 5 o más caracteres).
        System.out.println("Apartado b) \n");

        if (completo.length() >= 5) {
            System.out.println("Los primeros 5 caracteres de la cadena son: " + completo.substring(0, 5));
        } else {
            System.out.println("La cadena es demasiado corta para obtener los primeros 5 caracteres.");
        }


        System.out.println("*********************************");

        //Apartado c) Los dos últimos caracteres de la cadena (solo en el caso de que la longitud sea de dos o más caracteres).
        System.out.println("Apartado c) \n");

        if (completo.length() >= 2) {
            System.out.println("Los dos últimos caracteres de la cadena son: " + completo.substring(completo.length() - 2));
        } else {
            System.out.println("La cadena es demasiado corta para obtener los dos últimos caracteres.");
        }


        System.out.println("*********************************");

        //Apartado d) El número de ocurrencias en la cadena del último carácter.
        System.out.println("Apartado d) \n");
        char p = 0;
        String p1="",p2;
        int cont=0;

        for ( int i=0; i<completo.length();i++){
            p=completo.charAt(i);
            p1=(completo.substring(completo.length() - 1));
            p2=String.valueOf(p);

                if(p1.equals(p2) ){
                    cont++;
                }
            }
        System.out.println("Ocurrencias de "+p1+": "+cont);

        System.out.println("*********************************");

        //Apartado e) La cadena con todas las ocurrencias del primer carácter en mayúscula
        System.out.println("Apartado e) \n");

        String palabro= completo.replace(completo.charAt(0),Character.toUpperCase(completo.charAt(0)));
        System.out.println(palabro);


        System.out.println("*********************************");

        //partado f) La cadena con tres * por delante y por detrás.
        System.out.println("Apartado f) \n");

        System.out.println("***"+completo+"***");

        System.out.println("*********************************");

        //Apartado g) La cadena invertida.
        System.out.println("Apartado g) \n");

        completo = completo.toLowerCase();
        String inverter="";

        for (int i=completo.length()-1; i>=0; i--){
            inverter+=completo.charAt(i);
        }
        System.out.println(inverter);
    }
}
