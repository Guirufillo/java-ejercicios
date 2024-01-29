package poo.java.ObjetosSimples.ej3;

public class Mamifero extends Animal{

    public Mamifero(){
        super();
    }

    public Mamifero(Sexo x){
        super(x);
    }

    public void amamanta(){
        if (this.getSexo()==Sexo.MACHO){
            System.out.println("Soy macho, no amamanto crias");
        }
        else {
            System.out.println("soy hembra y amamanto mis crias");
        }
    }

    public void cuidaCrias(){
        System.out.println("Estoy cuidando mis crias");
    }

    public void anda(){
        System.out.println("Estoy andando");
    }

}
