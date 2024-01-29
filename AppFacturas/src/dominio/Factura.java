package dominio;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Factura {
    private int idFolio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private DetalleFactura[] detalles;
    private int indiceDetalles;
    public static final int MAX_DETALLES = 10;
    private  static int ultimofolio;

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.detalles = new DetalleFactura[MAX_DETALLES];
        this.idFolio = ++ultimofolio;
        this.fecha = new Date();
    }

    public int getIdFolio() {
        return idFolio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public DetalleFactura[] getDetalles() {
        return detalles;
    }

    public void agregarDetallesFactura(DetalleFactura detalle){
        if(indiceDetalles < MAX_DETALLES){
            this.detalles[indiceDetalles++] = detalle;
        }
    }

    public float calcularTotal(){
        float total=0.0f;
        for(DetalleFactura detalle: this.detalles){
            if (detalle == null){
                continue;
            }
            total+= detalle.calcularImporte();
        }
        return total;
    }
    public String generarDetalle(){
        SimpleDateFormat formaFecha=new SimpleDateFormat("dd 'de' MMMM, yyyy");

        StringBuilder constructorDeCadenas=new StringBuilder();

        constructorDeCadenas.append("Factura Nº: ")
                            .append(idFolio)
                            .append("\n");

        constructorDeCadenas.append("Fecha Emision: ")
                            .append(formaFecha.format(this.fecha))
                            .append("\n");

        constructorDeCadenas.append("\nCliente ")
                            .append(this.cliente.getNombre())
                            .append("\t NIF: ")
                            .append(cliente.getNif())
                            .append("\nDescripcion ")
                            .append(this.descripcion)
                            .append("\n")
                            .append("\n#\tNombre\t€\tCant.\tTotal\n");




        for(DetalleFactura detalles: this.detalles){
            if (detalles==null){
                continue;
            }
            constructorDeCadenas.append(detalles.toString())
                                .append("\n");

        }
            constructorDeCadenas.append("\nGran total: ")
                                .append(calcularTotal());

        return constructorDeCadenas.toString();
    }

    @Override
    public String toString() {
        return generarDetalle();
    }
}
