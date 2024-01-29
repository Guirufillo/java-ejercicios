package poo.java.ObjetosSimples.ej5;

public class Main {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("margarita", "mediana");
        Pizza p2 = new Pizza("funghi", "familiar");
        Pizza p3 = new Pizza("cuatro quesos", "mediana");

        System.out.println("---------------------------------");
        System.out.print(p1+"\n");

        System.out.println("---------------------------------");
        System.out.print("\n"+p2);
        p2.sirve();
        p2.sirve();
        System.out.println("---------------------------------");
        System.out.print(p3+"\n");

        System.out.println("---------------------------------");

        p2.sirve();

        System.out.println("pedidas: " + Pizza.getTotalPedidas());
        System.out.println("servidas: " + Pizza.getTotalServidas());
    }
}

