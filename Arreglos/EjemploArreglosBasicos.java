public class EjemploArreglosBasicos {
    public static void main(String[] args) {

        int[] num = new int [4];

        //asignar valor a nuestros arrays
        num[0] = 12;
        //incluso podriamos usar un Integer
        //vlueOf() --> es para crear una instancia del tipo Integer crea una referencia
        //Integer.valueOf("11"); podemos transformalo de froma automatica con el valeOf()
        //entonces de fromar automatica se hace un autoboxing es decir convierte a un tipo de
        //referencia a un tipo primitivo autoboxing
        num[1] = Integer.valueOf("11");
        //tambien podriamos hacerlo foranso por ejemplo si yo quisiera que fuera del tipo Long
        //si le agrego la l 55l darai erroe lo que podriamos hacer es un cast podriamos forzarlo
        // tiene que ser un tipo de dato compatible (int) 58L
        num[2] = (int) 58L;
        num[3] =  -8;

        int i = num[0];
        int j = num[1];
        int k = num[2];
        //ahora como podemos obtener el ultimo dato del arreglo esto se hace con length que es la longitud de nuestro array
        //de froma explicita sabemos que es 3 para que sea más dinamico usamos el atributo length pero el length nos
        //retorna la cantidad deelementos que es 4  pero al colocar 4 se desborda la mamoeria entonces para que eso no suceda
        //lo restamos con -1
        //entonces es el total de elementos  -1
        int s = num[num.length - 1 ];
        
//esto no se devbe hacer por que se desborda la memoria  pararecesaa este error ArrayIndexOutOfBoundsException
//       int m = num[4]};
        //deben ser 0 todos
        System.out.println("k = " + k);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("s = " + s);
    }
}
