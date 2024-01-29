package funciones.n1;

import java.util.Scanner;

public class Ej20 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);

        System.out.print("Introduce tu fecha de nacimiento (dd-mm-aaaa: ");
        String fecha= leer.next();

        System.out.println(fechaInt(fecha));
    }

    public static int fechaInt(String fecha){
      String fech="";

      for (int i=0;i<fecha.length();i++){
          char caracter = fecha.charAt(i);
          if(Character.isDigit(caracter)) { // solo recoje digitos, 76143546, la letra E es un caracter.
              // Si es un dígito lo añadimos a dniString
              fech = fech + caracter;
          }
      }

      int nfecha= Integer.parseInt(fech);

      int suma = 0;


      for (int i=0;i<8;i++){
         suma+=nfecha % 10;
         nfecha/=10;
      }
      String sumado= Integer.toString(nfecha);
        int res=0;
        int dia = Integer.parseInt(sumado.substring(0,1));
        int dia2 = Integer.parseInt(sumado.substring(1,2));
int su=dia+dia2;
        return su;
    }
}
