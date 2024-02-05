package poo.ies.ej7;

public class MainCentroSalud {
    public static void main(String[] args) {
        CentroSalud centroSalud = new CentroSalud();

        // Método para registrar pacientes de manera pseudo-aleatoria (simulado)
        registrarPacientesAleatorios(centroSalud);

        // Ejemplo de uso del programa

        centroSalud.nuevoPaciente( "123456", "Juan Perez", "M", 35, "Dolor de cabeza");
        centroSalud.darAlta("123456", "Recuperación completa");
    }

    private static void registrarPacientesAleatorios(CentroSalud centroSalud) {
        String[] nombres = {"Sonia Moran", "Juan Soler", "Pedro Ferrer", "Sergio Signes", "Ana Peralta", "María Piera"};
        String[] sips = {"94964183", "37109682", "52046314", "92367866", "79058213", "25152798"};
        String[] sexos = {"M", "V", "V", "V", "M", "M"};
        int[] edades = {20, 38, 81, 45, 21, 25};
    }
}


