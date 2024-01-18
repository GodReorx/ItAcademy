package Clases;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Tools {
    private static Scanner sc = new Scanner(System.in);
    public static int menu(){
        int opcion = 0;
        System.out.printf("Menu de la redaccion\n");
        System.out.printf("1. Introducir redactor\n" +
                "2. Eliminar redactor\n" +
                "3. Introducir noticia a un redactor\n" +
                "4. Eliminar noticia\n" +
                "5. Mostrar todas las noticias por redactor\n" +
                "6. Calcular puntuacion de la noticia\n" +
                "7. Calcular precio de la noticia\n\n" +
                "0. Salir\n\n");
        System.out.printf("Opcion: ");
        opcion = sc.nextInt();
        sc.nextLine();
        return opcion;
    }
    public static String addRedactor(ArrayList<Redactores>redactores){
        System.out.printf("Nombre del redactor: ");
        String nombre = sc.nextLine();
        String dni;
        do {
            System.out.printf("DNI del redactor: ");
            dni = sc.nextLine();
        }while(checkDNIexist(redactores,dni));
        redactores.add(new Redactores(nombre,dni));
        return "Redactor añadido\n";
    }
    public static String delRedactor(ArrayList<Redactores>redactores){
        String mensaje = "";
        System.out.printf("Nombre del redactor a eliminar: ");
        String nombre = sc.nextLine();
        System.out.printf("DNI del redactor: ");
        String dni = sc.nextLine();
        mensaje = redactores.removeIf(n -> (n.getNombre().equalsIgnoreCase(nombre)) && (n.getDni().equalsIgnoreCase(dni))) ?
                "Redactor " + nombre + " con DNI " + dni + " ha sido eliminado\n" :
                "No existe el redactor proporcionado.\n";
        return mensaje;
    }
    public static String addNewsToRedactor(ArrayList<Redactores>redactores){
        String mensaje="";
        String nombre;
        String dni;
        do{
            System.out.printf("Nombre del redactor: ");
            nombre = sc.nextLine();
            System.out.printf("DNI del redactor: ");
            dni = sc.nextLine();
        }while(!checkRedactorExist(redactores,nombre,dni));
        switch (newsMenu()){
            case 0 :
                mensaje = "Accion cancelada por el usuario.\n";
                break;
            case 1 :
        }
        return mensaje;
    }
    private static int newsMenu(){
        int opcion = 0;
        System.out.printf("Escoge el tipo de noticia\n");
        System.out.printf("1. Futbol\n" +
                "2. Basquet\n" +
                "3. Tenis\n" +
                "4. Formula 1\n" +
                "5. Motociclismo\n" +
                "0. Cancelar\n\n");
        System.out.printf("Opcion: ");
        opcion = sc.nextInt();
        sc.nextLine();
        return opcion;
    }
   /* private static void futbolNew(ArrayList<Redactores>redactores, String nombre, String dni){

    }*/
    private static boolean checkDNIexist(ArrayList<Redactores>redactores, String dni){
        for(Redactores redactor : redactores){
            if(redactor.getDni().equalsIgnoreCase(dni)){
                return true;
            }
        }
        return false;
    }
    private static boolean checkRedactorExist (ArrayList<Redactores>redactores, String nombre, String dni){
        for(Redactores redactor : redactores){
            if(redactor.getNombre().equalsIgnoreCase(nombre) && redactor.getDni().equalsIgnoreCase(dni))
                return true;
            }
        return false;
    }
    private static int checkRedactorPosition (ArrayList<Redactores>redactores, String nombre, String dni){
       for(Redactores redactor : redactores){
            if(redactor.getNombre().equalsIgnoreCase(nombre) && redactor.getDni().equalsIgnoreCase(dni)){
                return redactor.getDni().indexOf(dni);
            }
        }
        return -1;
    }


}
