package aleatorios;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {

        Scanner leer= new Scanner(System.in);

        int numMayor=0;
        int numMenor=0;
        int cont=5;

        for (int i=1; i<=5; i++){
            System.out.print("Introduce un numero y adivina el numero (entre 0 y 10): ");
            int n= leer.nextInt();

            int ale= (int)(Math.random()*10+1);
            if (n==ale){
                System.out.println("Has ganado!!!");
                break;
            }else {
            cont--;
            System.out.println("Sigue jugando, te quedan "+cont+" oportunidades\n");
            }
        }
    }
}
