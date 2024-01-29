package funciones.n1;

import java.util.Scanner;

public class Ej19 {

    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        String nif = obtenerNIF();
        System.out.println("El NIF " + nif + " es " + (compruebaNIF(nif) ? "correcto" : "incorrecto"));
    }

    public static String obtenerNIF() {
        System.out.println("*** COMPRUEBA TU NIF ***");
        System.out.print("Indica tu NIF (sin espacios ni guiones): ");
        return leer.nextLine();
    }

    public static boolean compruebaNIF(String nif) {
        String dni = "";

        char letra = nif.charAt(nif.length()-1); // Cogemos el último caracter del NIF que es la letra "E"

        for(int i = 0; i < nif.length(); i++) {
            char caracter = nif.charAt(i);
            if(Character.isDigit(caracter)) { // solo recoje digitos, 76143546, la letra E es un caracter.
                // Si es un dígito lo añadimos a dniString
                dni = dni + caracter;
            }
        }
        return letra == obtenerLetraDNI(dni);
    }

    public static char obtenerLetraDNI(String dni) {
        int DNI=Integer.parseInt(dni);
        String tabla = new String("TRWAGMYFPDXBNJZSQVHLCKE");
        return tabla.charAt(DNI % 23);
    }
}