package poo.java.ObjetosSimples.ej3;

public class Pinguino extends Ave{

    public Pinguino(){
        super();
    }
    public Pinguino(Sexo s){
        super(s);
    }
    public void caminar(){
        System.out.println("Camino por la nieve");
    }
    public void pescar(){
        System.out.println("Pesco en el agua");
    }
    public void nadar(){
        System.out.println("nado y buceo en el agua");
    }
}
