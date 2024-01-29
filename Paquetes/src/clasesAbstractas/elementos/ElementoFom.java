package clasesAbstractas.elementos;

public abstract class ElementoFom {

    protected String valor;
    protected String nombre;

    public ElementoFom(){}

    public ElementoFom(String nombre){
        this();
        this.nombre=nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public abstract String dibujarHtml();
}
