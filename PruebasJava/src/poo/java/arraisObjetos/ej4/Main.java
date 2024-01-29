package poo.java.arraisObjetos.ej4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int num=10;
        int opcion=9;
         int codigo;
         String autor;
         String autorNuevo;
         String titulo;
         String tituloNuevo;
         String genero;
         String generoNuevo;
         int duracion;
         int duracionNuevo;

         poo.java.arraisObjetos.ej4.ArrayDisco discos=new ArrayDisco(num);

        do {
            System.out.println("introduzca su opcion:");
            System.out.print(    "1. agregar disco\n"
                                +"2. modificar disco\n"
                                +"3. eliminar disco\n"
                                +"4. listar discos\n"
                                +"Opcion elegida:");
            opcion= leer.nextInt();

            switch (opcion){
                case 1:

                    System.out.print("Introduce el codigo del disco: ");
                    codigo = leer.nextInt();
                    System.out.print("Introduce el autor del disco: ");
                    autor = leer.next();
                    System.out.print("Introduce el titulo del disco: ");
                    titulo = leer.next();
                    System.out.print("Introduce el genero del disco: ");
                    genero=leer.next();
                    System.out.print("Introduce la duración del disco: ");
                    duracion=leer.nextInt();
                    discos.agregarDisco( codigo, autor, titulo, genero, duracion);
                    break;

                case 2:
                    System.out.print("Introduce el codigo del disco a modificar: ");
                    codigo = leer.nextInt();
                    System.out.print("Introduce el autor del disco: ");
                    autorNuevo = leer.next();
                    System.out.print("Introduce el titulo del disco: ");
                    tituloNuevo = leer.next();
                    System.out.print("Introduce el genero del disco: ");
                    generoNuevo=leer.next();
                    System.out.print("Introduce la duración del disco: ");
                    duracionNuevo=leer.nextInt();
                    discos.modificarDisco( codigo, autorNuevo, tituloNuevo, generoNuevo, duracionNuevo);
                    break;

                case 3:
                    System.out.println("Inserta el codigo del disco a eliminar");
                    codigo=leer.nextInt();
                    discos.eliminarDisco(codigo);
                    break;

                case 4:
                    discos.listaDisco();
                    break;

                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        }while (opcion !=0);
    }
}
