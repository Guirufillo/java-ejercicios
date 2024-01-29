package poo.java.ObjetosSimples.ej7;

public class Zona {
    private int entradasVenta;

    public Zona(int n){
        this.entradasVenta = n;
    }

    public int getEntradasVenta(){
        return entradasVenta;
    }
    public void vender(int n) {
        if (this.entradasVenta == 0) {
            System.out.println("Lo siento, las entradas para esa zona están agotadas.");
        } else if (this.entradasVenta < n) {
            System.out.println("Sólo me quedan " + this.entradasVenta + " entradas para esa zona.");
        }
        if (this.entradasVenta >= n) {
            entradasVenta = entradasVenta - n;
            System.out.println("Aquí tiene sus " + n + " entradas, gracias.");
        }
    }
}
