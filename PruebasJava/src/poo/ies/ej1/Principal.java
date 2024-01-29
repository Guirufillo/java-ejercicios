package poo.ies.ej1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);

        Coche coche=new Coche();
        Coche cochele=new Coche("peugeot", "rojo");

        System.out.println("introduce modelo: ");
        coche.setModelo(leer.next());
        System.out.println("Introduce color: ");
        coche.setColor(leer.next());
        coche.setTipo(Tipo.DEPORTIVO);
        coche.setSeguro(Coche.Seguro.TERCEROS);


        cochele.imprimirCoche();
        coche.imprimirCoche();
        System.out.println(coche.getTipo()+" "+coche.getSeguro());

    }
}
