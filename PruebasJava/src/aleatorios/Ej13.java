package aleatorios;

public class Ej13 {
    public static void main(String[] args) {

        int dado1=0;
        int dado2=0;
        int cont=0;
        int total=0;

        do {
            dado1 = (int) (Math.random() * 6 + 1);
            dado2 = (int) (Math.random() * 6 + 1);
            cont++;


        }while (dado1 != dado2 );

        total+=cont;
        System.out.println("los dado han sido lanzados "+total+"para que coincidan");
        System.out.println("\033[32m resultado "+dado1+"=="+dado2);



    }
}
