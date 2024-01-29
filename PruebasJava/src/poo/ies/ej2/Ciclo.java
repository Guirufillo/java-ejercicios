package poo.ies.ej2;

public class Ciclo {
    private String asignatura;
    private int codigo;
    private int curso;

    public Ciclo(){}
    public Ciclo(String a, int co, int cu){
        this.asignatura=a;
        this.codigo=co;
        this.curso=cu;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "Nombre: "+getAsignatura()+ "; codigo: "+getCodigo()+"; Curso: "+getCurso();
    }
}
