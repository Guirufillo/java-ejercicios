package poo.java.ObjetosSimples.ej1;

public class Caballo {

    private String nombre;
    private String color;
    private int edad;
    private int carrerasGanadas;

    Caballo( String n,String c,int e,int cg){
        this.nombre=n;
        this.color=c;
        this.edad=e;
        this.carrerasGanadas=cg;
    }

    public String getNombre() {
        return nombre;
    }
    public void cabalga(){
        System.out.println("tocotoc tocotoc tocotoc");
    }
    public void relincha(){
        System.out.println("hiiiiiiieeeee");
    }
    public void rumia(){
        System.out.println("ñam ñam ñam");
    }
}
