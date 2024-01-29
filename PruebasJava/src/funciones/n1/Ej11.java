package funciones.n1;

public class Ej11 {
    public static void main(String[] args) {

        for (int i=1;i<=15;i++){
            System.out.printf("Partido %02d",i);
            System.out.println(" = "+equipo());
        }

    }
    public static int resultado(){
        int futbol;
        futbol = (int) (Math.random()*(3-1+1)+1);
        return futbol;
    }
    public static String equipo(){
        int resul;
        String total=" ";

        resul = resultado();
        int e1 = resul;

        resul = resultado();
        int e2 = resul;

        if (e1==e2){
            total="\u001B[31mx\u001B[0m";
        }
        if (e1>e2){
            total="\u001B[34m1\u001B[0m";
        }
        if (e2>e1){
            total="\u001B[32m2\u001B[0m";
        }
            return total;

        }



}
