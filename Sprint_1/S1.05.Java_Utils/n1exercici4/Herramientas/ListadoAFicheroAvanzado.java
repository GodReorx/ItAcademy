package Herramientas;

import java.io.*;
import java.util.Arrays;
import java.util.Date;

public class ListadoAFicheroAvanzado {

    private static File fileTxt = new File("ListadoCompleto.txt");

    public static void startApp(String[] args) {
        int opc = 0;
        if (fileTxt.exists()) {fileTxt.delete();}
        try {
            fileTxt.createNewFile();
            try{
                opc = Integer.parseInt(args[0]);
                if (args.length > 1) {
                    menu(opc, args[1]);
                } else {
                    System.out.println("ERROR: La cantidad de parametros son incorrectos, lea el README.txt\n");
                }
            }catch (NumberFormatException e){
                System.out.println("El primer parametro ha de contener un numero.\n");
            }
        } catch (IOException e) {
            System.out.println("ERROR: No se ha podido crear el archivo, comprueba la ruta o los permisos.\n");
        }
    }
    private static void menu(int opc, String path){
        switch (opc){
            case 1 :
                listaDirectorios(path,0);
                break;
            case 2:
                leerTxt(path);
                break;
            default:
                System.out.println("ERROR: 1er parametro incorrecto, debe ser 1 o 2.");
                break;
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
            System.out.println("ERROR: No se ha encontrado el arvhico.\n");
        }
    }

    private static void leerTxt(String path){
        File file = new File(path);
        if(file.getName().toLowerCase().endsWith(".txt")) {
            try (BufferedReader bf = new BufferedReader(new FileReader(path));) {
                String line = "";
                while ((line = bf.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("ERROR: El archivo ha de ser un TXT.");
        }
    }

}
