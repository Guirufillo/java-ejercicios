package herencia;

public class AlumnoInternacional extends Alumno{

    private String pais;
    private double notasIdiomas;

    public AlumnoInternacional(){
        System.out.println("Alumno Internacional: inicializando constructor...");
    }

    public AlumnoInternacional(String nombre, String apellidos){
        super(nombre, apellidos);
    }

    public AlumnoInternacional(String nombre, String apellidos,String pais){
        super(nombre, apellidos);
        this.pais=pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotasIdiomas() {
        return notasIdiomas;
    }

    public void setNotasIdiomas(double notasIdiomas) {
        this.notasIdiomas = notasIdiomas;
    }

    @Override
    public String saludar() {
        return "Hola soy un alumno extranjero del pais "+getPais()+ ", mi nombre es: "+getNombre();
    }

    @Override
    public double calcularPromedio() {
        return ((super.calcularPromedio()*3)+notasIdiomas)/4;
    }

    @Override
    public String toString() {
        return super.toString()+ "\npais='" + pais + '\'' +
                ", notasIdiomas= " + notasIdiomas;
    }
}
