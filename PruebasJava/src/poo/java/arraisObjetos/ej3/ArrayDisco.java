package poo.java.arraisObjetos.ej3;

public class ArrayDisco  {
    private Disco[] discos;

    public ArrayDisco ( int num) {
        discos = new Disco[num];
    }

    public void agregarDisco(int codigo, String autor, String titulo, String genero, int duracion){
        for (int i=0;i< discos.length; i++){
            if (discos[i]==null){
                discos[i]=new Disco( codigo, autor, titulo, genero, duracion);
                System.out.println("Disco '" + titulo + "' agregado con éxito.");
                System.out.println(toString());
                return;
            }
        }
        System.out.println(" ");
        System.out.println("No hay espacio disponible para agregar más discos.");
        System.out.println(" ");
    }

    public void modificarDisco( int codigo, String autorNuevo, String tituloNuevo, String generoNuevo, int duracionNuevo){
        for (int i=0;i< discos.length; i++){
            if (discos[i]!=null && discos[i].getCodigo()==codigo){
                discos[i].setAutor(autorNuevo);
                discos[i].setTitulo(tituloNuevo);
                discos[i].setGenero(generoNuevo);
                discos[i].setDuracion(duracionNuevo);
                System.out.println("Información del disco con codigo " + codigo + " modificado con éxito.");
                System.out.println(toString());
                return;
            }
        }
        System.out.println(" ");
        System.out.println("No se encontró el disco con código " + codigo + " en la lista.");
        System.out.println(" ");
    }

    public void eliminarDisco(int codigo){
        for (int i = 0; i < discos.length; i++) {
            if (discos[i] != null && discos[i].getCodigo() == codigo) {
                System.out.println("Disco '" + discos[i].getTitulo() + "' eliminado con éxito.");
                discos[i] = null;
                System.out.println(toString());
                return;
            }
        }
        System.out.println(" ");
        System.out.println("No se encontró el disco con codigo" + codigo + " en la lista.");
        System.out.println(" ");
    }

    public void listaDisco(){
        for (Disco disco:discos){
            if (disco !=null){
                System.out.println(toString());
                return;
            }
        }
        System.out.println(" ");
        System.out.println("No se encontró ningún disco, por favor agregue un disco");
        System.out.println(" ");
    }

    @Override
    public String toString() {
        String resultado = "Lista de Discos:\n";
        for (Disco disco : discos) {
            if (disco != null) {
                resultado = resultado + disco.toString() + "\n";
            }
        }
        return resultado;
    }

}
