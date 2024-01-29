package funciones;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        System.out.println("Introduce la moneda a cambiar por euros:  dolar, libra, yenes");
        String moneda= leer.next();

        System.out.println("Introduce una cantidad ");
        double cant= leer.nextDouble();

        cambio(cant,moneda);
    }
    public static void cambio (double c, String m){

        String mone=m;
        double cant=c;
        double libra= 0.86;
        double dolar= 1.28611;
        double yenes= 129.856;
        double total=0;

        if (mone.equals("libra") ){
            total=libra * cant;
            System.out.printf("%.2f",total);
        }
        if (mone.equals("dolar") ){
            total=dolar * cant;
            System.out.printf("%.2f",total);
        }
        if (mone.equals("yenes") ){
            total=yenes * cant;
            System.out.printf("%.2f",total);
        }
    }
}
