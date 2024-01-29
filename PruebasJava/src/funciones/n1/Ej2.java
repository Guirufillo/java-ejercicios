package funciones.n1;

import java.util.Scanner;

public class Ej2 {
    public final static float PI = 3.141592f;
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);

        System.out.print("Introduce un radio: ");
        double radio= Double.parseDouble(leer.next());

        System.out.printf("el diametro de la circunferencia es: %.2f \n", longitud(radio));
        System.out.printf("el area de la circunferencia es : %.2f",area(radio));

    }
    public static double longitud(double r){

        return 2*r*PI;
    }
    public static double area(double r){
        return r*r*PI;
    }
}
