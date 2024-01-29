package poo.java.ObjetosSimples.ej4;

public class Fraccion {
    private int numerador;
    private int denominador;

    public void suma (int n, int d){
        this.numerador=n;
        this.denominador=d;
        System.out.println(n+" + "+d+" = "+(n+d));
    }

    public void resta (int n, int d){
        this.numerador=n;
        this.denominador=d;
        System.out.println(n+" - "+d+" = "+(n-d));
    }

    public void multi (int n, int d){
        this.numerador=n;
        this.denominador=d;
        System.out.println(n+" * "+d+" = "+(n*d));
    }



}


