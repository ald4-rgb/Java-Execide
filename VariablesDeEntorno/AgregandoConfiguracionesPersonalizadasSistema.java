/*
* La idea es configurar nuestros propios parametros configuraciones
* personalizar
* Hay doas formas uno crear un archivo de propiedad de extensión properties
* otro es asignar via metodo del objeto properties
*
*
* para el primer ejemplo vamos a crear un archivo en esta caprte llamado config.properties
* toda configueracion en los archivos properties del sistema van con un nombre y se le asigna
* un valor por ejemplo config
* paralabras conmuestas se separan con punto se escribe todo en minuscula sin acentos ni ñ
* sin caracteres especiales
* config.puerto.servidor =  8088
*
* agregar configuraciones del archivo properties
*
* */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AgregandoConfiguracionesPersonalizadasSistema {
    public static void main(String[] args) {

        //para ello tenemos que crear la instancia de una clase FileInpuStream que se encarga de leer
        //este archivo y obtiene el constenido pero en formato byte pero obitene los bytes de este archivo
        // y se lo pasamos al objeto properties a nuestro objeto properties del sistema en realidad
        //cargamos el archivo
        //FileInputStream : viene de flujo de datos por lo tanto a qui se procesan los bytes
        //nos marca un error por que podria ocurrir ya que ese archivo no se encuentre no existe
        //entonces nos pide y nos obliga a manejar el
        try{

            FileInputStream  leerArchivo = new FileInputStream("VariablesDeEntorno/config.properties");

            //y tenemos que agregarlo a un objeto propesties
            //a nuestro properties le vamos a agregar todas las configuracioens que tenemos del sistema
            //entonces de esta forma cargamos la configuracion del sistema
            //pero ademas le agregamos las nuvas configuraciones del archivo
            Properties properties = new Properties(System.getProperties());
            //las cargamos properties.load(leerArchivo)
            //pero load nos pide manejar un error IOException error de entrada y salida
            properties.load(leerArchivo);
            //podemos agregar mediante el metodo set del objeto properties.setProperty(
            //muy parececido a los que tenemos en nuestro archivo
            //un nombre y un valor
            properties.setProperty("mi.propiedad.personalizada","Mi informacion guardada en el objeto properties");
            System.setProperties(properties);
            //obtener una propiedad personalizada
            Properties ps = System.getProperties();
            //listamos las variables de entorno para pintarlas en la cosola
            //personalizamos nuestras propiedades
            System.out.println("ps.getProperty(...) = " + ps.getProperty("mi.propiedad.personalizada"));
            //peero tambien dierectamente de System por que ya esta actualizado
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("otra"));
            System.out.println(System.getProperty("confi.texto.ambiente"));
            System.out.println(System.getProperty("confi.autor.email"));
            //por ejemplo si quiero listar las configuraciones del sistema
            ps.list(System.out);
            //podemos aplicar la Excepetion de forma generia
            //Exception se aplica para cualquiero objeto de expcepcion
        }catch(Exception e){
            //menaje de error controlado
            //una atributo estatico
            System.out.println("El sistama no puedo encontrar el archivo"+e);
            //otro método que podemos implementa es
            //este funciona cuando sale todo bien es 0 y cuando sale mal es distinto de cero
            //entonces con exit uno salimos del programa

            System.exit(1);
         //entonces si todo sale bien otra senencia otro algoritmo y continuar con un flujo
            //pero si ocurre un error simplemente nos salimos
        }






    }
}
