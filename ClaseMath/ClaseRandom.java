import java.util.Random;

public class ClaseRandom {
    public static void main(String[] args) {
        System.out.println("*******************Clase Random **************************************");
        //entonces a qui creamos una instancia de la clase Random
        Random random = new Random();
        //es mucho mas flexible y mucho más variedad para generar números enteros,decimales aleatorios por que el método random retorna un double
        //pero con el objeto random es mucho mas amplio  no solamente podemos generar decimales con double
        //vamos a iniciar con los enterdos
        //entoncecs cada random.nextInt() es para generar números aleatorios
        int randomInt =  random.nextInt();
        //retorna un pseudorandom uniforme  de todos los posibles o la posibilidad que se puedan generar en el rango 2^32  y -2^32
        //entonces puede ser positivo o negativo
        //pintamos
        System.out.println("randomInt = " + randomInt);
        //tambén del tipo long
        long randomLong = random.nextLong();
        //retorna un long primitivo por lo tanto da un rango mucho mas amplio
        //pintamos
        System.out.println("randomLong = " + randomLong);
        //pero tambien nos permite pasar un arugumento un número del tipo entero por ejemplo si quiere pasar el 8
        int randomArgumentoInt =  random.nextInt(8 );
        //tendreemos nuemros aleatroios entre el 0 y el 8 pero el 8 no se incluye
        System.out.println("randomArgumentoInt = " + randomArgumentoInt);

        //por ejemplo como haraimos con un arreglo con animales
        String [] mascotas = {"perro","gato","perico","guacamaya","peses","gallo","cerdito"};

        //es algo similare a mathRandom
        int mascostasRandom = random.nextInt(mascotas.length);
        //mascostasRandom *= mascotas.length;
        System.out.println("numero de sorteo = " + mascostasRandom);
        System.out.println("la mas cora que ganaste es " + mascotas[mascostasRandom]);

    }
}
