package funciones.n1;

import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int menu=menu();
        opcion(menu);

    }
    public static int menu(){
        Scanner leer1 = new Scanner(System.in);
        int option;

       do{
           System.out.println("Elija una opcion de las 3, utilice el numero de la opcion e intro para continuar");
           System.out.println("1. Palabra más larga");
           System.out.println("2. Palabra más corta");
           System.out.println("3. Número de vocales en una palabra");
           System.out.println("----------------------------------- ");
           System.out.println("0. Si quiere salir introduzca el 0");
           option= leer1.nextInt();
           System.out.println("Ha elegido el "+option+"\n");

           if (option==0){
               System.out.println("Hasta pronto!!");
              break;}

           if (option!=1 && option!=2 && option!=3){
               System.out.println("\n \033[31m"+option+" \033[31m No es una opcion valida \033[38m\n");}


       }while (option!=1 && option!=2 && option!=3);

        return option;
    }

    public static void opcion(int opc){
        Scanner leer = new Scanner(System.in);
        switch (opc){
            case 1:
                int i,x,z,uno, dos, tres;
                String palabra1, palabra2, palabra3;

                System.out.println("Escribe 3 palabras y te dire que palabra es las larga");
                System.out.println("escribe una palabra: ");
                palabra1= leer.next();
                for ( i=0; i< palabra1.length(); i++){}
                uno= i;

                System.out.println("escribe otra palabra: ");
                palabra2= leer.next();
                for ( x=0; x< palabra2.length(); x++){}
                dos= x;

                System.out.println("escribe otra palabra más: ");
                palabra3= leer.next();
                for ( z=0; z< palabra3.length(); z++){}
                tres= z;

                if (uno>dos && uno>tres){
                    System.out.println("la palabra \033[32m"+palabra1+"\033[38m es la mayor de todas las palabras");}
                else if (dos>uno && dos>tres){
                    System.out.println("la palabra \033[32m"+palabra2+"\033[38m es la mayor de todas las palabras");}
                else if (tres>uno && tres>dos){
                    System.out.println("la palabra \033[32m"+palabra3+"\033[38m es la mayor de todas las palabras");}
                break;


            case 2:

                System.out.println("Escribe 3 palabras y te dire que palabra es las Corta");
                System.out.println("escribe una palabra: ");
                palabra1= leer.next();
                for ( i=0; i< palabra1.length(); i++){}
                uno= i;

                System.out.println("escribe otra palabra: ");
                palabra2= leer.next();
                for ( x=0; x< palabra2.length(); x++){}
                dos= x;

                System.out.println("escribe otra palabra más: ");
                palabra3= leer.next();
                for ( z=0; z< palabra3.length(); z++){}
                tres= z;

                if (uno<dos && uno<tres){
                    System.out.println("la palabra \033[32m"+palabra1+"\033[38m es la menor de todas las palabras");}
                else if (dos<uno && dos<tres){
                    System.out.println("la palabra \033[32m"+palabra2+"\033[38m es la menor de todas las palabras");}
                else if (tres<uno && tres<dos){
                    System.out.println("la palabra \033[32m"+palabra3+"\033[38m es la menor de todas las palabras");}
                break;

            case 3:
                int contador=0;
                char letra =' ';
                System.out.println("Inserte una palabra y le dire cuantas vocales tiene: ");
                String palabra=leer.nextLine();
                String palab= palabra.toLowerCase();

                for( i=0 ; i<palab.length(); i++) {

                    letra = palab.charAt(i);

                    switch(letra) {
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
                        case 'á':
                        case 'à':
                        case 'é':
                        case 'è':
                        case 'í':
                        case 'ó':
                        case 'ò':
                        case 'ú':
                            contador++;
                    }
                }
                System.out.println("Hay " + contador + " vocales");
                break;
        }
    }
}
