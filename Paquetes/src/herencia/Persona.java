package herencia;

public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private String email;

    public Persona(){
        System.out.println("Persona: inicializando constructor...");
    }
    public Persona(String nombre, String apellidos){
        this.nombre=nombre;
        this.apellidos=apellidos;
    }
    public Persona(String nombre, String apellidos, int edad){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String saludar(){
        return "Hola que tal!";
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", email='" + email + '\''+
                ", saludo= "+this.saludar();
    }
}
