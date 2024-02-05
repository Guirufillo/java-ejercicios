package poo.ies.ej7;

public class AtencionMedica {
    private double temperatura;
    private int pulsaciones;
    private int tensionSis;
    private int tensionDias;

    public AtencionMedica(double temperatura, int pulsaciones, int tensionSis, int tensionDias) {
        this.temperatura = temperatura;
        this.pulsaciones = pulsaciones;
        this.tensionSis = tensionSis;
        this.tensionDias = tensionDias;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public int getPulsaciones() {
        return pulsaciones;
    }

    public int getTensionSis() {
        return tensionSis;
    }

    public int getTensionDias() {
        return tensionDias;
    }
}

