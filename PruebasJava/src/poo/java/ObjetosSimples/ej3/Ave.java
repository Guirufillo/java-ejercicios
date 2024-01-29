package poo.java.ObjetosSimples.ej3;

public class Ave extends Animal{

    public Ave(){

        super();
    }
    public Ave(Sexo s){

        super(s);
    }

    public void ponHuevos(){
        if (this.getSexo()== Sexo.MACHO){
            System.out.println("No puedo poner huevos, soy un macho");
        }
        else {
            System.out.println("Soy hembra y pongo huevos y los empollo");
        }
    }
    public void limpiate(){
        System.out.println("Me estoy limpiando las plumas");
    }

    public void vuela(){
        System.out.println("voy volando");
    }
}
