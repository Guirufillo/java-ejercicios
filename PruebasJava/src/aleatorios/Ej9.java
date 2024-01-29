package aleatorios;

public class Ej9 {
    public static void main(String []args){

        int num=0;
        int cont=0;

        while( num!=24){
         num= (int) (Math.random() * 20)*2;
            System.out.println(num);
            cont ++;
        }
        System.out.println("Se ha producido "+cont+" veces");
    }
}
