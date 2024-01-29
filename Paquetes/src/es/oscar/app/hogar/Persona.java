package es.oscar.app.hogar;

public class Persona {
     private String nombre;
     private String apellidos;
     private ColorPelo colorPelo;

     public static final String GENERO_MASCULINO = "Masculino";
     public static final String GENERO_FEMENINO = "Femenino";

     public String getNombre() {
          return nombre;
     }

     public void setNombre(String nombre) {
          this.nombre = nombre;
     }

     public String getApellidos() {
          return apellidos;
     }

     public ColorPelo getColorPelo() {
          return colorPelo;
     }

     public void setColorPelo(ColorPelo colorPelo) {
          this.colorPelo = colorPelo;
     }

     public void setApellidos(String apellidos) {
          this.apellidos = apellidos;
     }

     public String lanzarPelota(){
          return "lanzar pelota al perro!!";
     }

     public static String saludar(){
          return "hola que tal";
     }


}
