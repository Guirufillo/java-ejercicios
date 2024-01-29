package arrays;

public class Ej6 {
    public static void main(String[] args) {

        int[] num =new int[5];
        int i;

        System.out.println("array original");
        for (i=0;i<5;i++){
            num[i]=(int)(Math.random()*5);
            System.out.print(num[i]+"|");
        }
        System.out.println();
        System.out.println("array mod");

        int aux = num[4];
        for (i = 4; i > 0; i--) {
            num[i] = num[i-1];
        }
        num[0] = aux;

        for (i=0;i<5;i++){
        System.out.print(num[i]+"|");}
    }
}
