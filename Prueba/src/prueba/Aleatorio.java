package prueba;

import java.util.Random;

public class Aleatorio {
    public static void main(String[] args) {

        Random aleatorio= new Random();
        int random = 15 + aleatorio.nextInt(20-15);
        System.out.println("random = " + random);;

        int numAleatorio=(int)(Math.random()*(6-3+1)+3);
        System.out.println("numAleatorio = " + numAleatorio);
    }
}
