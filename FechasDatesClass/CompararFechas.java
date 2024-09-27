import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Como comparar fechas si una es mayor que otra o una despues o antes la otra
 *
 */

public class CompararFechas {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat custom = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese una fecha con formato 'yyy-MM-dd' ");
        try {
            Date fecha = custom.parse(sc.next());
            //pintamos al fecha
            System.out.println("fecha ==>".concat(String.valueOf(fecha)));
            
            //como se haria la tranformacion
            System.out.println("personalizacion ==>" + custom.format(fecha));

            //vamos a tener otra fecha para la fecha actual
            //entonces en la fecha2 seria la fecha actual
            /*otra manera de crearlo sin cambiar ningun parametro
            Calendar fechaActual = Calendar.getInstance();
            fechaActual.getTime();*/
            Date fecha2 = new Date();
            System.out.println("fecha2  = " + fecha2);
            //vamos a comparar las fechas con el metodo after 
            //entonces si la feha es mayor o despues que fecha2
            if (fecha.after(fecha2)) {
                //vamos a imprimir fecha1 o del usuario 
                System.out.println("Fecha1 del usuario es superoir que fecha2 actual");
            //puede ser anterioir o menor que la fecha actual 
            }else if(fecha.before(fecha2)){
                System.out.println("fecha 1 es anteroir que fecha 2 ");

                //podrian ser iguales
            }else if (fecha.equals(fecha2)) {
                System.out.println("fecha es igual a fecha 2");
            }
//podemos usar otra manera de comparar las fechas usande el método compareTo

            //compara mos fecha con fecha2 si este resultado retorna un valor númerico
            //un entero un Integer si es resultado de esta comparación es mayor que 0
            // es poque fecha es mayor a fecha2  por lo tanto es despues

            System.out.println("********otra manera de hacerlo manera 2 *******************");
            if(fecha.compareTo(fecha2) > 0) {
                System.out.println("Fecha1 del usuario es superoir que fecha2 actual");
             //si el valor es negativo es un entero negativo entonces fecha es anterior que fecha2
            } else if (fecha.compareTo(fecha2) < 0 ) {
                System.out.println("fecha 1 es anteroir que fecha 2 ");
            //si es igual a cero
            }else if (fecha.compareTo(fecha2) == 0 ){
                System.out.println("ambas fechas son iguales");
            }

        } catch (ParseException e) {
            //e.printStackTrace(); //descomentar si funciona
            //vamosa usar como ejemplo con la clase Systym
            //usamos System.err.println("");
            System.err.println("El formato de la fecha tiene un formato incorrecto"+e.getMessage());
            System.err.println("El formato de la fecha tiene un formato incorrecto");
            //tambien podemos usar System.exit
            // System.exit(1); //descomentar si funciona solo con el status 1
            //invocando de nuevo el main se vuelve a ejecutar
            main(args);

        }

    }

}
