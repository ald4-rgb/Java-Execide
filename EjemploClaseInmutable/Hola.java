/*
*
* Mini ejemplo de clase imnutable que no entendia
*
* para hacer una clase imnutable ¿Que necesitamos son tres requisitos?
*
* necesitamos
*
*   1. que nuestra clase sea final para que sea inmutables es uno de los priciplales puntos
*
*   2. que nuestros atributos también sean imutables  que sean private y con final para que no se pueda acceser atravez de una instancia
*
*   3. que hagamos una contructor de manera privada inicializando nuestrso atribusto inmutoables
*
*   4. crear un método estatico para no instnaciar desde otra calse esto con el fin de interacturar con la clase inmutable
*
*   5. metodos que no permitan interactuar con objetos que puedan ser modificados psea punlic void get(..);
*
*
*
* */
public  final class Hola {
    
    private final String saludar;
    
    private final String despedirse;

    private  Hola(String saludar,String despedirse){
        this.saludar = saludar; 
        this.despedirse = despedirse; 
    }
    
    public static Hola invitados(String saludar,String despedirse){
        return new Hola(saludar,despedirse);
    }
    
    
    public String getSaludar(){
        return saludar;
    }    
    
    public String getDespedida(){
        return despedirse;
    }    
    
    
    @Override
    public String toString(){
        return "Hola{" +
                "saludar='" + saludar + '\'' +
                ", despedirse='" + despedirse + '\'' +
                '}';
    }
}
