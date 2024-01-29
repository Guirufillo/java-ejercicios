package pruebas.poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n = 3;  // Puedes ajustar la cantidad de alumnos según tus necesidades
        int ID;
        String Nombre;
        String Asignatura;
        int opcion = 3;

        ArrayAlumnos alumno = new ArrayAlumnos(n);



do {
    System.out.println("introduzca su opcion");
    opcion= leer.nextInt();

    switch (opcion){
        case 1:
        System.out.print("Introduce el ID del alumno: ");
        ID = leer.nextInt();
        System.out.print("Introduce el nombre del alumno: ");
        Nombre = leer.next();
        System.out.print("Introduce la asignatura del alumno: ");
        Asignatura = leer.next();
        alumno.agregarAlumno(ID, Nombre, Asignatura);
        break;

        case 2:
        alumno.listarAlumnos();
        break;

        case 3:
        System.out.println("Inserta el id del alumno a eliminar");
        ID=leer.nextInt();
        alumno.eliminarAlumno(ID);
        break;
        }

}while (opcion !=0);

/*
        // Ejemplo de uso
        ejemploArray.agregarAlumno(1, "Maria", "Matemáticas");
        ejemploArray.agregarAlumno(2, "Juan", "Historia");
        ejemploArray.listarAlumnos();

        ejemploArray.eliminarAlumno(2);
        ejemploArray.listarAlumnos();*/
    }
}