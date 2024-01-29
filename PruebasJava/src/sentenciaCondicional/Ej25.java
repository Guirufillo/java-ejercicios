package sentenciaCondicional;

import java.util.Scanner;

public class Ej25 {
    public static void main(String [] args ){
        Scanner leer= new Scanner(System.in);

        float num=12.3254F;
        System.out.printf ("El número redondeado es: %.2f",num);
        System.out.println("$");

        System.out.println("Introduzca la altura de la bandera en centimetros: ");
        int cm1= leer.nextInt();

        System.out.println("Introduzca la anchura de la bandera en centimetros: ");
        int cm2= leer.nextInt();

        String n = "n";
        String s = "s";
        String c=null;

        System.out.println("¿queiere escudo bordado? (s/n): ");
        c = leer.next();

        while((!n.equals(c))&&(!s.equals(c))){
            System.out.println("¿por favor introduzca (s/n) para el escudo: ");
            c = leer.next();
        }

        int cm= cm1*cm2;
        float tb= (float) (cm*0.01);
        System.out.printf("Bandera de "+cm+ "cm2: %.2f\n",tb);

        float totalC = 0;



        if(c.equals(s)){
            totalC = 2.50F;
            System.out.println("con escudo 2.50€");
        }
        else  if(c.equals(n)){
            totalC= 0;
            System.out.println("sin escudo 0.00€");
        }

        float gastos= 3.25F;
        System.out.println("gastos de envio"+gastos+"€");

        float totale=totalC+tb+gastos;

        System.out.printf("Total : %.2f",totale);



       /* Scanner s = new Scanner(System.in);
        System.out.print("Introduzca la altura de la bandera en cm: ");
        int altura = Integer.parseInt(s.nextLine());
        System.out.print("Ahora introduzca la anchura: ");
        int anchura = Integer.parseInt(s.nextLine());
        System.out.print("¿Quiere escudo bordado? (s/n): ");
        boolean conEscudo = ((s.nextLine()).toLowerCase()).equals("s");

        String escudoCadena;
        float precioEscudo;

        if (conEscudo) {
            escudoCadena = "Con escudo";
            precioEscudo = 2.50f;
        } else {
            escudoCadena = "Sin escudo";
            precioEscudo = 0;
        }

        System.out.println("Gracias. Aquí tiene el desglose de su compra.");
        System.out.printf("Bandera de %5d cm2: %5.2f €\n", anchura * altura, (float)anchura * altura / 100);
        System.out.printf("%s:           %5.2f €\n", escudoCadena, precioEscudo);
        System.out.printf("Gastos de envío:      %5.2f €\n", 3.25);
        System.out.printf("Total:                %5.2f €\n", (float)anchura * altura / 100 + precioEscudo + 3.25);*/
    }
}
