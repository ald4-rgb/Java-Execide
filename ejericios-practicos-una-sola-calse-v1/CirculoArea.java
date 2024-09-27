import java.util.Scanner;

public class CirculoArea {

      
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
          
        double pi  = Math.PI;

        System.out.println("Ingrese el radio del circulo");
 
        double radio = sc.nextDouble();

        Double resultado = pi * Math.pow(radio, 2);

        //lo quise transofarm a String

        String resultadoArea = Double.toString(resultado);

        System.out.println("el area del circulo es ".concat(resultadoArea));
        
        
    }
    
}
