package poo.java.arraisObjetos.ej4;

import java.util.Scanner;

public class ArrayDisco {
    private Disco[] discos;

    public ArrayDisco(int num) {

        discos = new Disco[num];
    }

    public void agregarDisco(int codigo, String autor, String titulo, String genero, int duracion) {
        for (int i = 0; i < discos.length; i++) {
            if (discos[i] != null && discos[i].getCodigo() == codigo) {
                System.out.println("Error: Ya existe un disco con el código " + codigo + ".");
                return;
            }
        }
        for (int i = 0; i < discos.length; i++) {
            if (discos[i] == null) {
                discos[i] = new Disco(codigo, autor, titulo, genero, duracion);
                System.out.println("Disco '" + titulo + "' agregado con éxito.");
                System.out.println(toString()); // Puedes imprimir la lista completa después de agregar.
                return;
            }
        }
        System.out.println(" ");
        System.out.println("No hay espacio disponible para agregar más discos.");
        System.out.println(" ");
    }

    public void modificarDisco( int codigo, String autorNuevo, String tituloNuevo, String generoNuevo, int duracionNuevo){
        for (int i=0;i< discos.length; i++){
            if (discos[i]!=null && discos[i].getCodigo()==codigo){
                discos[i].setAutor(autorNuevo);
                discos[i].setTitulo(tituloNuevo);
                discos[i].setGenero(generoNuevo);
                discos[i].setDuracion(duracionNuevo);
                System.out.println("Información del disco con codigo " + codigo + " modificado con éxito.");
                System.out.println(toString());
                return;
            }
        }
        System.out.println(" ");
        System.out.println("No se encontró el disco con código " + codigo + " en la lista.");
        System.out.println(" ");
    }

    public void eliminarDisco(int codigo){
        for (int i = 0; i < discos.length; i++) {
            if (discos[i] != null && discos[i].getCodigo() == codigo) {
                System.out.println("Disco '" + discos[i].getTitulo() + "' eliminado con éxito.");
                discos[i] = null;
                System.out.println(toString());
                return;
            }
        }
        System.out.println(" ");
        System.out.println("No se encontró el disco con codigo" + codigo + " en la lista.");
        System.out.println(" ");
    }


    public void listaDisco() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menú de Listado:");
        System.out.println("1. Listado completo");
        System.out.println("2. Listado por autor");
        System.out.println("3. Listado por género");
        System.out.println("4. Listado por duración en rango");
        System.out.println("5. Volver al menú principal");
        System.out.print("Seleccione una opción: ");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                listadoCompleto();
                break;
            case 2:
                System.out.print("Ingrese el autor: ");
                String autor = scanner.next();
                listadoPorAutor(autor);
                break;
            case 3:
                System.out.print("Ingrese el género: ");
                String genero = scanner.next();
                listadoPorGenero(genero);
                break;
            case 4:
                System.out.print("Ingrese el rango de duración (inicio): ");
                int inicioDuracion = scanner.nextInt();
                System.out.print("Ingrese el rango de duración (fin): ");
                int finDuracion = scanner.nextInt();
                listadoPorDuracionEnRango(inicioDuracion, finDuracion);
                break;
            case 5:
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private void listadoCompleto() {
        for (Disco disco : discos) {
            if (disco != null) {
                System.out.println(disco.toString());
            }
        }
    }

    private void listadoPorAutor(String autor) {
        for (Disco disco : discos) {
            if (disco != null && disco.getAutor().equalsIgnoreCase(autor)) {
                System.out.println(disco.toString());
            }
        }
    }

    private void listadoPorGenero(String genero) {
        for (Disco disco : discos) {
            if (disco != null && disco.getGenero().equalsIgnoreCase(genero)) {
                System.out.println(disco.toString());
            }
        }
    }

    private void listadoPorDuracionEnRango(int inicioDuracion, int finDuracion) {
        for (Disco disco : discos) {
            if (disco != null && disco.getDuracion() >= inicioDuracion && disco.getDuracion() <= finDuracion) {
                System.out.println(disco.toString());
            }
        }
        System.out.println(" ");
        System.out.println("No se encontró ningún disco, por favor agregue un disco");
        System.out.println(" ");
    }

    @Override
    public String toString() {
        String resultado = "Lista de Discos:\n";
        for (Disco disco : discos) {
            if (disco != null) {
                resultado = resultado + disco.toString() + "\n";
            }
        }
        return resultado;
    }

}
