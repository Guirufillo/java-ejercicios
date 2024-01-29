package funciones.n1;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);

        System.out.print("Inserte n1: ");
        int n1= leer.nextInt();
        System.out.print("Inserte n2: ");
        int n2= leer.nextInt();
        System.out.print("Inserte n3: ");
        int n3= leer.nextInt();
        System.out.print("Inserte n4; ");
        int n4= leer.nextInt();

        capicua(n1,n2,n3,n4);
    }
    public static boolean capicua(int n1, int n2, int n3, int n4){
        boolean capcua=false;
        if (n1==n4 && n2==n3){
            capcua=true;
            System.out.println("es capicua");
        }
        else{
            System.out.println("no es capicua");
        }
        return capcua;
    }
}
/*
int num,inv,aux,digito;
        num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        inv=0;
        aux=num;
        while (aux>0){
            digito=aux%10;
            inv=inv*10+digito;
            aux=aux/10;
        }
        if (num==inv) {
            JOptionPane.showMessageDialog(null, "El numero es capicua");
        }
        else {
            JOptionPane.showMessageDialog(null, "El numero no es capicua");
        }
 */