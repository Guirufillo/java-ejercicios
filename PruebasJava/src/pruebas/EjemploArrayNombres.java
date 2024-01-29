package pruebas;

public class EjemploArrayNombres {

    private String[] nombres;

    public EjemploArrayNombres(int n) {
        // Inicializar el array con la longitud proporcionada
        nombres = new String[n];
    }

    // Constructor para agregar un nuevo nombre al array
    public void agregarNombre(String nuevoNombre) {
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i] == null) {
                nombres[i] = nuevoNombre;
                System.out.println("Nombre '" + nuevoNombre + "' agregado con éxito.");
                return;
            }
        }
        System.out.println("No hay espacio disponible para agregar más nombres.");
    }

    // Constructor para eliminar un nombre del array
    public void eliminarNombre(String nombre) {
        for (int i = 0; i < nombres.length; i++) {
            if (nombre.equals(nombres[i])) {
                nombres[i] = null;
                System.out.println("Nombre '" + nombre + "' eliminado con éxito.");
                return;
            }
        }
        System.out.println("El nombre '" + nombre + "' no se encontró en la lista.");
    }

    // Constructor para mostrar la lista de nombres
    public void listarNombres() {
        System.out.print("Nombres: ");
        for (String nombre : nombres) {
            if (nombre != null) {
                System.out.print("'" + nombre + "' ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 2;  // Puedes ajustar la cantidad de nombres según tus necesidades
        EjemploArrayNombres ejemploArray = new EjemploArrayNombres(n);

        // Ejemplo de uso
        ejemploArray.agregarNombre("Maria");
        ejemploArray.agregarNombre("Juan");
        ejemploArray.listarNombres();

        ejemploArray.eliminarNombre("Juan");
        ejemploArray.listarNombres();
    }
}
