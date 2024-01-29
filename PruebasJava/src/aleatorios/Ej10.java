package aleatorios;

public class Ej10 {
    public static void main(String[] args) {

        String caracter= " ";

        for (int i=1; i<=10; i++){
            int caso= (int)(Math.random() * 6);

            switch (caso){
                case 0:
                    caracter = "*";
                    break;
                case 1:
                    caracter = "-";
                    break;
                case 2:
                    caracter = "=";
                    break;
                case 3:
                    caracter = "|";
                    break;
                case 4:
                    caracter = ".";
                    break;
                case 5:
                    caracter = "@";
                    break;
            }
            int rep= (int)(Math.random() * 15);
            for ( int z=0; z<rep; z++){

            System.out.print(caracter);}
            System.out.println(" ");
        }

    }
}
