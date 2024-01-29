package funciones.examen;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.print("Solicita el número de calificaciones que queremos generar: ");
        int alumnos= leer.nextInt();

        int notaMax=10;
        int notaMin=0;
        int sumaNotas=0;
        int notaMedia=0;
        int cont1=0;
        int cont2=0;

        for ( int i=1;i<=alumnos;i++){
           int nota = (int) (Math.random()*(10)+1);
            System.out.println("nota "+i+" : "+nota);
            sumaNotas+=nota;

            if (nota <= notaMax) {
                notaMax = nota;
            }
            if (nota >= notaMin) {
                notaMin = nota;
            }
            if (nota>=5){
                cont1++;
            }
            if (nota<5){
                cont2++;
            }
        }
        System.out.println("Calificación máxima: " + notaMin);
        System.out.println("Calificación mínima: " + notaMax);

        notaMedia=sumaNotas/alumnos;
        System.out.println("La nota media es :"+notaMedia);

        System.out.println("Hay "+cont1+" alumnos aprobados y "+cont2+" alumnos suspendidos");

    }
}
