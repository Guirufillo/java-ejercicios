package sentenciaCondicional;

import java.util.Scanner;

public class Ej28 {
    public static void main(String[] args){

        Scanner leer=new Scanner(System.in);

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        String j1= leer.next();

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
        String j2= leer.next();

        String emp = "empate";
        String p1 ="Gana el jugador 1";
        String p2 = "Gana el jugador 2";
        String ganador = null;

        if(j1.equals("piedra")&&(j2.equals("piedra"))){
            ganador = emp;
        }
        if(j1.equals("papel")&&(j2.equals("papel"))) {
            ganador = emp;
        }
        if(j1.equals("tijera")&&(j2.equals("tijera"))) {
            ganador = emp;
        }

        if(j1.equals("papel")&&(j2.equals("piedra"))){
            ganador=p1;
        }
        else if(j2.equals("papel")&&(j1.equals("piedra"))){
            ganador=p2;
        }
        if(j1.equals("piedra")&&(j2.equals("tijera"))){
            ganador=p1;
        }
        else if(j2.equals("piedra")&&(j1.equals("tijera"))){
            ganador=p2;
        }
        if(j1.equals("tijera")&&(j2.equals("papel"))){
            ganador=p1;
        }
        else if(j2.equals("tijera")&&(j1.equals("papel"))){
            ganador=p2;
        }
        System.out.println(ganador);
    }
}
