package prueba;

import java.io.IOException;

public class variablesEntorno {
    public static void main(String[] args) {

        Runtime notas= Runtime.getRuntime();
        Process proceso;

        try{
            if(System.getProperty("os.name").toLowerCase().startsWith("windows")){
                proceso=notas.exec("notepad");
            }
            //proceso.waitFor();
        } catch(IOException e){
            System.err.println("El comando es desconocido: " + e.getMessage());
            System.exit(1);
        }
    }

}
