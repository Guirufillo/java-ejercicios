package bucles;

import java.util.Scanner;

public class Ej7 {

    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);

        int nSecreto=1234;
        int num=0;
        boolean acierto=false;

        for (int i=3; (i>=0); i--){
            System.out.print("\nEscriba la combinacion secreta para abrir la caja fuerte: ");
             num=leer.nextInt();

           if(nSecreto==num) {
               System.out.println("la caja se abrio satisfatoriamente");
               acierto=true;
           break;
           }
            if(i>1){
            System.out.print("Lo siento, esa no es la convinacion, puede repetir: "+(i)+" veces mas");}
            else if (i==1){
                System.out.print("Lo siento, esa no es la convinacion, esta es la ultima oportunidad: ");
            }
        }

        if(acierto==true){

        }else{
            System.out.print(" ha agotado las 4 oportunidades.");}
    }
}
