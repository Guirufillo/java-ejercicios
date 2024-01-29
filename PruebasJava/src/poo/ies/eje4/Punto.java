package poo.ies.eje4;

public class Punto {

    private double x;
    private double y;

    // Constructor con dos parámetros
    public Punto(){
        this.x = 0.0;
        this.y = 0.0;
    }
    public Punto(double x, double y){
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calcularDistancia(Punto p){
        double distanciaX = this.x - p.getX();
        double distanciaY = this.y - p.getY();
        return distanciaX * distanciaX + distanciaY * distanciaY;
    }
    public void visualizarPunto() {
        System.out.println("(" + x + ", " + y + ")");
    }
}
