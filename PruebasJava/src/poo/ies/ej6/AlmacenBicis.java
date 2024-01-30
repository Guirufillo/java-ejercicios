package poo.ies.ej6;

import java.util.Scanner;
public class AlmacenBicis {
    Scanner leer=new Scanner(System.in);
    static int stockTotal = 0; //Contador
    final int MAX_BICICLETAS = 10;
   public static Bicicleta[] bicicletas;
    int opcion;

    int referencia;
    String marca;
    String modelo;


    public AlmacenBicis(int numBicis){

        bicicletas = new Bicicleta[numBicis];
    }

    public Bicicleta[] getBicicletas() {
        return bicicletas;
    }

    public void agregarBicicletas(Bicicleta[] nuevasBicicletas) {
        for (Bicicleta nuevaBicicleta : nuevasBicicletas) {
            if (stockTotal < MAX_BICICLETAS && nuevaBicicleta != null) {
                bicicletas[stockTotal] = nuevaBicicleta;
                stockTotal++;
            } else {
                System.out.println("Error: No hay espacio disponible para agregar más bicicletas.");
            }
        }
    }

    public void addBicicleta() {
        System.out.print("Introduce la referencia de la bicicleta: ");
        int referencia = leer.nextInt();

        if (!existeBicicletaConReferencia(referencia)) {
            Bicicleta nuevaBicicleta = new Bicicleta();
            nuevaBicicleta.setReferencia(referencia);
            System.out.print("Introduce la marca de la bicicleta: ");
            nuevaBicicleta.setMarca(leer.next());
            System.out.print("introduce el modelo de la bici: ");
            nuevaBicicleta.setModelo(leer.next());
            System.out.print("Introduce el peso de la bici:");
            nuevaBicicleta.setPeso(leer.nextFloat());
            System.out.print("Introduce el tamaño de las ruedas de la bici. ");
            nuevaBicicleta.setTamanyo(leer.nextFloat());

            System.out.print("Introduce si tiene motor (si/no): ");
            String tieneMotor = leer.next();

            boolean MotorSi = obtenerMotor(tieneMotor);
            nuevaBicicleta.setMotor(MotorSi);

            System.out.println("Introduce la fecha de fabricación (DD/MM/AAAA): " );
            nuevaBicicleta.setFechaFabricacion(leer.next());
            System.out.print("Introduce el precio :");
            nuevaBicicleta.setPrecio(leer.nextFloat());


            if (stockTotal < MAX_BICICLETAS) {
                bicicletas[stockTotal] = nuevaBicicleta;
                stockTotal++;
                imprimirTabla(bicicletas);

            } else {
                System.out.println("Error: No hay espacio disponible para agregar más bicicletas.");
            }
        }
    }

    public void ventaBici(){
        System.out.print("Ingrese la referencia de venta: ");
        referencia = leer.nextInt();
        for (int i = 0; i < bicicletas.length; i++) {
            if (bicicletas[i] != null && bicicletas[i].getReferencia() == referencia) {
                bicicletas[i] = null;
                stockTotal--;
                System.out.println("Bicicleta vendida.");
                imprimirTabla(bicicletas);
            }
        }

    }

