/*
*
* Vamos a implementar el codigo de manera explicita
* haremos nuestro prpio algoritmo de forma manual para poder ordenar el arreglo
* muy parecido al del método sort del  Array.sort();
* en este de algoritmo se comparan y se van ordendo por lo tanto se comparan y se van ordenando
* si estan desordenadas  o en el orden equivocado se van intercambiando de posicionamiento
* por lo tanto vasn subiendo de nivel en el arreglo a medida que se van ordenando como
* si fueran burbujas pero es necesario iterar varias veces
*
*   ¿Como se van comparando como se van ordenando?
*
*   Cualquier boejto en java se puede comparar siemrep y cuando implemente la interfaz comparable
*   en el caso de los String y tipo númericos de Java el Integer el float el double  todo implementa
*   su interfaz de forma automatica ya vienen por diseño de esa forma
*
* */

public class MetodoBurbuja {

    //Creamos un un método estatico que realice el algoritmo burbuja
    public static void burbuja(String []orden){
            //generamos una varaible tipo int para simplificar
            int datos = orden.length;

            //iteracion nuestro array
            //contador de cuantas veces iteramos
            //recrodemos que hay que inicializarlo
            int iteracion=0;
            
            for(int i= 0;i< datos;i++){
                //importanten realizar la operación para desbordar la memoria es datos menos iteracion meno 1
                for(int j= 0; j <datos - i -1;j++){
                    //realizamo el ordenamiento comparamos si orden[j + 1]  con orden[j] menor que cero
                    if(orden[j+1].compareTo(orden[j]) <0){
                        String temp= orden[j];
                        orden[j] = orden[j+1];
                        orden[j+1] = temp;
                    }

                }
                iteracion++;
            }

            System.out.println("Numero de iteraciones:"+iteracion);
    }

     //Creamos un un método estatico que realice el algoritmo burbuja
     public static void burbuja(Object []orden){
        //generamos una varaible tipo int para simplificar
        int datos = orden.length;
        int iteracion=0;
        for(int i= 0;i< datos;i++){
            for(int j= 0; j <datos - i -1;j++){
                if(((Comparable) orden[j+1]).compareTo(orden[j])<0){
                    Object temp= orden[j];
                    orden[j] = orden[j+1];
                    orden[j+1] = temp;
                }

            }
            iteracion++;
        }

        System.out.println("\nNumero de iteraciones:"+iteracion);
}

    //otra manera de hacerlo es comparar la anidaciones de i copn j o j con i

    public static void burbuja(int []orden){
        //generamos una varaible tipo int para simplificar
        int datos = orden.length;
        int iteracion=0;
        for(int i= 0;i< datos;i++){
            for(int j= i; j <datos ;j++){
                if(( orden[j] <orden[i])){
                    int temp= orden[j];
                    orden[j] = orden[i];
                    orden[i] = temp;
                }

            }
            iteracion++;
        }
        System.out.println("\nNumero de iteraciones:"+iteracion);
    }

    public static void main(String[] args) {
        String [] canciones = {"Nirvana - The Man Who Sold The World","Coldplay - The Scientist ","ZZ Top - La Grange","The Hollies - Long Cool Woman ",
                "The Doors  Break on Through","Santana - Oye Como Va","Hurricane Jane","Greenback Boogie","Don't Dream It's Over","The Final Countdown"};

    System.out.println("\n*******en desorden la lista de canciones******");
        //ordenamos 
        for(String desorden:canciones){
            System.out.print(desorden);
        }
        System.out.println("\n********en orden la lista de canciones******");

        burbuja(canciones);
        for(String orden:canciones){
            System.out.print(orden);
        }

    System.out.println("\n\n********************ordenamiento con nuemros usando comparable en una funcion o método*********");
    
    Integer []nuemros = {15,2,4,6,8,7,5,3,1,20,8,4,17,15,8,19,18,6,12,17};   

    System.out.println("\n\n********************números en desorden usando comparable*********");

    for (Integer desorden:nuemros){
        System.out.print(desorden+",");
    }

    System.out.println("\n\n********************números en orden usando comparable*********");
    burbuja(nuemros);

    for (Integer orden:nuemros){
        System.out.print(orden+",");
    }
    System.out.println("***************** usando comparacion i & j****************** ");

    int [] numsInt = {3,10,21,27,57,8,41,14,22,60,52,15,28,5,4,26,33,49,46,17,39,47,37,23,45,50,12,24,43,35,31,11,19,18,2,58,40,7,42};


    System.out.println("\n\n********************números en desorden usando comparacion i & j*********");    

    for (int desorden : numsInt) {
        System.out.print(desorden+",");
    }

    burbuja(numsInt);
    for (int orden : numsInt) {
        System.out.print(orden+",");
    }

    }
}
