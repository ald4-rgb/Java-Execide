/*
*
*
* La idea es recocorre al revez nuestros arrays de elementos
*
* */


public class IterarArregloOrdenInverso {

    public static void main(String[] args) {


        String []productos  = {"Samsung TV","Samsung Galaxy A72","Audifonos","Ps5","Xbox series x","Aleinware Laptop",
        "Xaomi phone",};

   /*
        //Esta forma es mas dinamica puedes descomenta

        String []productos  = new String[7];

        productos[0] ="Samsung TV";
        productos[1] ="Samsung Galaxy A72";
        productos[2] ="Audifonos";
        productos[3] ="Ps5";
        productos[4] ="Xbox series x";
        productos[5] ="Aleinware Laptop";
        productos[6] ="Xaomi phone";


        */

        //mas facil guardamos en un in
        int totalProductos = productos.length;

        for (int i = 0 ; i< totalProductos ; i++){
            System.out.println("por índice "+i+" :"+productos[i]);

        }
        System.out.println(" ******************alrevez recordar que hay que restar la iteracuion i menos 1 y nuestro array usando inverso" );
        //lohacemo al revez
        for (int i = 0 ; i< totalProductos ; i++){
            //como es un strin y es opracion aritmetica usamor los parentesis()
            System.out.println("por índice"+(totalProductos -1 -i)+":".concat(productos[totalProductos -1 -i]));

        }
        //otra forma mas simplifcada y recomendada
        System.out.println(" ******************forma simpleficada**************" );
        for (int i = totalProductos - 1 ; i >= 0 ; i--){
            //como es un strin y es opracion aritmetica usamor los parentesis()
            System.out.println("por índice "+i+" :"+productos[i]);

        }



    }
}
