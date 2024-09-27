
/*
*
* Como la instruccion for fue no digamso especificamente para eso si no que podemos usar
* las instrucciones que queramos
* */

public class RecorrerArray {
    public static void main(String[] args) {

        String []productos  = new String[7];

        productos[0] ="Samsung TV";
        productos[1] ="Samsung Galaxy A72";
        productos[2] ="Audifonos";
        productos[3] ="Ps5";
        productos[4] ="Xbox series x";
        productos[5] ="Aleinware Laptop";
        productos[6] ="Xaomi phone";

        //entonces es mucho mas facil reutilizar productos.length
        int total = productos.length;
        //entonces si menor o igual a 6 el ultimo elemento total - 1
        for (int i = 0; i < total - 1;i++){
            System.out.println("por índice "+i+" :"+productos[i]);
        }
        System.out.println("**************Imprmido con foreach********************************************");
        //ahora imprimir con un for each
        for(String p: productos){
            //aqui solo omitimos los indices
            System.out.println("prodcutos = " + p);
        }
        System.out.println("***************usando la instruciion while");

        //ahora vamos a  hacerlo ocn while
        int k = 0 ;
        while ( k < total ){
            System.out.println("por índice "+k+" :"+productos[k]);
                k++;

        }
        System.out.println("***************usando la instruciion do{} while();");
        
        int l = 0;
        do{
            System.out.println("por índice "+l+" :"+productos[l]);
            l++;
            //si imprmimos despues desbordamos la memoria a menos que pongfamos el igual en la condifcion
        }while (l < total);
        
        

        System.out.println("*********************************ordenamiento sin usar el metodo sort() ************************************************" );
        //ordando sin el método sort()
        //usamos a una varaible temporalñ que nos ayudara a reinicar las varaibles del arreglo para ordenar mejor
        String temp;
        for (int i = 0; i <productos.length;i++){
            for (int j = i; j<productos.length;j++){
                    if( productos[j].charAt(0) < productos[i].charAt(0) ) {
                        temp = productos[j];
                        productos[j] = productos[i];
                        productos[i] = temp;
                    }
                }
            System.out.println("por índice odernados alfabeticamente "+i+" :"+productos[i]);
            }
        System.out.println("******************rellenar arrays int de forma automatica");

        //los valrores del String ya los tenemos asignados  pero en este caso le valor de int los vamos a asignar

        int [] nuemnros = new int[10];
        //ahora vamos a llenar un for usanro un array de nuemros

        //para mas facil declaramso otrs varaible de tipo int
        int rellenar = nuemnros.length;

            //a qui aremso un for para llenar poblar los datos
            //este fro es para llenar los datos de forma dinamica
            for (int i = 0; i < rellenar ; i++){
                //a qui empieza a multiplicar por cada iteracion de el loop osea 3 x 0 = 0 ; 3 x 1 = 1,3 x 2 = 6 .....etc
                //multiplicamos por 3 cada valor del indice
                nuemnros[i] = i  * 3;
            }
            //este for es para pintar nuestros datos de 3 en 3
            for (int i = 0; i < rellenar ; i++){
                //si pintamos el array entocnes nos dara todo 0
                //por eso arriba ihicmos  otro for
                System.out.println("nuemnros[i] = " + nuemnros[i]);
            }
        }
    }

