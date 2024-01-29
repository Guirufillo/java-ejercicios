package poo.java.ObjetosSimples.ej2;

public class Vehiculo {

    private static int KilometrosTotales=0;
    private int KilometrosRecorridos;

    public Vehiculo(){

        this.KilometrosRecorridos=0;
    }

    public static int getKilometrosTotales() {
        return KilometrosTotales;
    }

    public int getKilometrosRecorridos() {

        return KilometrosRecorridos;
    }

    public void recorre(int k){
        this.KilometrosRecorridos +=k;
        Vehiculo.KilometrosTotales +=k;
    }
}
