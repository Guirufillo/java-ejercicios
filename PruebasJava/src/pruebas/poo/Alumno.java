package pruebas.poo;

public class Alumno {

    private int id;
    private String nombre;
    private String asignatura;

    public Alumno(int id, String nombre, String asignatura) {
        this.id = id;
        this.nombre = nombre;
        this.asignatura = asignatura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAsignatura() {
        return asignatura;
    }

}

