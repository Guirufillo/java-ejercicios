
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner intro= new Scanner(System.in);

        System.out.print("Por favor, introduzca un numero de horas: ");
        int horas= intro.nextInt();

        if(horas <=40){
          int  rs1= horas*12;
            System.out.println("has realizado "+horas+" tu sueldo es de "+rs1);
        }
        else{
           int rs2= (40*12)+((horas-40)*16);
            System.out.println("has realizado "+horas+" tu sueldo es de "+rs2);
        }



    }
}