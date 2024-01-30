package poo.ies.ej4;

public class Principal {
    public static void main(String[] args) {
        // Crear objetos Punto
        Punto punto1 = new Punto(2.0, 6.2);
        Punto punto2 = new Punto(-1.5, 3.8);
        Punto punto3 = new Punto();

        // Mostrar puntos por pantalla
        System.out.println("Punto 1:");
        punto1.visualizarPunto();

        System.out.println("\nPunto 2:");
        punto2.visualizarPunto();

        System.out.println("\nPunto 3:");
        punto3.visualizarPunto();

        // Calcular distancia entre puntos
        double distanciaEntrePuntos = punto1.calcularDistancia(punto2);
        System.out.println("\nDistancia entre Punto 1 y Punto 2: " + distanciaEntrePuntos);
    }
}

