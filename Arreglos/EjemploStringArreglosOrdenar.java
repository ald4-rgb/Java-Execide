import java.lang.reflect.Array;
import java.util.Arrays;

public class EjemploStringArreglosOrdenar {
    public static void main(String[] args) {

        //entonces empesamos con arreglo de productos del tipo String
        //la cantidad de elementos  cuando se declara un arregl oel corchete puede ir
        //al principio o al final String productos [] o al prinicipio String [] productos
        String []productos  = new String[7];

        //si queremos pintar nuestrosp productos estaran en null
        productos[0] ="Samsung TV";
        productos[1] ="Samsung Galaxy A72";
        productos[2] ="Audifonos";
        productos[3] ="Ps5";
        productos[4] ="Xbox series x";
        productos[5] ="Aleinware Laptop";
        productos[6] ="Xaomi phone";
        //productos[7] ="Samsung TV"; ---> este desborda la memoria
///esta es una manera de hacerlo esto seria con arreflo indice productos[1] --> indice arralo
        System.out.println("************************************esta es una manera de hacerlo esto seria con arreflo indice productos[1] --> indice arralo "+"\n");
        System.out.println("productos[0] = " + productos[0]);
        System.out.println("productos[1] = " + productos[1]);
        System.out.println("productos[2] = " + productos[2]);
        System.out.println("productos[3] = " + productos[3]);
        System.out.println("productos[4] = " + productos[4]);
        System.out.println("productos[5] = " + productos[5]);
        System.out.println("productos[6] = " + productos[6]);

//otra manera de manera indivirual akacenando por variable String prodcuto1 = producto[0]

        System.out.println("************************************otra manera de manera indivirual akacenando por variable String prodcuto1 = producto[0]"+"\n");

        String producto1 = productos[0];
        String producto2 = productos[1];
        String producto3 = productos[2];
        String producto4 = productos[3];
        String producto5 = productos[4];
        String producto6 = productos[5];

        System.out.println("producto1 = " + producto1);
        System.out.println("producto2 = " + producto2);
        System.out.println("producto3 = " + producto3);
        System.out.println("producto4 = " + producto4);
        System.out.println("producto5 = " + producto5);
        System.out.println("producto6 = " + producto6);

//ahora vamos a ordenar este ejemplo de forma alafabetica  elementos del String realizar un sort es decir que ordene de forma natural
// de froma alafabetica los elementos del arreglo
        System.out.println("*************************ordenamiento************* ");

        //para eso podemos usar la clase Arrays que es una helpers de java.util
        Arrays.sort(productos);

        String orden1 = productos[0];
        String orden2 = productos[1];
        String orden3 = productos[2];
        String orden4 = productos[3];
        String orden5 = productos[4];
        String orden6 = productos[5];

        System.out.println("orden1 = " + orden1);
        System.out.println("orden2 = " + orden2);
        System.out.println("orden3 = " + orden3);
        System.out.println("orden4 = " + orden4);
        System.out.println("orden5 = " + orden5);
        System.out.println("orden6 = " + orden6);

        System.out.println("******************Por ultimo vamos a ordenar números");


        int [] numeros  = new int[8];

        numeros[0] = 88;
        numeros[1] = 33;
        numeros[2] = 22;
        numeros[3] =  9;
        numeros[4] = 44;
        numeros[5] = 0;
        numeros[6] = 2;
        numeros[7] = 1;

        Arrays.sort(numeros);
        int menorMayor1 = numeros[0];
        int menorMayor2 = numeros[1];
        int menorMayor3 = numeros[2];
        int menorMayor4 = numeros[3];
        int menorMayor5 = numeros[4];
        int menorMayor6 = numeros[5];
        int menorMayor7 = numeros[6];
        int menorMayor8 = numeros[7];

        System.out.println("menorMayor = " + menorMayor1);
        System.out.println("menorMayor = " + menorMayor2);
        System.out.println("menorMayor = " + menorMayor3);
        System.out.println("menorMayor = " + menorMayor4);
        System.out.println("menorMayor = " + menorMayor5);
        System.out.println("menorMayor = " + menorMayor6);
        System.out.println("menorMayor = " + menorMayor7);
        System.out.println("menorMayor = " + menorMayor8);
    }
}
