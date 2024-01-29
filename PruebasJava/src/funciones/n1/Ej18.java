package funciones.n1;

import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);

        System.out.println("Introduce tu DNI y te dire tu letra");
        String dni= leer.next();

        System.out.println(calcularNIF(dni));
    }
    public static String calcularNIF(String dni) {
        String tabla = new String("TRWAGMYFPDXBNJZSQVHLCKE");
        int dniEntero = Integer.parseInt(dni);
        int posLetra = dniEntero % 23;
        return dni+tabla.charAt(posLetra);
    }
}
