package poo.ies.ej7;

import java.util.Date;
public class CentroSalud {
    private static final int MAX_PACIENTES = 40;
    private Paciente[] pacientes;
    private int numPacientes; //contador

    public CentroSalud() {
        this.pacientes = new Paciente[MAX_PACIENTES];
        this.numPacientes = 0;
    }

    public void registrarPaciente(Paciente paciente) {
        if (numPacientes < MAX_PACIENTES) {
            pacientes[numPacientes++] = paciente;
        } else {
            System.out.println("Número máximo de pacientes alcanzado.");
        }
    }
    public Paciente buscarPaciente(String sip) {
        for (int i = 0; i < numPacientes; i++) {
            if (pacientes[i].getSip().equals(sip)) {
                return pacientes[i];
            }
        }
        return null;
    }

    public void nuevoPaciente(String sip, String nombre, String sexo, int edad, String sintomatologia) {
        Date fecha = new Date();
        String fechaEntrada = fecha.toString();
        String horaEntrada = fecha.toString();

        Paciente pacienteEnCentro = buscarPaciente(sip);
        if (pacienteEnCentro != null && pacienteEnCentro.getAltaMedica() == null) {
            System.out.println("El paciente ya está siendo atendido.");
        } else {
            Paciente nuevoPaciente = new Paciente(sip, nombre, sexo, edad, sintomatologia, fechaEntrada, horaEntrada);
            registrarPaciente(nuevoPaciente);
            System.out.println("Paciente registrado correctamente.");
        }
    }
    public void darAlta(String sip, String motivoAlta) {
        Paciente paciente = buscarPaciente(sip);
        if (paciente != null && paciente.getAltaMedica() == null) {
            paciente.darAlta(motivoAlta);
            System.out.println("Alta médica registrada correctamente.");
        } else {
            System.out.println("El paciente no está registrado o ya ha sido dado de alta.");
        }
    }

}
