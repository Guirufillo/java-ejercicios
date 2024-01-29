package estructurasDatos.Matrices;

import estructurasDatos.Main;

public class Ej17 {
    public static void ejecutarEj17(){
        System.out.print("introdice la cantidad de personas: ");
        int personas= Main.leer.nextInt();

        int[] persona= new int[personas];

        int suma = 0;

        for (int i=0; i< personas; i++) {
            System.out.print("por favor introduce estatura "+(i+1)+" en centimetros: ");
             int estatura= Main.leer.nextInt();

                persona[i]=estatura; //revisar
                suma+=estatura;
        }
        int media= suma /personas;
        System.out.println("La media de todas las estaturas es: "+media);

        System.out.print("Las personas con alturas ");
            for(int z = 0; z < persona.length; z++) { //revisar el for
                if (persona[z] > media) {
                    System.out.print(persona[z] + ", ");
                }
        }System.out.print("son mas altas de la media");
    }
}
