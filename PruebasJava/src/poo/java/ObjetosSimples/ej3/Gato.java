package poo.java.ObjetosSimples.ej3;

public class Gato extends Mamifero{
    private String raza;
    public Gato(){
        super();
    }
    public Gato(Sexo s, String r){
        super(s);
        this.raza=r;
    }
    public Gato(Sexo s){
        super(s);
        this.raza="Siames";
    }
    public Gato(String r){
        super(Sexo.HEMBRA);
        this.raza=r;
    }

    public void caza(){
        System.out.println("Cazo ratones");
    }
    public void maulla(){
        System.out.println("Miauuuuu");
    }

    @Override
    public void come(String c) {
        super.come(c);
    }
    public void raza(){
        System.out.println("soy de raza "+raza);
    }

    public void peleaCon(Gato contrincante) {
        if (this.getSexo() == Sexo.HEMBRA) {
            System.out.println("no me gusta pelear");
        } else {
            if (contrincante.getSexo() == Sexo.HEMBRA) {
                System.out.println("no peleo contra gatitas");
            } else {
                System.out.println("ven aquí que te vas a enterar");
            }
        }
    }
}
