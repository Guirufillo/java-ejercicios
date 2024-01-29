package poo.java.ObjetosSimples.ej1;

public class mainCaballo {
    public static void main(String[] args) {

        Caballo a= new Caballo("lanos", "rojo", 5,12);
        Caballo b= new Caballo("lykos", "negro", 6, 15);

        System.out.println("Hola me llamo "+ a.getNombre());
        a.cabalga();
        a.relincha();

        System.out.println("Hola, yo soy "+ b.getNombre());
        b.rumia();
        b.cabalga();
    }
}
