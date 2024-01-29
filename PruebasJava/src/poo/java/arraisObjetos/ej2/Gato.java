package poo.java.arraisObjetos.ej2;

public class Gato {

    private String nombre;
    private String color;
    private String raza;
    public Gato(){

    }

    public Gato(String n, String c, String r){
        this.nombre=n;
        this.color=c;
        this.raza=r;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public String getRaza() {
        return raza;
    }
}
