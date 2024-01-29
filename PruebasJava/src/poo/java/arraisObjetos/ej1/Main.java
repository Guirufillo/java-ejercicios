package poo.java.arraisObjetos.ej1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        Gato[] gato= new Gato[4];
        int i;

        System.out.println("Por favor introduca los datos de los gatos");

        for (i=0;i< 4; i++){
            gato[i]=new Gato();
            System.out.println("Gato nº"+(i+1));
            System.out.print("Nombre: ");
            gato[i].setNombre(leer.next());

            System.out.print("Color: ");
            gato[i].setColor(leer.next());

            System.out.print("Raza: ");
            gato[i].setRaza(leer.next());
        }

        System.out.println("Mostrando los datos de los gatos: ");

        for (i=0;i< 4; i++){
            System.out.println("Gato nº"+(i+1));
            System.out.println("Nombre: "+gato[i].getNombre());
            System.out.println("Color: "+gato[i].getColor());
            System.out.println("Raza: "+gato[i].getRaza());
        }

    }
}
