package sentenciaCondicional;

import java.util.Objects;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

      Scanner leer= new Scanner(System.in);
        System.out.println("1- Programador junior");
        System.out.println("2- Programador senior");
        System.out.println("3- Jefe de proyecto");
        System.out.println("Introduzca el cargo del empleado(1-3): ");
        int cargo= leer.nextInt();
        System.out.println("Cuantos dias ha estado de viaje visitando clientes?: ");
        int visita= leer.nextInt();
        System.out.println("Introduzca su estado civil (1- Soltero, 2- Casado): ");
        int estado= leer.nextInt();

        int sul=0;
        switch (cargo){
          case 1:
            sul= 950;
            break;
          case 2:
            sul=1200;
            break;
          case 3:
            sul=1600;
              break;
          default:
            System.out.println("ha ingresado un numero erroneo");
        }
      System.out.println("Sueldo base "+sul);

      int tvis= visita*30;
      System.out.println("dietas ("+visita+" viajes) "+tvis);

      int totalsul=sul+tvis;
      System.out.println("Sueldo bruto: " +totalsul);

      int civil=0;
      switch (estado){
        case 1:
         civil= (totalsul*25)/100;
          System.out.println("Retencion IRPF (25%) "+civil);
          break;
        case 2:
          civil= (totalsul*20)/100;
          System.out.println("Retencion IRPF (20%) "+civil);
          break;
        default:
          System.out.println("ha ingresado un numero erroneo");
      }
      System.out.println("Sueldo neto "+(totalsul-civil));
    }
}