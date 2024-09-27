public class SentenciaForAnidadaDIbujo {

    public static void main(String[] args) {
        System.out.println("\n ------- 1 manera de hacerlo lado derecho ----------------");

        int i;
        int j;
        int rows = 6;


           for (i = 0; i < rows; i++) {
                
                for (j = 0;  j<= i; j++) {
                    System.out.print(" *");
                }
                System.out.println("");
           } 
           System.out.println("\n ------- 2 manera de hacerlo lado Izquierdo ----------------");

           for (i = 0; i < rows; i++) {
                
                //hay que darle la vuelta a bulce con la formula rows - i * 2  voeltamos nuestros loop 
             
                for (j = 2 * (rows - i);  j> 0; j--) {
                    System.out.print("\s");
                }
            for (j = 0;  j<= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
       }

    }
}
