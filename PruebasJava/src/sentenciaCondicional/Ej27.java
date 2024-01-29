package sentenciaCondicional;

import java.util.Scanner;

public class Ej27 {

    public static void main(String [] args){
        Scanner leer= new Scanner(System.in);

        System.out.println("Elija un sabor (manzana, fresa, chocolate): ");
        String sabor= leer.next();

        System.out.println("¿quiere nata? (si/no): ");
        String nata= leer.next();

        System.out.println("¿Quieere ponerle un nombre? (si/no): ");
        String nombre= leer.next();


        double saborManzana=18;
        double saborFresa= 16;
        double chocoNegro= 14;
        double chocoBlanco=15;
        double añadirNata= 2.50;
        double escriNombre= 2.75;
        double sabores=0;
        String tipoChoco = null;

        switch (sabor){
            case "manzana":
               sabores = saborManzana;
                break;
            case "fresa":
                sabores = saborFresa;
                break;
            case "chocolate":
                System.out.println("¿Que tipo de chocolate quiere? (negro o blanco)");
               tipoChoco= leer.next();

                if(tipoChoco.equals("blanco")){
                sabores = chocoBlanco;

                } else if (tipoChoco.equals("negro")) {
                    sabores = chocoNegro;
                }
                break;
        }

        System.out.print("Tarta de "+sabor);
        if (sabor.equals("chocolate")) {
            System.out.print(" " + tipoChoco);
        }
        System.out.println(": "+sabores+"€");

        if (nata.equals("si")){
            System.out.println("Con nata: "+añadirNata);
        } else if (nata.equals("no")) {
            añadirNata=0;
        }
        if (nombre.equals("si")) {
            System.out.println("Con nombre: "+escriNombre);
        } else if (nombre.equals("no")) {
            escriNombre=0;
        }
        double total= añadirNata+escriNombre+sabores;
        System.out.println("Total: "+total);
    }
}
