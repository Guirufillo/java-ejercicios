package aleatorios;

public class Ej1 {
    public static void main(String[] args) {

        System.out.println("lanza 3 dados y sumare la suma de ellos\n");

        int dados=0;
        int suma=0;

        for(int i =1; i<=3; i++){
            dados=(int)(Math.random()*6)+1;
            System.out.println("dado "+ i+ ": "+dados );
            suma+=dados;
        }

        System.out.println("\nla suma del los dados son "+suma+" puntos");
    }
}
