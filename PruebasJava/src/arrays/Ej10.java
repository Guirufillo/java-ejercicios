package arrays;

public class Ej10 {
    public static void main(String[] args) {
        int[]num= new int[20];
        int i;
        System.out.println("array original");
        for (i=0;i<20;i++) {
            num[i] = (int) (Math.random() * 101);
            System.out.print(num[i]+" ");
        }
        System.out.println();

        System.out.println("array mod");
        for ( i=0; i<20;i++) {
            if (num[i] % 2 == 0) {
                System.out.print(num[i]+" ");
            }
        }
            for ( i=0; i<20;i++) {
                if (num[i] % 2 == 1) {
                    System.out.print(num[i]+" ");
                }
            }
    }
}
