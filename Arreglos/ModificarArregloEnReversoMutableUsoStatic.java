/*
*
* Aqui tambén vamos a mutar nuestro arreglo péro con un metodo estaticos
*
* */

import java.util.Arrays;
import java.util.Collections;

public class ModificarArregloEnReversoMutableUsoStatic {

    public static void mutableDecendente(String []decendente){
        //antes de eso vamos a alamcenar en int nuestro array esto con el para que sea más sencillo
        int totalArrays = decendente.length;
        //primero un bucle for}
        //dividimos entre /2 ==> el total
        for (int i = 0; i< totalArrays/2;i++){
            //primero declaramos una varailbe de tipo String
            //vaso a llamarle primero por que es le primer elemento y asi mas facil de identificar
            //con el indice recordemos que emepzamo desde 0 ... n
            String primerElemento =   decendente[i];
            //ahors declaramos con el ultimo elemnto String ultimo elemento
            //este va a requerir  de una operacion que es el total menos el indice menos uno
            String ultimoElemento =   decendente[ totalArrays - i - 1];
            //ahora alamcenamo el ultimoElementto en decendente[i] osea en el primer elemento
            decendente[i] = ultimoElemento;
            //y ahora el  ultimoElemento en el primerElemento 
            decendente[totalArrays -i -1] = primerElemento;
        }


    }
    //podemos crear nuestra propia funcion para ordenarlos de manera alafabetica
    public static void mutableordenamiento(String [] orden){
            int numerdosOrden = orden.length;
            //esta varaible nos va a auxiliar para nuestro ordenamiento
            //alamacenaremos temporalmente nuestro indice j
            String temp;
            for(int i = 0;i< numerdosOrden;i++){
                for(int j = i;j< numerdosOrden;j++){
                    //decimos que si el indice j es mayor que el indice i
                    //charAt(0) en este caso se usa charAt() ==> indicamos el cracter donde emepsamos
                    if(orden[j].charAt(0) < orden[i].charAt(0)){
                        temp = orden[j];
                        orden[j] = orden[i] ;
                        orden[i] =temp;
                    }
                }
            }
    }

    //otra manera de hacerlo con otra varaible int decremetnandolo dentro del arreglo en vez de divir el total
    public static void mutableDecendenteArray(String[] descendente){
        int arreglo = descendente.length;
        //en vez de diviri arreglo entre 2 vamos a decrementar  -- para que sea mas simple
        int decrementoArreglo = descendente.length;
        //lo importante es que vaya decrementanto en el punto de inflexion
        for(int i = 0; i<decrementoArreglo ; i++){
            //declaramso un inicio donde inicia nuestro array
            String inicio = descendente[i];
            //declaramos el  fin de nuestro arreglo para eso restamos a nuestro arrelo la  iteracion menos 1
            String fin = descendente[arreglo - i -1];
            //jugamos con el inicio al fin en este caso vamos a pasaron del inicio al fin
            //recordemos que descendente[i] ==> es el inicio
            descendente[i] = fin;
            //a quii vamos del fin al inicio
            //recordemos que descendente[arreglo -i-1] ==> es el fin
            descendente[arreglo -i-1] = inicio;
            //por ultimo decrementamos para que podamos ir del inicio al final vamos hacia el punto de inflexion
            decrementoArreglo--;
        }

    }

public static void main(String[] args) {
        String [] productos  = {"Samsung TV","Samsung Galaxy A72","Audifonos","Ps5","Xbox series x","Aleinware Laptop",
                "Xaomi phone",};

        int totalProductos = productos.length;

        System.out.println("******imprmido sin un orden imprmidos en forma decendente****");
        //usamos nuestro metodo estatico
        //para ordenar nuestro arreglo de productos
        mutableDecendente(productos);
        for (int i = 0; i< totalProductos;i++){
            System.out.println("productos[i] = " + productos[i]);
        }

        //imprimir de forma decendente
        System.out.println("forma decendente ********************");

        //invocamos nuestro prpio método
        mutableDecendente(productos);
        for (int i = 0; i< totalProductos;i++){
            System.out.println("productos[i] = " + productos[i]);
        }

    System.out.println("*********************mostrando un play list de mis caciones en un arreglo*********************+");

//un nuevo array con mi playlist de canciones
    String [] canciones = {"Nirvana - The Man Who Sold The World","Coldplay - The Scientist ","ZZ Top - La Grange","The Hollies - Long Cool Woman ",
            "The Doors  Break on Through","Santana - Oye Como Va","Hurricane Jane","Greenback Boogie","Don't Dream It's Over","The Final Countdown"};

    //usamos el por each para mas rapido para ete caso
    for(String mostrarRolas:canciones){
        System.out.println("mostrarRolas = " + mostrarRolas);
    }

    //las vamos a ordencar
    System.out.println("***********************+ordenando mi playlist con la funcion que hicimos************************");
    //podemos reutilizar el método las veces que queramos
    mutableordenamiento(canciones);
    for(String mostrarRolas:canciones){
        System.out.println("mostrarRolas = " + mostrarRolas);
    }
    System.out.println("***********************+orden decendete************************");
    mutableDecendenteArray(canciones);
    for(String mostrarRolas:canciones){
        System.out.println("mostrarRolas = " + mostrarRolas);
    }
    }
}

