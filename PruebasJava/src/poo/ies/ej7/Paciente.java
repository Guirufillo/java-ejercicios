package poo.ies.ej7;

public class Paciente {
    private String sip;
    private String nombre;
    private String sexo;
    private int edad;
    private String sintomatologia;
    private String fechaEntrada;
    private String horaEntrada;
    private AtencionMedica atencionMedica;
    private AltaMedica altaMedica;

    public Paciente(String sip, String nombre, String sexo, int edad, String sintomatologia, String fechaEntrada, String horaEntrada) {
        this.sip = sip;
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.sintomatologia = sintomatologia;
        this.fechaEntrada = fechaEntrada;
        this.horaEntrada = horaEntrada;

    }
    public void atender(double temperatura, int pulsaciones, int tensionSis, int tensionDias) {
        this.atencionMedica = new AtencionMedica(temperatura, pulsaciones, tensionSis, tensionDias);
    }
    public void darAlta(String motivoAlta) {
        if (this.atencionMedica != null && this.altaMedica == null) {
            this.altaMedica = new AltaMedica(motivoAlta);
            System.out.println("Alta médica registrada correctamente.");
        } else {
            System.out.println("El paciente no ha sido atendido aún o ya ha sido dado de alta.");
        }
    }
    public String getSip() {
        return sip;
    }
    public AtencionMedica getAtencionMedica() {
        return atencionMedica;
    }

    public AltaMedica getAltaMedica() {
        return altaMedica;
    }
    public String toString() {
        return "Sip: " + sip + ", Nombre: " + nombre + ", Sexo: " + sexo + ", Edad: " + edad + ", Sintomatologia: " + sintomatologia +
                ", Fecha de Entrada: " + fechaEntrada + ", Hora de Entrada: " + horaEntrada;
    }
}
