/*
* La idea es tener un arreglo de enteros  de 10 elelementos por ejemplo de 1 a 10  y mostrar en un roden determinado
* por ejemplo mostrar el primero con el ultimo en la primera iteracion en la segunda iteracion mostrar el segundo con
* el penultimo en la tercera con el antepunultimo es decir mostrar el i.esimonumero por el principio y por el fina
*
* */
public class IEsimoNumero {
    public static void main(String[] args) {
        //n nuevo arreglo de tampoño 10
        int [] numeros = new int[10];
        //ahora como podemos crear un segundo arreglo
        //para guardar los elementos en el orden que ya teniamos
        //es decir poblocar este nuevo arreglo con los datos intercalados
        int [] arreglo2 =  new int[10];



        //lo inicizalizamos por defecto el cero es un valor de enteros primitivos y
        //cuando no se inicializa por defecto es cero
        //para guardar los elementos
        for (int i = 0;i < numeros.length;i++){
            //vamos a guardar el valor de i de cada iteración en nuestro array
            //recordemos partimos en cero pero para que empecemos desde el uno le suammos 1
            //cada iteracion le suma uno
            numeros[i] = i + 1;
        }




        //entonces otro for para poder iterar el anterior la idea es poder mostras el primero con el ultimo en pares
        //luego en la siguiente iteracin mostrar el segundo con el penultimo y el tercero con el antepenultimo
        for(int i = 0; i< numeros.length;i++){
            //como podemos implementarlo como podemos implementarlo
            //primero para pintar en la consola primero némeros vamos a mostrar el primer elemento
            //a qui mostramos del 1 al 10
            System.out.println( numeros[i]);
        }

        System.out.println("***********impresion de elementos*********************");
        //la idea es mostrar  por pares en la primera iteracióh es mostrar el 1 y el 10 de ambos extremos del arreglo
        for(int i = 0; i< numeros.length/2;i++){
            System.out.print(numeros[i]+" ");
            //a qui seria el ultimo elemento  es numerso.length - 1 - i
            //si ejecutamos no estaria correcto repite podriamos dividr numeros.lenth/2
            //se esta mostrando el se muestra en pares intercalados es decir estamos mostrando el iesimo por el principio
            //también por el finla
            System.out.println(numeros[numeros.length-i-1]);
        }
        System.out.println("***********combinacion de arreglos*********************");

        //nos auxiliamos en una varaible
        int aux = 0;
        for(int i = 0; i< numeros.length/2;i++){
            //vamos incrementado no usamos i por que es la iteracion de numeros por eso nos auxiliamos en una varaible externa
            arreglo2[aux++] = numeros[i];
            arreglo2[aux++] = numeros[numeros.length- i -1];
        }
        //ahora imprimimos en otra iteracion con nuestro segtundo arreglo
        for(int i = 0; i < arreglo2.length;i++){
            System.out.println("i = " + i +" ,arreglo2 :"+arreglo2[i]) ;
        }
    }
}