    public void consultaBici(){
        do {
            System.out.println("***********************\n" +
                    "** CONSULTA BICICLETA **\n" +
                    "***********************\n" +
                    "1.- Consultar por referencia …\n" +
                    "2.- Consultar por marca …\n" +
                    "3.- Consultar por modelo …\n" +
                    "0.- salir …");
             opcion = leer.nextInt();
             switch (opcion){
                 case 1:
                     System.out.print("Ingrese una referencia: ");
                     referencia = leer.nextInt();
                     // Imprime la cabecera de la tabla
                     System.out.println("+------------+---------+----------+---------+---------+-------+-------------+--------+-------+");
                     System.out.println("| Referencia |  Marca  |  Modelo  | Peso Kg |T. Ruedas| Motor | Fecha fabr. | Precio | Stock |");
                     System.out.println("+------------+---------+----------+---------+---------+-------+-------------+--------+-------+");

                     // Itera sobre las bicicletas e imprime solo las que coinciden con la marca
                     for (int i = 0; i < stockTotal; i++) {
                         Bicicleta refBicicleta = bicicletas[i];
                         if (refBicicleta != null && refBicicleta.getReferencia()==referencia) {
                             System.out.printf("|%-12d|%-9s|%-10s|%-9.2f|%-9.2f|%-7s|%-13s|%-8.2f|%-7d|\n",
                                     refBicicleta.getReferencia(), refBicicleta.getMarca(), refBicicleta.getModelo(),
                                     refBicicleta.getPeso(), refBicicleta.getTamanyo(), refBicicleta.isMotor(),
                                     refBicicleta.getFechaFabricacion(), refBicicleta.getPrecio(), stockTotal);
                         }
                     }
                     // Imprime el pie de la tabla
                     System.out.println("+------------+---------+----------+---------+---------+-------+-------------+--------+-------+");
                     break;


                 case 2:
                     System.out.print("Ingrese una marca: ");
                     marca = leer.next();
                     // Imprime la cabecera de la tabla
                     System.out.println("+------------+---------+----------+---------+---------+-------+-------------+--------+-------+");
                     System.out.println("| Referencia |  Marca  |  Modelo  | Peso Kg |T. Ruedas| Motor | Fecha fabr. | Precio | Stock |");
                     System.out.println("+------------+---------+----------+---------+---------+-------+-------------+--------+-------+");

                     // Itera sobre las bicicletas e imprime solo las que coinciden con la marca
                     for (int i = 0; i < stockTotal; i++) {
                         Bicicleta marcaBicicleta = bicicletas[i];
                             if (marcaBicicleta != null && marcaBicicleta.getMarca().equals(marca)) {
                                 System.out.printf("|%-12d|%-9s|%-10s|%-9.2f|%-9.2f|%-7s|%-13s|%-8.2f|%-7d|\n",
                                         marcaBicicleta.getReferencia(), marcaBicicleta.getMarca(), marcaBicicleta.getModelo(),
                                         marcaBicicleta.getPeso(), marcaBicicleta.getTamanyo(), marcaBicicleta.isMotor(),
                                         marcaBicicleta.getFechaFabricacion(), marcaBicicleta.getPrecio(), stockTotal);
                             }
                     }
                     // Imprime el pie de la tabla
                     System.out.println("+------------+---------+----------+---------+---------+-------+-------------+--------+-------+");
                     break;

                 case 3:
                     System.out.print("Ingrese un modelo: ");
                     modelo = leer.next();
                     // Imprime la cabecera de la tabla
                     System.out.println("+------------+---------+----------+---------+---------+-------+-------------+--------+-------+");
                     System.out.println("| Referencia |  Marca  |  Modelo  | Peso Kg |T. Ruedas| Motor | Fecha fabr. | Precio | Stock |");
                     System.out.println("+------------+---------+----------+---------+---------+-------+-------------+--------+-------+");

                     // Itera sobre las bicicletas e imprime solo las que coinciden con la marca
                     for (int i = 0; i < stockTotal; i++) {
                         Bicicleta modeloBicicleta = bicicletas[i];
                             if (modeloBicicleta != null && modeloBicicleta.getModelo().equals(modelo)) {
                                 System.out.printf("|%-12d|%-9s|%-10s|%-9.2f|%-9.2f|%-7s|%-13s|%-8.2f|%-7d|\n",
                                         modeloBicicleta.getReferencia(), modeloBicicleta.getMarca(), modeloBicicleta.getModelo(),
                                         modeloBicicleta.getPeso(), modeloBicicleta.getTamanyo(), modeloBicicleta.isMotor(),
                                         modeloBicicleta.getFechaFabricacion(), modeloBicicleta.getPrecio(), stockTotal);
                             }
                     }
                     // Imprime el pie de la tabla
                     System.out.println("+------------+---------+----------+---------+---------+-------+-------------+--------+-------+");
                     break;
             }
        }while (opcion !=0);
    }

    private boolean existeBicicletaConReferencia(int referencia) {
        for (int i = 0; i < stockTotal; i++) {
            if (bicicletas[i] != null && bicicletas[i].getReferencia() == referencia) {
                return true;
            }
        }
        return false;
    }
    private boolean obtenerMotor(String MotorSi) {
        return MotorSi.equalsIgnoreCase("si");
    }

    public void mostrarStockTotal() {

        System.out.println("Stock total de bicicletas: " + stockTotal);
    }

    public static void imprimirTabla(Bicicleta[] bicicletas) {
        // Método imprime la tabla, no es necesario tener una instancia de bicicletas
        System.out.println("+------------+---------+----------+---------+---------+-------+-------------+--------+-------+");
        System.out.println("| Referencia |  Marca  |  Modelo  | Peso Kg |T. Ruedas| Motor | Fecha fabr. | Precio | Stock |");
        System.out.println("+------------+---------+----------+---------+---------+-------+-------------+--------+-------+");

        for (int i = 0; i < stockTotal; i++) {
            Bicicleta currentBicicleta = bicicletas[i];
            if (currentBicicleta != null) {
                System.out.printf("|%-12d|%-9s|%-10s|%-9.2f|%-9.2f|%-7s|%-13s|%-8.2f|%-7d|\n",
                        currentBicicleta.getReferencia(), currentBicicleta.getMarca(), currentBicicleta.getModelo(),
                        currentBicicleta.getPeso(), currentBicicleta.getTamanyo(), currentBicicleta.isMotor(),
                        currentBicicleta.getFechaFabricacion(), currentBicicleta.getPrecio(), stockTotal);
            }
        }

        System.out.println("+------------+---------+----------+---------+---------+-------+-------------+--------+-------+");
    }


}
