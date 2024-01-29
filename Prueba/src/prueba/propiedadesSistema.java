package prueba;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class propiedadesSistema {
    public static void main(String[] args) throws FileNotFoundException {
       /* String usuario_Equipo= System.getProperty("user.name");
        System.out.println("usuario_Equipo = " + usuario_Equipo);

        String ruta_home=System.getProperty("user.home");
        System.out.println("ruta_home = " + ruta_home);

        String ruta_workspace=System.getProperty("user.dir");
        System.out.println("ruta_workspace = " + ruta_workspace);

        String version_java=System.getProperty("java.version");
        System.out.println("version_java = " + version_java);

        System.out.println("----------------------------------");
       // Properties propiedades_pc=System.getProperties();
       // propiedades_pc.list(System.out);
            */

        try{
            FileInputStream archivo = new FileInputStream("src/config.properties");

            Properties p= new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("","");
        }catch(Exception e){
            System.out.println("no existe el archivo =" + e);
        }
    }
}
