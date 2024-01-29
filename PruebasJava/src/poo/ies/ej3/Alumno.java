package poo.ies.ej3;

import java.util.Calendar;
public class Alumno {
    private int nia;
    private String nombre;
    private String apellido;
    private String fecha;
    private String grupo;
    private int telefono;


    public Alumno(int i, String n, String a, String f, String g, int t) {
        this.nia = i;
        this.nombre = n;
        this.apellido = a;
        this.fecha = f;
        this.grupo = g;
        this.telefono = t;
    }

    public int getNia() {
        return nia;
    }

    public void setNia(int nia) {

        this.nia = nia;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getApellido() {

        return apellido;
    }

    public void setApellido(String apellido) {

        this.apellido = apellido;
    }

    public String getFecha() {

        return fecha;
    }

    public void setFecha(String fecha) {

        this.fecha = fecha;
    }

    public String getGrupo() {

        return grupo;
    }

    public void setGrupo(String grupo) {

        this.grupo = grupo;
    }

    public int getTelefono() {

        return telefono;
    }

    public void setTelefono(int telefono) {

        this.telefono = telefono;
    }

    static int calcularEdad(String fecha) {

        int ayoActual = Calendar.getInstance().get(Calendar.YEAR); //devuelve el año 2024

        int ayoNacimiento;
        if (fecha.contains("/")) {
            ayoNacimiento = Integer.parseInt(fecha.split("/")[2]); // [0],[1],[2] / [02],[03],"[2000]" el [2]=[2000]
        } else if (fecha.contains("-")) {
            ayoNacimiento = Integer.parseInt(fecha.split("-")[2]);
        } else {
            // Manejar el caso en que el formato de fecha no sea ni "/" ni "-"
            ayoNacimiento = 0; // Otra acción, según tus necesidades
        }

        return ayoActual - ayoNacimiento; //2024-2000
    }

}