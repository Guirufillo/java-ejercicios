package aleatorios;

public class Ej3 {
    public static void main(String[] args) {

        System.out.println("Juego de cartas españolas\n");

        String carta="";
        String palo="";

        int numCarta= (int)(Math.random()*10)+1;
        switch (numCarta){
            case 1:
                carta="AS";
                break;
            case 8:
                carta="Sota";
                break;
            case 9:
                carta= "Caballo";
                break;
            case 10:
                carta= "Rey";
                break;
            default:
                carta = String.valueOf(numCarta);
        }
            int numPalo=(int) (Math.random()*4)+1;
        switch (numPalo){
            case 1:
                palo="Oros";
                break;
            case 2:
                palo="Copas";
                break;
            case 3:
                palo="bastos";
                break;
            case 4:
                palo="Espadas";
                break;
        }
        System.out.println(carta + " de "+palo);
    }
}
