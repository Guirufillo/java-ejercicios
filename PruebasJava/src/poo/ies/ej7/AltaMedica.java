package poo.ies.ej7;

import java.util.Date;

public class AltaMedica {
    private String fechaAlta;
    private String horaAlta;
    private String motivoAlta;

    public AltaMedica(String motivoAlta) {
        Date fecha = new Date();
        this.fechaAlta = fecha.toString();
        this.horaAlta = fecha.toString();
        this.motivoAlta = motivoAlta;
    }
    public String getFechaAlta() {
        return fechaAlta;
    }
    public String getHoraAlta() {
        return horaAlta;
    }
    public String getMotivoAlta() {
        return motivoAlta;
    }
}
