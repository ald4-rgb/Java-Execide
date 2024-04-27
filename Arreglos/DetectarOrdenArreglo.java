/*
*   Ejemplo si un arreglo esta ordenado de forma acendente o bien si esta desordenado
*
* */

import java.util.Scanner;

public class DetectarOrdenArreglo {
    public static void main(String[] args) {

        //iniciamos con un arreglo de entero y comparmos los siguietnes números si estan ordenados de alguna
        //forma  o no , esto se aplica también a string o a cualquier tipo de  objeto que sean ordenables puede ser
        //que implemente la interfaz comparable por ejemplo de 7
        int [] a = new int[7];

        Scanner sc = new Scanner(System.in);

        //que ingrese los números por teclado
        System.out.printf("Ingrese 7 números:");

        //un for para poblar estos datos  
        for (int i = 0; i <a.length ; i++) {
            //entonces por cada elemento del arreglo vamos preguntando si con la clase Scanner
            //vamos preguntado y vamos creando este arreglo
            a[i] = sc.nextInt();
        }

        //tenemos que recorrer y preguntar del arreglo es mayor o menor
        //entonces si es mayor que el siguiente esta en order decendente pero si es menor esta en orden acendente

        //hay algunos que estarán desordenados
        //tiene que ser el total - 1 por que
        //vamos a comparar con el elemento siguiente

        //declaramos si son acentenes y decendentes como booleano
        boolean acendente = false;
        boolean descendente = false;


        for (int i = 0; i< a.length - 1;i++){
        //comparamos si es mayor que el siguiente arreglo mas uno
        //uso el boolean para hacer un cast
            if(a[i] > a[i + 1]){
                acendente = true;
            }
            if(a[i] < a[i + 1]){
                descendente = true;
            }

        }
        //por ultimo comparamos si estan ordenados de forma acendente odecendente
        if(acendente == true && descendente == true){
            System.out.printf("Arreglo : desrodenado");
        }
        if(acendente == false && descendente == false){
            System.out.printf("Arreglo: todos son iguales");
        }
        if(acendente == true && descendente == false){
            System.out.printf("Arreglo: todos son acendente");
        }
        if(acendente == false && descendente == true){
            System.out.printf("Arreglo: todos son decendente");
        }


    }
}
