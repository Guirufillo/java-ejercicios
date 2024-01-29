package es.oscar.app.jardin;

import es.oscar.app.hogar.ColorPelo;
import es.oscar.app.hogar.Gato;
import es.oscar.app.hogar.Persona;

import static es.oscar.app.hogar.ColorPelo.*;
import static es.oscar.app.hogar.Persona.*;

public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona p=new Persona();
        p.setNombre("Andres");
        p.setColorPelo(RUBIO);
        System.out.println( p.getNombre());
        System.out.println(p.getColorPelo());

        Gato gatito = new Gato();

        Perro perrito= new Perro();
        perrito.nombre= "Tobby";
        perrito.raza= "Bulldog";

        String jugando= perrito.jugar(p);
        System.out.println("jugando = " + jugando);

        String saludo = saludar();
        System.out.println("saludo = " + saludo);

        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;
        System.out.println("generoHombre = " + generoHombre);
        System.out.println("generoMujer = " + generoMujer);
    }
}
