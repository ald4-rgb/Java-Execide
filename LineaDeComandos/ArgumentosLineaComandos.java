/*
*
* La idea es compilar con java compiler usando java c generar el Bytecode el cual es el archivo.class y
* poder ejecutar nuestras apps, ademas de pasar argumentos via terminal lenea de comandos por ejmplo
* por ejemplo todo método main recibe parametros osea argumentos lo cual nos sirve para enviar
* esos argumetos cuadno ejecuta nuestro programa en java
*
*
* ¿Ques ByteCode?
* Es un lenguaje intermedio entre el codigo Binario 01 y ek cidigo fuente que entendemos los humanos.
* Estos archivos tipo ByteCode se generan en la carpeta output/production
*
*
* La idea es generar nuestros ByteCode (.class) de manera manual
* */

public class ArgumentosLineaComandos {

    //vamos a usar el parametro String [] args que es un arraydel método main
    public static void main(String[] args) {

        //vamos a colocar una validacion
        //si es igual a cero mandamos un mensaje
        //ademas salimos con un codigo o status de error
        if(args.length == 0){
            //recordemos lo Status cuando es cero es que todo sale bien 1 es cuando se lanza una excepion y -1 cuando ocurre un error
            System.out.println("Se debe Ingresar argumentos parámetros");
            System.exit(-1);
        }

        //entonces la idea es con un for es iterar sobre este arreglo
        //del tipo String [] args
        for(int i =0;i < args.length;i++){
            //enviamos el valor de cada parametro atravez del contenido del arreglo
            //args[i]
            //y so ejecutamos no  va a pasar nada por que no estamos enviando ningun parametro
            System.out.println("argumentos n°" + i + ": "+ args[i]);
        }

    }

}
