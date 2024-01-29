package clasesAbstractas;

import clasesAbstractas.elementos.ElementoFom;
import clasesAbstractas.elementos.InputForm;
import clasesAbstractas.elementos.SelectForm;
import clasesAbstractas.elementos.TextareaForm;
import clasesAbstractas.elementos.selec.Option;

import java.util.ArrayList;
import java.util.List;

public class ClaseMain {
    public static void main(String[] args) {

        InputForm username= new InputForm("username");
        InputForm password = new InputForm("clave", "password");
        InputForm email = new InputForm("email", "email");
        InputForm edad = new InputForm("edad", "number");

        TextareaForm areatexto = new TextareaForm("at", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        Option informatica = new Option("1","java");
        lenguaje.addOpcion(informatica);
        lenguaje.addOpcion(new Option("2", "Python"));
        lenguaje.addOpcion(new Option("3","JavaScript"));
        lenguaje.addOpcion(new Option("4","TypeScript"));
        lenguaje.addOpcion(new Option("5","PHP"));

        username.setValor("oscar");
        password.setValor("asdf12");
        email.setValor("oscar@hotmail.com");
        edad.setValor("35");
        areatexto.setValor("esto es un area de texto");
        informatica.setSelected(true);

        List<ElementoFom> elementos = new ArrayList<>();
        elementos.add(username);
        elementos.add(password);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(areatexto);
        elementos.add(lenguaje);

        for (ElementoFom e:elementos) {
            System.out.println(e.dibujarHtml());
        }

    }
}
