import java.util.Scanner;

public class EjemploArreglosParesImpares {

    public static void main(String[] args) {

        //nuestro arreglo a y vamos a tener el arreglo para los pares e impares
        int [] a,pares,impares;

        //defimos las varaibles anteriores parten en cero
        int totalPares = 0;
        int totalImpares = 0;

        //a qui vamos a crear el arreglo a
        a = new int[10];

        //con la clase Sccaner
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa 10 numeros");
        //lo poblamos con un for
        for (int i = 0; i <a.length;i++){
            a[i] = sc.nextInt();
        }

        //no podemos crear el arreglo de pares e impares por que todavi no sabemos el tamaño no sabemos cuantos son pares
        //o cuantos son impares podrian ser todos pares o impares
        //entonces lo primero que tenemos que hacer es calcular cuantos son pares e impares podemos hacerlo con un contador para cada uno
        //con un contador para cada uno recorremos el arreglo y preguntamos si es par y si no es impar

        //entonces un for
        for(int i =0; i < a.length;i++){

            //calculmos si es par o impar
            if(a[i] % 2 == 0 ){
                //si es par incrementamos los pares
                totalPares++;
            }else {
                totalImpares++;
            }
        }
    //entonces ya podemos crear los arreglos de pares e impares
        //entonces pares seria totalPares
        pares = new int[totalPares];
        impares = new int[totalImpares];
    //ahora tenemos los arreglos ahora tenemos que inicializar ambos
    //es un froma muy similar al anteroir

        //crear varaibles auxiliares que nos ayudaran a cada indice de pares e impares
        int j =0;
        int k = 0;
        for(int i = 0; i<a.length;i++){
            if(a[i] % 2 == 0 ){
                //si es par incrementamos los pares
                //por cada índice de cada arreglo
                pares[j++] = a[i];
            }else {
                impares[k++] = a[i];
            }
        }
        //solo nos faltaria pintar los datos
        System.out.println("*****pares***************");
        for(int i = 0; i<pares.length;i++){
            System.out.println("pares = " + pares[i]);

        }
        System.out.println("*******impares*************");
        for(int i = 0; i<impares.length;i++){
            System.out.println("impares = " + impares[i]);

        }

    }
}
