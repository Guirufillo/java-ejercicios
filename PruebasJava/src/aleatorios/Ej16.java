package aleatorios;

public class Ej16 {
    public static void main(String[] args) throws InterruptedException {

        int tragaperras=0;
        int icono1=0;
        int icono2=0;
        int icono3=0;


        for (int i=0; i<3; i++) {

            tragaperras = (int) (Math.random() * 5);

            switch (tragaperras) {
                case 0:
                    char corazon = '\u2764';
                    System.out.print("\033[31m "+corazon+"\033[37m ");
                    Thread.sleep(1500);
                    break;
                case 1:
                    char diamante = '\u25C6';
                    System.out.print("\033[39m "+diamante+" \033[37m");
                    Thread.sleep(1500);
                    break;
                case 2:
                    char caballo = '\u265E';
                    System.out.print("\033[36m "+caballo+"\033[37m ");
                    Thread.sleep(1500);
                    break;
                case 3:
                    char notaMusical = '\u266A';
                    System.out.print("\033[32m "+notaMusical+" \033[37m");
                    Thread.sleep(1500);
                    break;
                case 4:
                    char estrella = '\u2605';
                    System.out.print("\033[33m "+estrella+" \033[37m");
                    Thread.sleep(1500);
                    break;
                default:
            }
            switch(i) {
                case 0:
                    icono1 = tragaperras;
                    break;
                case 1:
                    icono2 = tragaperras;
                    break;
                case 2:
                    icono3 = tragaperras;
                    break;
                default:
            }
        }
        if ((icono1 !=icono2) && (icono2 !=icono3) && (icono1 !=icono3)){
            System.out.println("\n  Lo siento ha perdido. ");
        } else if ((icono1==icono2)&&(icono2==icono3)) {
            System.out.println("\n Enhorabuena, ha ganado 10 monedas. ");
        }else {
            System.out.println("\n ha recuperado su moneda.");
        }
    }
}
