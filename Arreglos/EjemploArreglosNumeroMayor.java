import java.util.Scanner;

public class EjemploArreglosNumeroMayor {

    public static void main(String[] args) {
        //entonces un arreglo de enteros de 5 elementos
        int [] arrA = new int[5];

        //usamos la clase Scanner e instanciamos
        Scanner sc = new Scanner(System.in);

        //antes de todo vamos a pedir los datos
        System.out.println("Ingrese 5  enteros ");

        //ahora con un for vamos a llenar nuestro array
        for (int i = 0; i < arrA.length ; i++) {
            //entonces por cada elemento de arrA pasamos el indice y preguntamos pedimos el valor
            //con la consola
            arrA[i] = sc.nextInt();
        }

        //la idea es calcular el números mayor para eso necesitamos una variable auxiliar
        //del tipo primitivo por defecto cero
        //esta varaible va a guardar el indice del número mayor
        //primero va iterando va preguntando si es mayor  para simplificar podemos utilizar
        //el operador ternario  entonces en mas vamos guardando el indice que corresponde al número mayor
        //y mediante al indice ya sabemos cual es número
        int max = 0;
        //este segundo for es para preguntar y vamos claculando el número mayor
        //aqui partimos en uno
        for (int i = 0; i < arrA.length ; i++) {
            //vamos a asumir que el maximo es cero
            //y preguntamos si el indice cero es mayor que el siguiente
            //si es mayor entonces retornamos max
            //de lo contrario max es el indice actual de la iteración
//            max = (arrA[max] > arrA[i]) ? max:i; //--> este es con ternario
//traducido a if
            if(arrA[max] > arrA[i]){max = max;}else {max = i;}

        }
    //imprmimimos pero max lo tenemos atravez del arrA
        System.out.println("arrA[max] = " + arrA[max]);
    }
}
