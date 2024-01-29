package poo.ies.ej3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static poo.ies.ej3.Alumno.calcularEdad;

public class MainCiclo {

    public static void main(String[] args){
        Scanner leer= new Scanner(System.in);
        int nia = 0;
        String nombre;
        String apellido = null;
        String fecha;
        String grupo;
        int telefono;

        int indiceAlumnos = 0; //Contador
        final int MAX_ALUMNOS = 10;

        int opcion;
        int opcionC;

        Alumno[] alumnos = new Alumno[MAX_ALUMNOS];

        // Llamada al método para registrar 5 alumnos con datos pseudo-aleatorios
        registrarAlumnosAleatorios(alumnos, 5);
        imprimirTabla(alumnos);


do {
    System.out.println("** GESTIÓN ALUMNOS **\n" +
            "*********************");

    System.out.println("1. Nuevo alumno …\n" +
            "2. Baja de alumno …\n" +
            "3. Consultas …\n" +
            "------------------------------\n" +
            "0. Salir");
    opcion = leer.nextInt();

    switch (opcion) {
        case 1:
            boolean niaDuplicado = false;
            System.out.print("Introduce el nia del alumno: ");
            nia = leer.nextInt();

            for (int i = 0; i < alumnos.length; i++) {
                if (alumnos[i] != null && alumnos[i].getNia() == nia) {
                    System.out.println("Error: Ya existe un Alumno con ese NIA");
                    niaDuplicado = true;
                    break;  // Salir del bucle
                }
            }
            if (niaDuplicado == true) {
                break;  // Salir del switch
            }

            System.out.print("introduce el nombre del alumno: ");
            nombre = leer.next();
            System.out.print("introduce el apellido del alumno: ");
            apellido = leer.next();
            System.out.print("Introduce la fecha de nacimiento:");
            fecha = leer.next();
            System.out.print("Introduce un grupo :");
            grupo = leer.next();
            System.out.print("Introduce el tlf del alumno. ");
            telefono = leer.nextInt();

            if (indiceAlumnos < MAX_ALUMNOS) {
                alumnos[indiceAlumnos] = new Alumno(nia, nombre, apellido, fecha, grupo, telefono);
                indiceAlumnos++;
                imprimirTabla(alumnos);

            } else {
                System.out.println("Error: No hay espacio disponible para agregar más alumnos.");
            }
            break;
        case 2:
            System.out.print("Ingrese el nia de baja: ");
            nia = leer.nextInt();
            for (int i = 0; i < alumnos.length; i++) {
                if (alumnos[i] != null && alumnos[i].getNia() == nia) {
                    alumnos[i] = null;
                    indiceAlumnos--;
                    System.out.println("Alumno eliminado.");
                    imprimirTabla(alumnos);
                }
            }
            break;
        case 3:
            System.out.println("***************\n" +
                    "** CONSULTAS **\n" +
                    "***************\n" +
                    "1. Por grupo …\n" +
                    "2. Por edad ...\n" +
                    "3. Por nia ...\n" +
                    "4. Por apellidos ...\n"+
                    "--------------------\n" +
                    "0. Volver al menú principal");
            opcionC = leer.nextInt();

            switch (opcionC) {
                case 1:
                    System.out.print("Ingrese un grupo: ");
                    grupo = leer.next();
                    for (int i = 0; i < alumnos.length; i++) {
                        if (alumnos[i] != null && alumnos[i].getGrupo().equals(grupo)) {
                        }
                    }
                    imprimirTabla(alumnos);;
                    break;

                case 2:
                    System.out.print("Ingrese una edad: ");
                    int edad = leer.nextInt();
                    for (int i = 0; i < indiceAlumnos; i++) {
                        if (alumnos[i] != null && alumnos[i].getFecha() != null && calcularEdad(alumnos[i].getFecha()) == edad) {

                        }
                    }
                    imprimirTabla(alumnos);;
                    break;
                case 3:
                    System.out.print("Ingrese un NIA: ");
                    grupo = leer.next();
                    for (int i = 0; i < alumnos.length; i++) {
                        if (alumnos[i] != null && alumnos[i].getNia()==nia) {
                        }
                    }
                    imprimirTabla(alumnos);;
                    break;
                case 4:
                    System.out.print("Ingrese un apellido: ");
                    grupo = leer.next();
                    for (int i = 0; i < alumnos.length; i++) {
                        if (alumnos[i] != null && alumnos[i].getApellido().equals(apellido)) {
                        }
                    }
                    imprimirTabla(alumnos);;
                    break;
            }
        }
    }
    while (opcion != 0) ;
    }

    public static void imprimirTabla(Alumno[] alumnos) {
        System.out.println("+-----------+--------------+---------------+---------------------+--------+---------------+");
        System.out.println("|    NIA    |   Nombre     |   Apellidos   |  Fecha nacimiento   | Grupo  |   Teléfono    |");
        System.out.println("+-----------+--------------+---------------+---------------------+--------+---------------+");

        for (Alumno alumno : alumnos) {
            if (alumno != null) {
                System.out.printf("|%-11s|%-14s|%-15s|%-21s|%-8s|%-15d|\n",
                        alumno.getNia(), alumno.getNombre(), alumno.getApellido(),
                        alumno.getFecha(), alumno.getGrupo(), alumno.getTelefono());
            }
        }
        System.out.println("+-----------+--------------+---------------+---------------------+--------+---------------+");
    }

    // Método para registrar alumnos con datos pseudo-aleatorios
    public static void registrarAlumnosAleatorios(Alumno[] alumnos, int cantidad) {
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            int nia = 1000000 + random.nextInt(9000000); // NIA aleatorio de 7 dígitos
            String nombre = "Nombre" + (i + 1);
            String apellido = "Apellido" + (i + 1);

            // Fecha de nacimiento aleatoria en el formato "dd-MM-yyyy"
            int dia = 1 + random.nextInt(28);
            int mes = 1 + random.nextInt(12);
            int año = 1980 + random.nextInt(30);
            String fecha = String.format("%02d-%02d-%04d", dia, mes, año);

            String grupo = "Grupo" + (i % 3 + 1); // Alternando entre 3 grupos
            int telefono = 600000000 + random.nextInt(99999999); // Número de teléfono aleatorio

            Alumno nuevoAlumno = new Alumno(nia, nombre, apellido, fecha, grupo, telefono);

            // Verificar que no haya duplicados antes de agregar
            boolean niaDuplicado = false;
            for (Alumno alumno : alumnos) {
                if (alumno != null && alumno.getNia() == nia) {
                    niaDuplicado = true;
                    break;
                }
            }

            if (!niaDuplicado) {
                // Agregar el nuevo alumno si el NIA no está duplicado
                for (int j = 0; j < alumnos.length; j++) {
                    if (alumnos[j] == null) {
                        alumnos[j] = nuevoAlumno;
                        break;
                    }
                }
            } else {
                // Decrementar el contador de alumnos registrados si hay duplicado
                i--;
            }
        }
    }

}
