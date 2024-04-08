/*
Transfromar las sigueitnes salidas quitar numeros y strformar de cada palabra una letra en maruscular
Input: ["break3ing news8:", "2A 1circle is round!"]

Output: "Breaking News: A Circle Is Round!"

Input: ["","Fresh fried fish - fish fresh fried"]

Output:"Fresh Fried Fish - Fish Fresh Fried"

Input: ["2here2", "is", " our STRING"]

Output: "Here Is Our STRING"

Input: ["123", "eat;sleep;repeat", "321"]
 */

public class CadenaDeStrings {

    public static String primeraLetra(String str) {
        // necesitamos didivir cada palabra de nuestro array
        // usamos splito con una expresion regular
        String[] transformer = str.split("\\s+");
        // usamos la clase StringBuilder usando el metodo append esto nos ayudara a
        // dividir cada palavbra
        StringBuilder sb = new StringBuilder();

        for (String word : transformer) {
            // si es diferente a vacio para eliminar cada espacio
            if (!word.isEmpty()) {
                // usamos un caracter para modificar las letras que queremos en este caso la
                // primera letra de cada palabra
                char primeraLetra = Character.toUpperCase(word.charAt(0));
                    sb =  sb.append(primeraLetra).append(word.substring(1)).append(" ");
            }
        }
        //retornamos el append
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] input = { "break3ing news8:", "2A 1circle is round!" };

        String [] input2= {"","Fresh fried fish - fish fresh fried"};

        String [] input3=  {"2here2", "is", "our STRING"};

        String [] input4= {"123", "eat;sleep;repeat", "321"};

        for (String outPut : input) {
            String str = outPut.replaceAll(" \\d", "");
            str =primeraLetra(outPut.replaceAll("\\d", ""));    
            System.out.print(str);
        }

        System.out.println("\n");
        for (String outPut2 : input2) {
            String str = outPut2.replaceAll(" \\d", "");
            str =primeraLetra(outPut2.replaceAll("\\d", ""));    
            System.out.print(str);
        }
        System.out.println("\n");

        for (String outPut3 : input3) {
            
            String str =primeraLetra(outPut3.replaceAll("\\d", ""));    
            System.out.print(str);
        }

        System.out.println("\n");
        for (String outPut4 : input4) {
            
            String str =primeraLetra(outPut4.replaceAll("\\d", ""));    
            System.out.print(str);
        }

    }

}