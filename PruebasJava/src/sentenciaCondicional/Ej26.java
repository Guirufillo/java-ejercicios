package sentenciaCondicional;

import java.util.Scanner;

public class Ej26 {
    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);

        System.out.println("Venta de entradas CineCampa");

        System.out.print("\nNumero de entradas: ");
        int entr= leer.nextInt();

        System.out.print("Dia de la semana: ");
        String dia= leer.next();

        System.out.print(" \n¿Tienes tarjeta CineCampa? (s/n) ");
        String tarj= leer.next();
        System.out.println("-----------------------------------------");

        double precioentr=entr*8;
        double precioEsp= entr*5;
        double precioentrpar= entr*11;
        double precioInd=8;
        double precioTotal=0;

        System.out.println("Aquí tiene sus entradas. Gracias por su compra");
        System.out.println("Numero de entradas: "+entr);
        switch (dia){
            case "lunes":

            case "martes":

            case "viernes":
                precioTotal=precioentr;
                System.out.println("precio de la entrada individual: "+precioentr);
                break;

            case "miercoles":
                precioTotal=precioEsp;
                System.out.println("precio de la entrada individual: "+precioEsp);
                break;

            case "jueves":
                if(entr % 2==0){
                    precioTotal=precioentrpar;
                    System.out.println("precio de la entrada pareja: "+precioentrpar);
                }
                else{

                    int entrPar = entr-1;
                    precioentrpar = entrPar*11;
                    precioTotal = precioentrpar+precioInd;
                    System.out.println("precio de la entrada pareja: "+precioentrpar);
                    System.out.println("precio de la entrada individual: "+precioInd);
                }
                break;

            default:
                System.out.println(" ");
        }
        System.out.println("total: "+precioTotal);
        double precioDes= precioTotal/100*10;

        if(tarj.equals("s")){
            System.out.println("descuento: "+precioDes);
        }
        else{
            precioDes=0;
        System.out.println("descuento: "+precioDes);

        }
        System.out.println("A pagar: "+(precioTotal - precioDes));
    }
}
