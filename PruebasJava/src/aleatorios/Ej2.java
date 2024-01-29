package aleatorios;

public class Ej2 {
    public static void main(String[] args) {
        System.out.println("Juego de cartas de poker\n");

        String palo="";
        String carta="";

        int numPalo= (int)(Math.random()*4)+1;
        switch (numPalo){
            case 1:
                palo="Picas";
                break;
            case 2:
                palo="Corazones";
                break;
            case 3:
                palo="Diamantes";
                break;
            case 4:
                palo="Treboles";
                break;
        }

        int numCarta= (int)(Math.random()*13)+1;
        switch (numCarta){
            case 1:
                carta="AS";
                break;
            case 11:
                carta="J";
                break;
            case 12:
                carta="Q";
                break;
            case 13:
                carta="K";
                break;
            default:
                carta=String.valueOf(numCarta);
        }

        System.out.println(carta+" de "+palo);
    }
}
