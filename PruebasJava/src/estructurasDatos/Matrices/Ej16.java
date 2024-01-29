package estructurasDatos.Matrices;

import java.util.Random;

public class Ej16 {
    public static void ejecutarEj16(){
        int cantidadAlumnos = 30;
        int alumnos[] = new int[cantidadAlumnos];
        double sumM = 0;
        int cont = 0;
        double total = 0;

        for (int i = 0; i < cantidadAlumnos; i++) {
            Random n = new Random();
            double num = n.nextDouble() * 10;  // Genera un número entre 0 y 10
            System.out.printf("Nota alumno %2d= %.2f%n", i + 1, num);

            total += num;

            if (num > 5) {
                sumM += num;
                cont++;
            }
        }

        // Asegúrate de que cont no sea cero para evitar división por cero
        if (cont != 0) {
            System.out.printf("La media de aprobados es: %.2f%n", sumM / cont);
        } else {
            System.out.println("No hay alumnos aprobados.");
        }
        System.out.printf("La media de notas general es: %.2f%n", total / cantidadAlumnos);
    }
}
