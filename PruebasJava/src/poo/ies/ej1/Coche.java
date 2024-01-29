package poo.ies.ej1;

public class Coche {
    public enum Seguro {TERCEROS, TODORIESGO}
    private String modelo;
    private String color;
    private String matricula;
    private  int anioFabr;
    private Tipo tipo;
    private Seguro seguro;

    public Coche(){
        this.tipo=Tipo.MINI;
    }
    public Coche(String mo, String c){
        this.modelo=mo;
        this.color=c;

    }
    public Coche(String mo, String c, String ma,int a ){
        this.modelo=mo;
        this.color=c;
        this.matricula=ma;
        this.anioFabr=a;
        this.seguro=Seguro.TODORIESGO;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnioFabr() {
        return anioFabr;
    }

    public void setAnioFabr(int anioFabr) {
        this.anioFabr = anioFabr;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    public void imprimirCoche(){
        System.out.println("el modelo del vehiculo es "+getModelo()+" y el color es "+getColor());
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
