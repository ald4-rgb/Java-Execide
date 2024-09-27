/*
*
* La idea es mutar el arreglo en si que sea mutable
*
*   Esta es una manera este es una manere
* */


import java.util.Arrays;

public class ModificarArregloEnReversoMutable {
    public static void main(String[] args) {

        String [] productos  = {"Samsung TV","Samsung Galaxy A72","Audifonos","Ps5","Xbox series x","Aleinware Laptop",
                "Xaomi phone",};
        //otra forma mas simplifcada y recomendada
        int totalProductos = productos.length;

        //usamos el ordenamiento
        Arrays.sort(productos);

        for (int i = 0; i <totalProductos ;i++){
            //como es un strin y es opracion aritmetica usamor los parentesis()
            System.out.println("por índice "+i+" :"+productos[i]);

        }
        System.out.println("********mutando nuestros arreglo********************");

        //ahora la idea es modificar los datosel arreglo obtenido
        //este arreglo es mutable estamos modificando el arreglo
        //hay que poner el punto de quierbe el punto de inflexion que ordene hasta la mitad
        //al final empieza a revertir lo que habiamos hecho anterioirmente  el orden inverso
        // si dividimos totalProductos en 2
        for (int i =0; i< totalProductos/2;i++){
            //lo primero es obtener el elemento actual del indice en cuestión
            //obtenemos el elemeto
            String actual = productos[i];
            //y tambien obtenemos el ultimo mas que ultimo el invero
            //con esta formula obtenemos el ultimo lelemnteo de nuestro array
            String inverso = productos[totalProductos -1 -i];
            //entonces la idea es colocar el ultimo elemento osea el inverso en la pocicion del primero y el promero al ultimo osea el actual
            //entonces producutos[i] = inverso;
            productos[i] = inverso; //asi colocamos el ultimo hacia el primer elemnto del array
            productos[totalProductos -1 -i]= actual; //asi colocamos el primeros hacia el ultimo elemnto del array

        }

  //lo mostramos de forma decedente modificando los indices la estructura interna del arreglo mutandolo pero tiene
        //que ser hasta el punto de quiebre que es justamente la mitad por que si no empieza a revertir el rodenamiento
        //el proceso de inversa que hizo
           for (int i = 0; i <totalProductos ;i++){
            //como es un strin y es opracion aritmetica usamor los parentesis()
            System.out.println("por índice "+i+" :"+productos[i]);

        }

    }
}
