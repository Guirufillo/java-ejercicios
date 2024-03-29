package poo.java.ObjetosSimples.ej6;

public class Tiempo {

    private int segundos;

    public Tiempo(int horas, int minutos, int segundos){

        this.segundos=(horas*3600)+(minutos*60)+segundos;
    }


    public Tiempo(int s){
    this.segundos=s;
    }


    public String toString() {
        int segundos = this.segundos;
        int horas = segundos / 3600;
        segundos = segundos-(horas * 3600);

        int minutos = segundos / 60;
        segundos = segundos-(minutos * 60);

        return  horas + "h " + minutos + "m " + segundos + "s";
    }

    private int getSegundos(){
        return this.segundos;
    }

    public Tiempo suma(Tiempo t) {
        return new Tiempo(this.segundos + t.getSegundos());
    }

    public Tiempo resta(Tiempo t) {
        return new Tiempo(this.segundos - t.getSegundos());
    }

}
