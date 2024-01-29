package herencia;

public class Alumno extends Persona{
    private String institucion;
    private double notasMatematicas;
    private double notasCastellano;
    private double notasHistoria;

    public Alumno(){
        System.out.println("Alumno: inicializando constructor...");
    }
    public Alumno(String nombre, String apellidos){
        super(nombre,apellidos);
    }

    public Alumno(String nombre, String apellidos, int edad){
        super(nombre,apellidos,edad);
    }

    public Alumno(String nombre, String apellidos, int edad, String institucion){
        this(nombre,apellidos,edad);
        this.institucion=institucion;
    }

    public Alumno(String nombre, String apellidos, int edad, String institucion,double notasCastellano,double notasHistoria, double notasMatematicas){
        this(nombre,apellidos,edad,institucion);
        this.notasCastellano=notasCastellano;
        this.notasHistoria=notasHistoria;
        this.notasMatematicas=notasMatematicas;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotasMatematicas() {
        return notasMatematicas;
    }

    public void setNotasMatematicas(double notasMatematicas) {
        this.notasMatematicas = notasMatematicas;
    }

    public double getNotasCastellano() {
        return notasCastellano;
    }

    public void setNotasCastellano(double notasCastellano) {
        this.notasCastellano = notasCastellano;
    }

    public double getNotasHistoria() {
        return notasHistoria;
    }

    public void setNotasHistoria(double notasHistoria) {
        this.notasHistoria = notasHistoria;
    }


    @Override
    public String saludar(){
        return "Hola que tal, soy un alumno y mi nombre es "+getNombre();
    }

    public double calcularPromedio(){
        return (notasMatematicas+notasHistoria+notasCastellano)/3;
    }

    @Override
    public String toString() {
        return super.toString()+"\ninstitucion='" + institucion + '\'' +
                ", notasMatematicas= " + notasMatematicas +
                ", notasCastellano= " + notasCastellano +
                ", notasHistoria= " + notasHistoria +
                ", promedio= " + this.calcularPromedio();
    }
}
