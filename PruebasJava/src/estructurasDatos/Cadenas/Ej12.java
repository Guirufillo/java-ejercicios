package estructurasDatos.Cadenas;

public class Ej12 {
    public static void ejecutarEj12(){

        String cadena= "esto1234es5678bueno900";

        System.out.println(noPor(cadena));
        System.out.println(caracter(cadena));

    }

    //Escribe un método que, dada una cadena de caracteres, sustituya todas las ocurrencias del texto «es» por «no por»
    //«no porto1234no por5678bueno900»
    public static String noPor(String cadena){
        String palabro= cadena.replace("es","no por");
        return palabro;
    }

    //Escribe un segundo método que sustituya todos el grupos de dígitos por un único carácter *
    //«esto*es*bueno*»
    public static String caracter(String cadena){
        String palabro2= cadena.replaceAll("\\d+", "*");
        return palabro2;
    }
}
