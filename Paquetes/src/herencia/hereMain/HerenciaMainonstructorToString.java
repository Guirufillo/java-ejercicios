package herencia.hereMain;

import herencia.Alumno;
import herencia.AlumnoInternacional;
import herencia.Persona;
import herencia.Profesor;

public class HerenciaMainonstructorToString {
    public static void main(String[]args){

        System.out.println("===== creando la instancia de la clase Alumno=====");

        Alumno alu=new Alumno("pepe","li", 25,"Instituto nacional");
        alu.setNotasCastellano(5.5);
        alu.setNotasHistoria(6.3);
        alu.setNotasMatematicas(4.9);
        Alumno alu1=new Alumno();

        System.out.println("===== creando la instancia de la clase AlumnoInternacional=====");
        AlumnoInternacional ai=new AlumnoInternacional();
        AlumnoInternacional an=new AlumnoInternacional("Pedro","susu", "Alemania");
        an.setEdad(17);
        an.setInstitucion("Instituto Internacional");
        an.setNotasIdiomas(6.8);
        an.setNotasCastellano(6.2);
        an.setNotasHistoria(5.8);
        an.setNotasMatematicas(6.5);

        System.out.println("===== creando la instancia de la clase Profesor=====");
        Profesor profe1=new Profesor();
        Profesor profe=new Profesor("juan","Ku","lengua");
        profe.setEdad(48);
        profe.setEmail("profe@cole.xom");

        Profesor profesor=new Profesor("Perico","pipo","Mates");
        profe.setEdad(58);
        profe.setEmail("profe@cole.com");

        System.out.println("=========== - ==============");
        imprimir(alu1);
        imprimir(ai);
        imprimir(profe1);

        imprimir(alu);
        imprimir(an);
        imprimir(profe);
    }

    public static void imprimir(Persona persona) {
        System.out.println("=========== - ==============");
        System.out.println(persona);
    }

}


