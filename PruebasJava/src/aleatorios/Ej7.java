package aleatorios;

public class Ej7 {
    public static void main(String[] args) {
        //int columnas=3;

        for (int i=1; i<=15; i++){
            if ((i >= 1) && (i <= 9)) {
                System.out.print(" ");
            }
            System.out.print(i+". |");

            /*if(i==15){columnas=1;}*/

            for(int z =1; z<=3 /*columnas*/; z++){
               int quiniela = (int) (Math.random() * 3 + 1);
                switch (quiniela) {
                    case 1:
                        System.out.print("1  |");
                        break;
                    case 2:
                        System.out.print(" x |");
                        break;
                    case 3:
                        System.out.print("  2|");
                        break;
                }
            }
            System.out.println();
        }
    }
}
