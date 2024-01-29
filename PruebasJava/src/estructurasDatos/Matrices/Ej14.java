package estructurasDatos.Matrices;

import estructurasDatos.Main;

public class Ej14 {
    public static void ejecutarEj14(){
        char letra[]= new char[5];
        char l;

        for (int i=0; i< letra.length; i++){
            System.out.print("Introduce letra: ");
            l= Main.leer.next().charAt(0);
            letra[i]=l;
        }
        System.out.println("************************\n");
        for (char ch:letra) {
            if (ch %2 ==0){
                System.out.println(ch+" es par");
            }else {
            System.out.println(ch+" es impar");}
        }
        System.out.println("\n************************");
    }
}
