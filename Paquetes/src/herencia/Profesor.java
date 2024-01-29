package herencia;

public class Profesor extends Persona{
    private String asignatura;

    public Profesor(){
        System.out.println("Profesor: inicializando constructor...");
    }

    public Profesor(String nombre, String apellidos, int edad){

        super(nombre,apellidos, edad);
    }
    public Profesor(String nombre, String apellidos, String asignatura){
        super(nombre,apellidos);
        this.asignatura=asignatura;
    }
    public Profesor(String nombre, String apellidos, int edad, String asignatura){
        super(nombre,apellidos, edad);
        this.asignatura=asignatura;
    }
    public String getAsignatura() {
        return asignatura;
    }
    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar() {
        return "Buenos dias soy el profesor de "+getAsignatura() + ", mi nombre es "+ getNombre();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nasignatura='" + asignatura + '\'' ;
    }
}
