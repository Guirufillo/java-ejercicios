package estructurasDatos.Matrices;

import estructurasDatos.Main;

import java.util.Arrays;
import java.util.Random;

public class Ej21 {
    public static void ejecutarEj21(){
        int[] rays = new int[10];
        int opcion;
        String intro;

        do {
            System.out.println(" ");
            System.out.println("MENÚ PRINCIPAL");
            System.out.println("==============");
            System.out.println( "1.-Rellenar array.\n" +
                                "2.-Visualizar contenido del array\n" +
                                "3.-Visualizar contenido par.\n" +
                                "4.-Visualizar contenido múltiplo de 3\n" +
                                "0.-Salir del menú.\n");

            System.out.print("Selecciona una opción: ");
             opcion = Main.leer.nextInt();
             intro = Main.leer.nextLine();

            switch (opcion) {
                case 1:
                    crearArray(rays);
                    break;
                case 2:
                    visualizarArray(rays);
                    break;
                case 3:
                    visualizarPares(rays);
                    break;
                case 4:
                    visualizarMultiple3(rays);
                    break;
                default:
                    System.out.println("no has introducido una opción válida");
            }
            System.out.println(" ");
            if (opcion !=0){
            System.out.print("Presiona INTRO para continuar ...");
             intro =Main.leer.nextLine();}

        }while (opcion !=0);
    }
    public static void crearArray(int[] rays){ //rellena el array con números  aleatorios del 0 al 50.
        Random n=new Random();
        int num;
        for (int i =0; i< rays.length;i++){
            num= n.nextInt(50);
            rays[i]=num;
        }
        System.out.println("creando su arrays...");
    }

    public static void visualizarArray(int[] rays){   //visualiza todo el contenido del array.
        System.out.println("visualiza el contenido del arrays creado...");
        for (int contenido:rays){
            System.out.print("["+contenido+"]");
        }

    }
    public static void visualizarPares(int[] rays){ //muestra la posición y el contenido de los elementos que tienen valor par.

        System.out.println("visualiza los pares del arrays...");

        for (int contenido : rays) {
            if (contenido % 2 == 0) {
                System.out.print("[" + contenido + "]");
            }
        }
    }
    public static void visualizarMultiple3(int[] rays){ //muestra la posición y el contenido de los elementos que son múltiplo de 3.
        for (int contenido : rays) {
            if (contenido % 3 == 0) {
                System.out.print("[" + contenido + "]");
            }
        }
    }
}
