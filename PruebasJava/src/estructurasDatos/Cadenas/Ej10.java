package estructurasDatos.Cadenas;

import estructurasDatos.Main;

public class Ej10 {
public static void ejecutar10(){
    System.out.print("Primero la frase. ");
    String frase= Main.leer.nextLine();

        System.out.println(palabreja(frase));
    }
    public static boolean palabreja(String frase){
        frase = frase.toLowerCase();
        String inverter="";
        boolean palabrea=false;

        for (int i=frase.length()-1; i>=0; i--){
            inverter+=frase.charAt(i);
        }
        if (inverter.equals(frase)){
            palabrea=true;
        }
    return palabrea;
    }
}
