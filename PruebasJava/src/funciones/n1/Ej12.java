package funciones.n1;

public class Ej12 {

    public static void main(String[] args) {
        int nota;


        for (int i=0; i<10;i++){
            nota = notas(0,10);
                System.out.println(calificacion(nota));
        }
    }
    public static int notas(int min, int max){
        int calificaciones= (int)(Math.random()*(max-min+1)+min);
        return calificaciones;
    }

    public static String calificacion(int n){

        String nota=null;
        if (n>=0 && n <5){
            nota="Insuficiente";
        }
        else if (n>=5 && n <6) {
            nota = "Suficiente";
        }
        else if (n>=6 && n <7) {
            nota = "Bien";
        }
        else if (n>=7 && n <9) {
            nota = "Notable";
        }
        else if (n>=9) {
            nota = "Excelente";
        }

        return nota;
    }
}
