package Tools;

import java.io.File;
import java.util.Arrays;

public class ListaDirectorio {
    public static void startApp(String[] args){
        if(args.length > 0) {
            listaDirectorios(args[0]);
        }else{
            System.out.println("ERROR: La cantidad de parametros son incorrectos, lea el README.txt");
        }
    }
    private static void listaDirectorios(String path){
        File file = new File(path);
        try{
            File[] listFile = file.listFiles();
            Arrays.sort(listFile);
            for (File contenido : listFile) {
                System.out.println(contenido.getName());
            }
        }catch (NullPointerException e){
            System.out.println("ERROR: No existe el path proporcionado o es incorrecto.");
        }
    }

}
