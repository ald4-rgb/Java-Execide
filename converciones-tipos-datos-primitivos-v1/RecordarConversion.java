/*este es un pequeño recordatrio de nuestra tranfromacion de datos en java 
 * 
 * usando los metodos toString() y parse();
 * 
 * como recordatorio parse siempre como parametro recibira un tipo String por que vamos a tranformar 
 * un timpo  String a tipo Integer,Double,Float o tipo de datos primitivo
 * 
 * por su parte toString nos permite transformar de String a un tipo numeros osea clases como Double
 * Integer,Float,Char y true false Bolean al igual que los tipos de datos primitivos
 * 
 */


public class RecordarConversion {
 
    public static void main(String[] args) {
        String enteroStr = "40";
        Integer enteroTransInt = Integer.parseInt(enteroStr);

        System.out.println("************con parseInt()***************\n"
        +"transofromacion con parseInt(str); =>>"+enteroTransInt);
        
        String nuevoStrInt = Integer.toString(enteroTransInt);

        System.out.println("\n************con parseInt()***************\n"+
        "transofromacion con toString() =>>"+nuevoStrInt);
        
    }
}
