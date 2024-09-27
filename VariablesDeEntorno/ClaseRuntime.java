/*
*
* Como ejecutar alguna aplicacón del programa del S.O utilizando la clase Runtime
* Y tambien se pude conbinar con el System.getProperty para obetener el sitstema opertativo
* el nombre por ejemplo sabes si es linux,widnows o unix
* y deacurdo al S.O ejecutar el notepad como editos de texto y en caso de linux unix el gedti
*
* */


import java.io.IOException;

public class ClaseRuntime {
    public static void main(String[] args) {
        try {
            //lo primero es el Runtime de java.lang
            //que entre varias cosas nos permite ejecutar aplicaciones con el metodo exe();
            //entonces invocamos la clase Runtime y el método estatico Runtime.getRuntime();
            //obtejemos la instancia de tiempo ejecucion de este objeto
            //como se ejecuta un programa por ejemplo el  editor de texto  en nodepad que nos retorne
            //un objeto de tipo process
            Runtime rt = Runtime.getRuntime();
            //Invocamos la clase Priocess de java.lan
            //lo dejamos definido simplemente declarado
            //una variable si la isntancia toadavia por que la isntnacia devuelve retorna
            //el emetodo execute(); ===> exec()
            Process process;

            //entonces validamos con el sistema operativo if y System.getProperty()
            //System.getProperty(): la usamos por que solamente vamos a buscar por el S.O
            //recrodemos qeu retrona un String
            //buena parctica usar toLowerCase()
            if(System.getProperty("os.name").toLowerCase().startsWith("windows")){
                //entocnes ejecutamos traemos exexc("nospideuncomando")

                process = rt.exec("notepad");
            }
            //la idea es cuadno ejecute el editor no continue con la ejecucion de la aplicacion  hasta que cerremos
            //el programa del notepad o del edtior entocnes con process.waitFor() ==> esperar a que fianlize la aplicacion
            //esperar a que fianlice el notepad antes de que lo cerremos al terminar
            //marca un error que el proceso de esta varaible podria no estar asignada
            //podriamos asignarle un null pero nos daria un NullPointEXception
            //entocnes else {proceso por defecto}
            //andimos el de otroas sistemas
            else if(System.getProperty("os.name").toLowerCase().startsWith("mac")){
                //entocnes si no es windows es otro s.o por ejemplo unix
                process = rt.exec("textedit");
                //aqui es con nux o con nix
            }
            else if(System.getProperty("os.name").toLowerCase().startsWith("nix") || System.getProperty("os.name").toLowerCase().startsWith("nux")){
                process = rt.exec("gedit");
            }else{
                process = rt.exec("gedit");
            }
            process.waitFor();
        }catch (Exception e){
            //y podemos manejar System.error().println("algun mensaje");
            System.err.println("El comando es desconocido "+e.getMessage());
            //y nos salimos con un codigo 1
            System.exit(1);
        }
        //un mensaje exitoso
        System.out.println("notedpad se ha cerrado correctamente");
        //y salimos con con un exit()
        System.exit(0);
    }
}
