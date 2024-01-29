package funciones.n1;

import javax.swing.*;

public class Ej3 {
    public static void main(String[] args) {
       //Scanner leer= new Scanner(System.in);
        String leer= JOptionPane.showInputDialog("Escribe un numero");
        int n1= Integer.parseInt(leer);

         leer= JOptionPane.showInputDialog("Escribe otro numero");
        int n2= Integer.parseInt(leer);

        System.out.println("El numero mayor es: "+mayor(n1,n2));

    }
    public static int mayor(int n1, int n2){
        return n1 > n2 ? n1 : n2;
    }
}
