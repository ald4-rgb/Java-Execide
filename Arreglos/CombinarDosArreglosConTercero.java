/*
*
*   El objetivo de este es tener dos arreglos a partir de este crear un tercero
*   que contenga lops datos combinados de los otros dos arreglos por ejemplo que contenga
*   el primero del arreglo a con el primero del arreglo b luego que contenga el segundo del a el segundo del b
*   despues el tercero del a y el tercero de b  y asi sucesivamente por lo tanto tiene que tener alemenos del
*   tamaño de los dos arreglos sumados por ejemplo si a y b tienen un tamño dee 10 este nuevo arreglo tiene que
*   tener un tamaño 20 para poder almacenar los elementos de ambos arreglos
*
* */

public class CombinarDosArreglosConTercero {
    public static void main(String[] args) {

        //creamos 3 arreglo
        int [] combinaciona,combinacionb,combinacionc;

        combinaciona = new int[10];
        combinacionb = new int[10];
        combinacionc = new int[20];

        //la idea es llenar el a y el b y a partir de estos datos es poblar datos del c combinados mesclar arreglos
        //comenzamos con el
        for (int i = 0; i < combinaciona.length;i++){
                combinaciona[i] =  i +1;
            System.out.print(","+combinaciona[i]);
        }
        System.out.println("\n*******combinacion de arreglos arreglo b ******");
        for (int i = 0; i < combinacionb.length;i++){
            //vamos a incrementarlo por 5
            combinacionb[i] =  (i +1)* 5;
            System.out.print(","+combinacionb[i]);
        }
        //solamente tenemos que iterar hasta 10  no hasta 20
        //por que hasta 10 no a 20 por que no usamos el la longitud de la combinaciónc
        //por primero vamos a recorrer los elementos de a y b  y en cada iteración vamos a agregar 2 elementos
        //a por lo tanto en 10 iteraciones vamos a tener 20 ya que cada una asigna dos elemntos uno del arreglo a y otro del arreglo b
        //aqui como indice en tenemos que aregar una varaible auxiliar
        int aux = 0;
        for (int i = 0; i < combinaciona.length;i++){
            //esta viarable auxiliar se va incrementando en cada iteracion dos veces una por cada indice
            combinacionc[aux++] = combinaciona[i];
            combinacionc[aux++] = combinacionb[i];
        }
        //a qui valtaria mostrar la tabla
        System.out.println("\n******** mostrar los elementod combinados");

        for(int i = 0; i < combinacionc.length;i++){
            System.out.println("indice: "+i+" combinacionc = " + combinacionc[i]);
        }

    }
}
