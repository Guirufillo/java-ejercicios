package Objetos;

public class EjemploAuto1 {
    public static void main(String [] args){

        Auto auto=new Auto();
        
        auto.setFabricante("suzuki");
        auto.setModelo("titu");
        auto.cilindrada= 2.0;
        auto.setColor(Color.BLANCO);

        Auto nissan= new Auto("mazda","x5",Color.ROJO,2.0,50);

        System.out.println(auto.detalle());
        System.out.println(auto.acelerar(3000));
        System.out.println(auto.frenar());
        System.out.println(auto.acelerarFrenar(5000));
        System.out.println("kilometros por litro "+auto.calConsumo(300,0.6f));
        System.out.println(nissan.detalle());
    }
}
