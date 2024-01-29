package aleatorios;

public class Ej4 {
    public static void main(String[] args) {

        int num= 0;

        for (int i=0; i<=20; i++){
            num= (int)(Math.random()*11);
            System.out.print(num+", ");
        }

    }
}
