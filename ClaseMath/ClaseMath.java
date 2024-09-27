/*/
    Clase Math y sus caracteristicas
    no se pude instanciar por que a fin de cuentas tiene final y esta palabra reservada no nos permite instnaciar
    tiene metodos estacos y constanctes
    como no tal final no nos permite instanciar una clase
    y tiene métodos estaticos lo cual siginifica qeu no se intancian se llaman directo de la clase
    ademas cumple los requisitos de una clase inmutable
 */
public class ClaseMath {

    public static void main(String[] args) {
        /*Vamos a partir por la funcion o calcular el valor el
        * valor absoluto de un número de un entereo ya sea positivo o
        * negativo */

        //declaramos la variable
        //Math.abs() --> de la casle Math de java.lang
        //este método recibe un entero por ejemplo -3
        int absoluto = Math.abs(-3);
        //y retornar el valor absoluto de un número vamos a imprmiri
        System.out.println("absoluto = " + absoluto);

        // y si es positivo volvemos a invocar al cariable
        absoluto = Math.abs(2);
        System.out.println("absoluto = " + absoluto);


        //otros metodos en la clase Math por ejemplo Maximo entre dos números pueden ser decimlaes
        //como el double o float o del tipo entero
        double maximoDouble= Math.max(2.2,1.1);
        System.out.println("maximoDouble = " + maximoDouble);

        //tabmien tenemos el minimo
        double minimoDouble= Math.max(2.2,1.1);
        System.out.println("minimoDouble = " +  minimoDouble);

        //otro metodo que podmos usar es celi va a redondear hacia adelnate
        //Math.ceil() ==> redondea hacia adelante

        double redondear = Math.ceil(5.5);
        //pintamos
        System.out.println("redondear = " + redondear);

         //ahora como redondear hacia abajo
        double  redondeaAbajo = Math.floor(8.5);

        System.out.println("redondeaAbajo = " + redondeaAbajo);

        //y como redodondear un valor decimal
        long enteroRedondeo = Math.round(5.7);
        //no redondea el decimal simplemente un valor entero recibe un float o un double
        System.out.println("enteroRedondeo = " + enteroRedondeo);

        //redondear PI
        long redondearPI = Math.round(Math.PI);
        System.out.println("redondearPI = " + redondearPI);

        //metodo para elevar al cuadrado exp
        double exp = Math.exp(4);
        System.out.println("exp = " + exp);

        //ahora con el logaritmo
        double log =  Math.log(23);
        System.out.println("log = " + log);

        //elevar la potencia de un número
        double potencia = Math.pow(10,4);
        System.out.println("potencia = " + potencia);

        //raiz cuadrada
        double raiz = Math.sqrt(125);
        System.out.println("raiz = " + raiz);
        //convertir radianez a grados
        double radianes = Math.toDegrees(1.51);
        //redondear el resultado
        radianes = Math.round(radianes);
        System.out.println("radianes a grados = " + radianes);
        //de grados a radianes
        double grados = Math.toRadians(90);
        System.out.println("grados a radianes = " + grados);
        //funciones trigonometricas
        System.out.println("sin(90) = " + Math.sin(radianes));
        System.out.println("cos(90) = " + Math.cos(radianes));
        //convertir 180 grados en radianes
        radianes  = Math.toRadians(180);
        System.out.println("cos(0) = " + Math.cos(radianes));

    }



}
