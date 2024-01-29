package arrays;

public class Ej2 {
    public static void main(String[] args) {

        char[] c= new char[10];
        c[0]='a';
        c[1]='x';
        c[4]='@';
        c[6]=' ';
        c[7]='+';
        c[8]='Q';

        for (int i=0; i<10;i++){
            System.out.println("c["+i+"]="+c[i]);
        }
    }
}
