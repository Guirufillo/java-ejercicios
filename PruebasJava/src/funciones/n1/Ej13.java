package funciones.n1;

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("¿Como te llamas? ");
        String nombre = leer.next();

        char opcion;

        do{
             opcion = selecion();
            if(opcion!='a' && opcion!='b' && opcion!='c'){
                System.out.println(opcion + " no es una opción válida.");
                System.out.println("Por favor, elija una opción del menú");
            }
        }while (opcion!='a' && opcion!='b' && opcion!='c');

        idioma(opcion, nombre);
    }
    public static char selecion(){
        Scanner leer = new Scanner(System.in);
        char idioma;
        System.out.println("a) Valenciano. ");
        System.out.println("b) Castellano. ");
        System.out.println("c) Ingles. ");
        idioma = leer.next().charAt(0);
        return idioma;
    }
    public static void idioma(char selec, String nom) {

        switch (selec) {
            case 'a':
                System.out.println("bon dia " + nom);
                break;
            case 'b':
                System.out.println("buenos dias "+ nom);
                break;
            case 'c':
                System.out.println("good morning "+ nom);
                break;
            default:
                System.out.println("has introducido un caracter erroneo");
        }

    }

}