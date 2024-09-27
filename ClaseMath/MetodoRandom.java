import java.util.Random;

public class MetodoRandom {
    public static void main(String[] args) {

        //por ejemplo vamos a tener un String un array
        String [] colores = {"Azul","Naranja","Verde","Amarillo","Blanco","Negro","Morado"};
        //generacion de npumeros aleatoprios
        double aleatorio = Math.random();
        //nos auxiliamos para reiniciar nuestra varaiblle
        double temp = Math.random();
        //el uno no se incluye se excluye
        System.out.println("aleatorio = " + aleatorio);
        //y si queremos tener un número aleatorio entre 0 & 7  pero el 7 no se incluye
        aleatorio *= 7;
        //pintamos solo hasta el 6 llega del 0 a 6
        System.out.println("aleatorio = " + aleatorio);
        //reiniciar la varaible para no tener ninguna afectacion
        aleatorio = temp;
        aleatorio *= colores.length ;
        //podriamos reondear hacia adelante o hacia tras
        aleatorio = Math.floor(aleatorio);
        System.out.println("aleatorio con redondeohacia a tras = " + aleatorio);

        System.out.println("*****************************Ejemplo con colorers******************************");
        //vamos a multiplicar  aleratorio = colores.length
        //aleatorio = 1;
        //vamos a redondear hacia abajo indicamos con corchetes seria indice [] nos marca un error hay varias opciones lo podemos hacer por cast
        // o usar la Clase Integer.parseInt();
        //convertimos aleatorio con un cast
        int convertir = (int) aleatorio;
        //aleatorio = Math.floor(aleatorio);
        System.out.println("color " + colores[convertir ].concat("\n \nun pequeño espacio para ver como funciona la clase random"));


    }
}
