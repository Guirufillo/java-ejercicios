package funciones.n1;

import javax.swing.*;

public class Ej4_Operador_ternario {
    public static void main(String[] args) {
        String leer= JOptionPane.showInputDialog("Escribe un numero");
        int n1= Integer.parseInt(leer);

        leer= JOptionPane.showInputDialog("Escribe otro numero");
        int n2= Integer.parseInt(leer);

        leer= JOptionPane.showInputDialog("Escribe otro numero");
        int n3= Integer.parseInt(leer);

        leer= JOptionPane.showInputDialog("Escribe otro numero");
        int n4= Integer.parseInt(leer);

        System.out.println("El numero mayor es: "+mayor(n1,n2, n3, n4));

    }
    public static int mayor(int n1, int n2, int n3, int n4){
        int m=0;
        if((n1>n2)&&(n1>n3)&&(n1>n4)){
            m=n1;
        } else if((n2>n1)&&(n2>n3)&&(n2>n4)){
            m=n2;
        } else if((n3>n2)&&(n3>n1)&&(n3>n4)){
            m=n3;
        }else if((n4>n2)&&(n4>n3)&&(n4>n1)){
            m=n4;
        }
        return m;

        /*ºa
                int m1 = n1 > n2 ? n1 : n2;
                int m2 = n3 > n4 ? n3 : n4;
                int m3 = m1 > m2 ? m1 : m2;

            return m3;
         */
    }
}
