package poo.java.arraisObjetos.ej2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        Gato[] gato= new Gato[4];
        int i;

        gato[0] = new Gato("Garfield", "naranja", "mestizo");
        gato[1] = new Gato("Pepe", "gris", "angora");
        gato[2] = new Gato("Mauri", "blanco", "manx");
        gato[3] = new Gato("Ulises", "marrón", "persa");

        System.out.println("Mostrando los datos de los gatos: ");

        for (i=0;i< 4; i++){
            System.out.println("Gato nº"+(i+1));
            System.out.println("Nombre: "+gato[i].getNombre());
            System.out.println("Color: "+gato[i].getColor());
            System.out.println("Raza: "+gato[i].getRaza());
        }

    }
}
