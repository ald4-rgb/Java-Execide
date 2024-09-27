/**
 * Ejemplos de la clase System
 *
 * System: esta clase conteine solamente métodos o atributos estaticos la clase System esta diseñada
 *         para atributso estaticos esta diseñanada para que no se pueda instanciar con el operador new
 *         no se puede crear una instancia y tampoco se puede crear una clase
 *
 *
 */


public class CLaseSystemOtrasCaracteristicas {
    public static void main(String[] args) {

        //   System hola = new System();


    //En este ejemplo se crean  muchos objetos String por lo tanto se carga la memoria con muchas instnacia
    //con muchos objetos y java de forma automatica un recolector de basura que se encarga de eliminar
    //de desechar toda la instancias es estamos utulizando en desuso en otras palabras  que nos hace referencia
    //de esta instancia en alguna pate entoces simplemente  las elimina
    //entonces cuadno tenemos una programa mut cargado como este caso son muchos objetos muchas instancias que
    //se están creando podemos acelerar el recolector ded basucar (garbagecollector)
    //lo podemos invocar de forma explicita entonces de esa fromar invocamos el recolector y automaticamente
    //va eliminar todos los objetos que no se estan utilizando que están en desuso que no se están referenciando
    //en ninguna parte de nuestra applicacion
    //puede que estas instnacias se hayan utiliazdo anterioirmente pero despues se tienen que borrar eliminar de la memoria
    //para liberar espacio
    //esso lo podemos hacer con la clase System pude ser al final de la aplicaion o entremedio
            String a  = "a";
            String b = "b";
            String c = a;

            StringBuilder sb  = new StringBuilder(a);

            long inicio = System.currentTimeMillis();

//por ejmplo a qui dentro del for
            for (int i = 0 ;i < 100000;i++){

                sb.append(a).append(b).append("\n");

            }
//entonces System.garabagecollector ---> System.gc();
          //entonces de esta manera lo invocamos de manera explicita para liberar espacio
        //pero solo al final solo con muchas instnacias con muchos objetos por que
        //esto también se hace de forma automatica por la maquina vritual de java
        //pero de esta froma estamos acelerando el proceso
        //entocnes al final lo que hace es reciclar las instancias limpiarlas las
        //que están utlizando
          System.gc();


            long fin = System.currentTimeMillis();


            System.out.println(fin - inicio);

            System.out.println("c ="+c);
            System.out.println("sb= " + sb.toString());

            //también se puede hacer pero esso se hace automaticamente
        //podedmos usar System.exit(1);
            System.exit(0);


            /*
             * Se puede demorar 2 ms o 1 son 55 iteraciones esta concatenando 500 veces
             *
             * Conclucion por donde se le mire el StringBuilder es maw rapido que el metodo concat() el operador +
             *
             * */
    }
}
