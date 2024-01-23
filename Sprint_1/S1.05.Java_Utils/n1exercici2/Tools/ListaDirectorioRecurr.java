package Tools;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class ListaDirectorioRecurr {
    public static void startApp(String[] args){
        if(args.length > 0) {
            listaDirectorios(args[0],0);
        }else{
            System.out.println("ERROR: La cantidad de parametros son incorrectos, lea el README.txt");
        }
    }
    public static void listaDirectorios(String path, int level){
        File file = new File(path);
        try{
            File[] listFile = file.listFiles();
            Arrays.sort(listFile);
            String tabula = "";
            for(int i = 0; i < level; i++){
                tabula += "\t";
            }
            for (File contenido : listFile) {
                if(contenido.isDirectory()){
                   System.out.println(tabula + "(D)" + contenido.getName() + " || Data Modificacio: " + new Date(contenido.lastModified()));
                   listaDirectorios(contenido.getAbsolutePath(),level+1);
                } else {
                   System.out.println(tabula + "\t(F)" + contenido.getName()+ " || Data Modificacio: " + new Date(contenido.lastModified()));
                }
            }
        }catch (NullPointerException e){
            System.out.println("ERROR: No existe el path proporcionado o es incorrecto.");
        }
    }
}
