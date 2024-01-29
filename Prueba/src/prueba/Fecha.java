package prueba;

import java.util.Calendar;
import java.util.Date;

public class Fecha {
    public static void main(String[] args) {

      /*  Date fecha= new Date();
        System.out.println("fecha = " + fecha);

        SimpleDateFormat df= new SimpleDateFormat("EEEE dd MMMM,yyyy");
        String fechaMod = df.format(fecha);

        System.out.println("fechaMod = " + fechaMod);*/

        Calendar calendario= Calendar.getInstance();
        Date fecha= calendario.getTime();
        System.out.println("fecha = " + fecha);
    }
}
