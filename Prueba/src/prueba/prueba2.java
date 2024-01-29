package prueba;
    public class prueba2 {
        public static void main(String[] args) {
          /*  Integer num=10;
            int n1=4;
            int n2=9;
            var n3=2.3f;
            boolean n4= true;

            String saludar="pipo";
            System.out.println(saludar.toUpperCase());
            System.out.println(num.equals(5));
            System.out.println(Byte.BYTES);
            System.out.println(Integer.max(n1, n2));
            System.out.println(n3);
            System.out.println(Float.MIN_VALUE);
            System.out.println(n4);

            String l1="oscar";
            String l2= "Oscar";
            System.out.println(l1.compareTo(l2));
            System.out.println(l1.length());
            System.out.println(l1.charAt(3-1));
            long inicio= System.currentTimeMillis();

            long fin= System.currentTimeMillis();
            System.out.println(fin - inicio);


            System.out.println("nombre.length()= "+l1.length());
            System.out.println("nombre.toUpperCase()= "+l1.toUpperCase());
            System.out.println("nombre.toLowerCase()= "+l1.toLowerCase());
            System.out.println("nombre.equals(\"oscar\")= "+l1.equals(l2));
            System.out.println("nombre.equalsIgnoreCase(\"oscar\")= "+l1.equalsIgnoreCase(l2));
            System.out.println("nombre.compareTu(\"oscar\")= "+l1.compareTo(l1));*/

            String archivo= "alguna.imagen.jpg";
            System.out.println("longitud del archivo= "+archivo.length());
            int i= archivo.lastIndexOf(".");
            System.out.println("posicion del punto= "+i);
            System.out.println("archivo.substring(i)= "+archivo.substring(i));

            String [] archivoArr=archivo.split("[.]"); // "\\."
            //int l=archivoArr.length;
            for(int j=0; j<archivoArr.length;j++ ){
                System.out.println(archivoArr[j]);
            }
            System.out.println("extension= "+archivoArr [archivoArr.length-1]);
        }
    }


