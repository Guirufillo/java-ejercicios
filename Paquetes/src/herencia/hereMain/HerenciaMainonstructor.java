package herencia.hereMain;

import herencia.Alumno;
import herencia.AlumnoInternacional;
import herencia.Persona;
import herencia.Profesor;

public class HerenciaMainonstructor {
    public static void main(String[]args){

        System.out.println("===== creando la instancia de la clase Alumno=====");
        Alumno alu=new Alumno("pepe","li", 25,"Instituto nacional");
        alu.setNotasCastellano(5.5);
        alu.setNotasHistoria(6.3);
        alu.setNotasMatematicas(4.9);

        System.out.println("===== creando la instancia de la clase AlumnoInternacional=====");
        AlumnoInternacional an=new AlumnoInternacional("Pedro","susu", "Alemania");
        an.setEdad(17);
        an.setInstitucion("Instituto Internacional");
        an.setNotasIdiomas(6.8);
        an.setNotasCastellano(6.2);
        an.setNotasHistoria(5.8);
        an.setNotasMatematicas(6.5);

        System.out.println("===== creando la instancia de la clase Profesor=====");
        Profesor profe=new Profesor("juan","Ku","lengua");
        profe.setEdad(48);
        profe.setEmail("profe@cole.xom");

        Profesor profesor=new Profesor("Perico","pipo","Mates");
        profe.setEdad(58);
        profe.setEmail("profe@cole.com");

        System.out.println("=========== - ==============");

        imprimir(alu);
        imprimir(an);
       imprimir(profe);
    }

    public static void imprimir(Persona persona){
        System.out.println("Imprimiendo datos en comun del tipo persona: ");
        System.out.println("nombre: "+persona.getNombre()
                +", apellido: "+persona.getApellidos()
                +", edad"+persona.getEdad()
                +", email"+persona.getEmail());
        if(persona instanceof Alumno){ //si en vez de persona es alumno
            System.out.println("*Imprimiendo los datos del alumno:");
            System.out.println("Institucion: "+((Alumno) persona).getInstitucion());
            System.out.println("Notas matematicas: "+((Alumno) persona).getNotasMatematicas());
            System.out.println("Notas historia: "+((Alumno) persona).getNotasHistoria());
            System.out.println("notas castellano"+((Alumno) persona).getNotasCastellano());

            if(persona instanceof AlumnoInternacional){
                System.out.println("*Imprimiendo los datos del alumno internacinal:");
                System.out.println("notas idiomas: "+((AlumnoInternacional) persona).getNotasIdiomas());
                System.out.println("Pais: "+((AlumnoInternacional) persona).getPais());
            }

            System.out.println("======= Sobre escritura promedio ============");
            System.out.println(((Alumno) persona).calcularPromedio());

            System.out.println("============================================");
        }


        if(persona instanceof Profesor){
            System.out.println("*Imprimiendo los datos del profesor:");
            System.out.println("asignatura: "+((Profesor) persona).getAsignatura());
        }

        System.out.println("======= Sobre escritura saludar ============");
        System.out.println(persona.saludar());

        System.out.println("============================================");

        }
    }


