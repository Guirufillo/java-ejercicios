package aleatorios;

public class Ej12 {
    public static void main(String[] args) throws InterruptedException {



        for (int i=0; i<5;i++){

            for (int z=0; z<140;z++){

               int  num=(int)(Math.random()*(126-32+1)+32);
                char matrix= (char) num;
                System.out.print("\033[32m"+matrix);
            }
            Thread.sleep(250);
            System.out.println(" ");
        }
    }
}
