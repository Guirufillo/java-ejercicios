package herencia.hereMain;

import herencia.Alumno;
import herencia.AlumnoInternacional;
import herencia.Profesor;

public class HerenciaMain {
    public static void main(String[]args){

        System.out.println("===== creando la instancia de la clase Alumno=====");
        Alumno alu=new Alumno();
        alu.setNombre("pepe");
        alu.setApellidos("li");
        alu.setInstitucion("Instituto Internacional");
        alu.setNotasCastellano(5.5);
        alu.setNotasHistoria(6.3);
        alu.setNotasMatematicas(4.9);

        System.out.println("===== creando la instancia de la clase AlumnoInternacional=====");
        AlumnoInternacional an=new AlumnoInternacional();
        an.setNombre("Pedro");
        an.setApellidos("susu");
        an.setPais("Alemania");
        an.setEdad(17);
        an.setInstitucion("Instituto Internacional");
        an.setNotasIdiomas(6.8);
        an.setNotasCastellano(6.2);
        an.setNotasHistoria(5.8);
        an.setNotasMatematicas(6.5);


        System.out.println("===== creando la instancia de la clase Profesor=====");
        Profesor profe=new Profesor();
        profe.setNombre("Juan");
        profe.setApellidos("ku");
        profe.setAsignatura("lengua");

        System.out.println("alumno: "+alu.getNombre()+" "+alu.getApellidos());
        System.out.println("");
        System.out.println("profesor de "+profe.getAsignatura()+": "+profe.getNombre()+" "+profe.getApellidos());




    }
}
