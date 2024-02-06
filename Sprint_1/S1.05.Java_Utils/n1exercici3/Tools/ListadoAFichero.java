package Tools;

import java.io.*;
import java.util.Arrays;
import java.util.Date;

public class ListadoAFichero {
    private static File fileTxt = new File("ListadoCompleto.txt");

    public static void startApp(String[] args){
        if(args.length > 0) {
            if (fileTxt.exists()) {
                fileTxt.delete();
            }
            try {
                fileTxt.createNewFile();
            } catch (IOException e) {
                System.out.println("ERROR: No se ha podido crear el archivo, comprueba la ruta o los permisos.\n");
            }
            listaDirectorios(args[0], 0);
        }else{
            System.out.println("ERROR: La cantidad de parametros son incorrectos, lea el README.txt");
        }

    }
    private static void listaDirectorios(String path, int level){
        File file = new File(path);
        File[] listFile = file.listFiles();
        Arrays.sort(listFile);
        String tabula = "";
        for(int i = 0; i < level; i++){
            tabula += "\t";
        }
        writteFile(listFile,tabula,level);
    }

    private static void writteFile (File[] listFile, String tabula, int level){
        try(PrintWriter pw = new PrintWriter(new FileOutputStream( fileTxt,true));) {
            for (File contenido : listFile) {
                if(contenido.isDirectory()){
                    listaDirectorios(contenido.getAbsolutePath(),level+1);
                    pw.println(tabula + "(D)" + contenido.getName() + " || Data Modificacio: " + new Date(contenido.lastModified()));
                } else {
                    pw.println(tabula + "\t(F)" + contenido.getName()+ " || Data Modificacio: " + new Date(contenido.lastModified()));
                }
            }
        }catch (NullPointerException e) {
            System.out.println("No existe el path proporcionado o es incorrecto.\n");
        }catch (FileNotFoundException e) {
            System.out.println("ERROR: No se ha encontrado el archivo.\n");
        }
    }
}

