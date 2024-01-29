package bucles;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);

        int i=0;
        int num=0;
        int suma=num;

        while(num>=0){
            System.out.print("Introduce numeros y te dire la media, para obtener el resultado has de introducir un numero negativo, (ejem -1): ");
            num= leer.nextInt();
            i++;
            suma+=num;
        }

        suma= suma-num;
        i=i-1;
        int media= suma/i;

        System.out.println("la media es "+media);
    }
}
