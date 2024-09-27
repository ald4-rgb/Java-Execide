public class ArgumnetoLineaComandoCalculadora {

    public static void main(String[] args) {
        //vamos a tener tres parametros argumentos del terminal del a consola
        //primero el tipo operacion la idea es que sea una calculadora por ejemplo
        //sumar restar multiplicar divir

        //si tratamos de ingresar a una pocicion 0  1 o 2  y no se envia ningun parametro
        //argumento  va alanzar una excepcion
        //entonces si args.length es distinto de  3
        //entonces mandamos un mensaje
        //es eso si agregamos mas de 2 argumentos
        if(args.length !=  3){
            System.out.println(" Por favor Ingrese una operacion y dos numeros (suma,resta,div.mult)" );
            //retronarmos el cosigo de eeror -1
            System.exit(-1);
        }




        //entonces creamos varaibel operacion se obtiene del arreglo
        //args[] va hacer el priemro parametro por lo tanto va a estar en el indice
        String operacion = args[0];
        //la idea es sumar restar dos números a + b;
        //recordando la transformacion de String a tipo Integer usamos el método
        int a = 0;
        int b = 0;
        //ahora el resultado
        //0.00 por defecto
        double resultado = 0.00;

        try {
            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);
        }catch (NumberFormatException e) {
            System.err.println("Por favor a y b  deben ser entero y solo los parametros permitidos son suma,resta,multipliacion,divicion c: ****");
            System.exit(-1);
        }
        //bie ahora vamos a implementar esta calculadora segun la operacion para eso podriamos implementar un switch cas o un if
        //usamos operacion
        switch (operacion){
            case "suma":
                  resultado = a + b;
                //recrodemos el break; para no seguir ahacia abajo
                break;
            case "resta":
                resultado = a - b;
                break;
            case "multiplicacion":
                resultado = a * b;
                break;
            case "divicion":
                //vamos a hacer una validacion por si dividimos por cero seria infinito
                //solamente para el caso de la divicion
                if(b ==0){
                    System.out.println("No se pude divir entre cero");
                    System.exit(-1);
                }
                //para que sea un valor con decimales con presicion hay que convetir uno de los dos valor en double
                resultado = (double) a / b;


                break;
                //si no se aplica ninguno podriamos sumar
            default:
                resultado =  a + b;
        }
    
        //vamos a pintar el resultaso
        System.out.println("El resultado de la operación es  = "+operacion+" es :"+ resultado);

        /*
        * Si lo ejecutammos en cel ide nos aparce el erro por que no estamos pasando ningun parametro argumento
        * y va a darnos el manesaje de error pero la idea es hacerlo en consola por por argumento
        *
        * */
    }
}
