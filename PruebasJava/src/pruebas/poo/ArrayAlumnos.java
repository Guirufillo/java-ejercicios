package pruebas.poo;

public class ArrayAlumnos {
    private Alumno[] alumnos;

    public ArrayAlumnos(int n) {
        // Inicializar el array con la longitud proporcionada
        alumnos = new Alumno[n];
    }

    // Constructor para agregar un nuevo alumno al array
    public void agregarAlumno(int id, String nombre, String asignatura) {
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] == null) {
                alumnos[i] = new Alumno(id, nombre, asignatura);
                System.out.println("Alumno '" + nombre + "' agregado con éxito.");
                return;
            }
        }
        System.out.println("No hay espacio disponible para agregar más alumnos.");
    }

    // Constructor para eliminar un alumno del array
    public void eliminarAlumno(int id) {
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null && alumnos[i].getId() == id) {
                System.out.println("Alumno '" + alumnos[i].getNombre() + "' eliminado con éxito.");
                alumnos[i] = null;
                return;
            }
        }
        System.out.println("No se encontró al alumno con ID " + id + " en la lista.");
    }

    // Constructor para mostrar la lista de alumnos
    public void listarAlumnos() {
        System.out.println("Lista de Alumnos:");
        for (Alumno alumno : alumnos) {
            if (alumno != null) {
                System.out.println("ID: " + alumno.getId() + ", Nombre: '" + alumno.getNombre() + "', Asignatura: '" + alumno.getAsignatura() + "'");
            }
        }
    }

    public void modificarAlumno(int id, String nuevoNombre, String nuevaAsignatura) {
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null && alumnos[i].getId() == id) {
                alumnos[i].setNombre(nuevoNombre);
                alumnos[i].setAsignatura(nuevaAsignatura);
                System.out.println("Información del alumno con ID " + id + " modificada con éxito.");
                return;
            }
        }
        System.out.println("No se encontró al alumno con ID " + id + " en la lista.");
    }
}
