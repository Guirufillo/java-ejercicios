package poo.java.ObjetosSimples.ej3;

public class Perro extends Mamifero{

    private String raza;
    private String comida;

    public Perro(){
        super();
    }
    public Perro(Sexo s){
        super(s);
        this.raza="caniche";
    }

    public void correr(){
        System.out.println("mira como corro!!");
    }

    @Override
    public void come(String comida) {
        super.come(comida);
        this.comida="carne";
        if (comida.equals("carne")){
            System.out.println("que rica");
        }
        else {
            System.out.println("no soy un gato");
        }
    }
    public void juega(){
        System.out.println("juego con mi pelota");
    }
    public void duerme(){
        System.out.println("zzzzzzzz");
    }

}
