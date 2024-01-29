package sentenciaCondicional;

import java.util.Scanner;

public class Ej29 {
    public static void main(String[] args){

        Scanner leer= new Scanner(System.in);

        System.out.print("¿Que ha tomado de comer? (palmera, donut o pitufo): ");
        String comer= leer.next();

        double palmera = 1.40;
        double donut = 1;
        double zumo= 1.50;
        double cafe= 1.20;
        double pAceite= 1.20;
        double pTortilla= 1.60;
        double comida=0;
        double bebida=0;

        switch (comer){
            case "palmera" :
                comida = palmera;
                break;
            case "donut" :
                comida= donut;
                break;
            case "pitufo" :
                System.out.println("¿Con qué se ha tomado el pitufo? (aceite o tortilla): ");
                String pitu= leer.next();
                if (pitu.equals("aceite")){
                    comida=pAceite;
                } else if (pitu.equals("tortilla")) {
                    comida=pTortilla;
                }
                break;
            default:
        }

        System.out.println("¿Qué ha tomado de beber? (zumo o café): ");
        String beber= leer.next();

        if (beber.equals("zumo")){
            bebida=zumo;
        } else if (beber.equals("cafe")) {
            bebida=cafe;
        }

        System.out.printf(comer+": %.2f €\n",comida);
        System.out.printf(beber+": %.2f €\n",bebida);
        System.out.printf("total: %.2f €",(comida+bebida));
    }

}
