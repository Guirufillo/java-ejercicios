package poo.java.ObjetosSimples.ej3;

public class Main {
    public static void main(String[] args) {

        Pinguino tux= new Pinguino(Sexo.MACHO);
        tux.come("palomitas");
        tux.pescar();

        Gato felixa= new Gato("romano");
        Gato manu=new Gato(Sexo.MACHO);
        Gato felix= new Gato();

        felix.come("pescado");
        felix.raza();
        felix.peleaCon(felixa);
        felix.peleaCon(manu);
        manu.raza();
        felixa.raza();
        felixa.amamanta();
    }
}
