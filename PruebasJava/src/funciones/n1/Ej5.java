package funciones.n1;

import javax.swing.*;

import static java.lang.Character.*;

public class Ej5 {
    public static void main(String[] args) {
        String leer=" ";
        String num;

        leer= JOptionPane.showInputDialog("Escribe una letra");

        num= JOptionPane.showInputDialog("Escribe un numero de repeteticiones");
        int n= Integer.parseInt(num);

        repe(leer, Integer.parseInt(num));

    }
    public static void repe(String letra, int num) {

        for (int i = 0; i < num; i++) {
            System.out.print(letra);
        }

    }

}
