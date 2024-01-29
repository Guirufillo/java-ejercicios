package Objetos;

public class Auto {
    private String fabricante;
    private String modelo;
    private Color color = Color.AMARILLO;
    double cilindrada;
    int capacidadEstanque=40;

    static Color colorPatente=Color.NARANJA;

    public Auto(){
    }
    public Auto(String fabricante,  String modelo){
        this.fabricante=fabricante;
        this.modelo=modelo;
    }
    public Auto(String fabricante, String modelo, Color color, double cilindrada, int capacidadEstanque) {
        this(fabricante,modelo);
        this.color = color;
        this.cilindrada = cilindrada;
        this.capacidadEstanque = capacidadEstanque;
    }
    public String detalle(){
        return "fabricante= " + this.getFabricante() +
                "\n modelo = " + this.getModelo() +
                "\n color = " + this.color +
                "\n patenteColor = " + colorPatente +
                "\n cilindrada = " + this.cilindrada;
    }
    public String acelerar(int rpm){
        return "el coche " + fabricante+ " acelerando a "+rpm+ "rpm";
    }
    public String frenar(){
        return fabricante+" "+modelo+ " frenando!";
    }
    public String acelerarFrenar(int rpm){
        String acelerar= this.acelerar(rpm);
        String frenar= this.frenar();
        return acelerar+"\n"+frenar();
    }
    public float calConsumo(int km,float porcentajeGasolina){
        return km/(capacidadEstanque*porcentajeGasolina);
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }


}