package poo.java.ObjetosSimples.ej3;

public class Canario extends Ave{

    public Canario(){
    super();
    }
    public Canario(Sexo s){
        super(s);
    }

    public void canta(){
        System.out.println("piriiii, pirrrrri");
    }
    public void pia(){
        System.out.println("pio,pio,pio");
    }

}
