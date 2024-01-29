package aleatorios;

public class EJ5 {
    public static void main(String[] args) {

        int num= 0;
        int numVueltas=5;
        int miniMax=199;
        int maxMini=100;
        int suma=0;

        for (int i=0; i<=numVueltas; i++){
            num= (int)(Math.random()*(199-100+1)+100);
            System.out.print(num+", ");

          suma+=num;

            if(num>maxMini){
                maxMini=num;
            }
            if (num<miniMax) {
                miniMax=num;
            }
        }
        System.out.println(" ");
       int total=suma/numVueltas;

        System.out.println("el max es: "+maxMini);
        System.out.println("El minimo es: "+miniMax);
        System.out.println("La media es: "+total);
    }
}
