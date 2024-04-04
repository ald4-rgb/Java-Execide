/*igual que el anterior pero a qui le agregamos menos la iteracion al 
 * 
 * segundo for 
 * 
 * y si a qui lo usamos con metodos estaticos para no instanciar
 * 
 * Y otro metodo don apliquemos polimosrfimos pero con dos parametros osea vamos a combinar nuestrso arrays
 * a poblar nuestro a rrat 
 */
public class IEsimoNumero2 {

    public static void IEsimo(int[] numeros) {
        // a qui solo retamos la iteracion es similar al dividirlo entre 2
        for (int i = 0; i < numeros.length - i; i++) {
            System.out.print(numeros[i] + " ");
            // realizamos la operación para pasar del primero al ultimo osea numeros.length
            // menos iteracion menos uno
            System.out.println(numeros[numeros.length - i - 1]);

        }
    }

    public static void IEsimo(int[] arreglo1, int[] arreglo2) {
        // a qui solo retamos la iteracion es similar al dividirlo entre 2

        // varaible parac auxiliarno ya que el arreglo1 es dueño de la primera iteracion

        int aux = 0;

        for (int i = 0; i < arreglo1.length - i; i++) {
            // arreglo y vamos postincremetnando por que emepezamos en cero
            // primero iteramos
            arreglo2[aux++] = arreglo1[i];
            // luego realizamos la operacion
            arreglo2[aux++] = arreglo1[arreglo1.length - i - 1];
        }
    }


    public static void main(String[] args) {

        int[] numeros = new int[10];
        int[] poblirNumeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            // imprimimos normalmente la lista de números
            // 7normalmente cuando es de
            // poblarlos
            numeros[i] = i + 1;
            System.out.print(numeros[i] + ",");
        }

        System.out.println("\n*****mostrados con iesimos usanso numeros.length - iteracion*********");
        // mandamos a llamar el metodo

        IEsimo(numeros);
        System.out.println("\n*****Segunda parte para combinacion de arreglos*********");
        IEsimo(numeros, poblirNumeros);
        for (int i = 0; i < poblirNumeros.length; i++) {
            System.out.println("i= " + i + "\spoblarnum:\s" + poblirNumeros[i]);
        }

    }

}
