package arrays;

public class Ej12 {
    public static void main(String[] args) {

        int[] num =new int[10];
        int i;

        System.out.println("array original");
        for (i=0;i<10;i++){
            num[i]=(int)(Math.random()*11);

            System.out.print(num[i]+"|");
        }
        System.out.println();
        System.out.println("array mod");

        int aux = num[9];
        int aux1=num[3];

        for (i = 9; i > 0; i--) {
            num[i] = num[i-1];
        }
        num[0] = aux;
        num[7] = aux1;




        for (i=0;i<10;i++){
            System.out.print(num[i]+"|");}
        
    }
}
