package funciones;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String binario=null;
        System.out.print("Que numero quieres que te pase a binario: ");
        int num= leer.nextInt();

         binario = binario(num);

        System.out.println("El numero "+num+ " en binario es "+binario);
    }

    public static String binario (int n) {

        String binario ="";
        String digito = null;

        for (int i=n; i>0; i/=2){
            if(i%2==0){
                digito="0";
            }else {
                digito="1";
            }
            binario= digito + binario; // concatenamos
        }
       return binario;

        /*
        StringBuilder binario = new StringBuilder();
        String digito = null;

        for (int i=n; i>0; i/=2){
            if(i%2==0){
                digito="0";
            }else {
                digito="1";
            }
            binario.insert(0, digito);
        }
       return binario.toString();
 */
    }
}

