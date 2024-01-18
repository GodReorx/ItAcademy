package Clases;

import java.util.HashSet;
import java.util.Scanner;

public class Menu {

    static Scanner sc = new Scanner(System.in);

    public static void menuRest (HashSet<Restaurante> restaurantes){
        String name;
        String mensaje;
        int score;
        int opt;

        do {
            System.out.println("Menu para agregar restaurantes y puntuaciones\n\n" +
                    "1. Agregar un restaurante y puntuacion\n" +
                    "2. Ver listado de restaurantes y puntuaciones\n" +
                    "0. Cerrar el programa\n");
            System.out.print("Opcion: ");
            opt = sc.hasNextInt() ? sc.nextInt() : -1;
            sc.nextLine(); //limpia buffer
            switch (opt) {
                case 1:
                    System.out.print("Nombre del restaurante: ");
                    name = sc.nextLine();
                    System.out.print("Puntuacion: ");
                    score = sc.nextInt();
                    sc.nextLine();
                    mensaje = RestauranteTools.newRest(restaurantes, name, score);
                    break;
                case 2:
                    mensaje = RestauranteTools.showRest(restaurantes);
                    break;
                case 0:
                    mensaje = "Cerrando el programa";
                    break;
                default:
                    mensaje = "Opción incorrecta";
            }
            System.out.println(mensaje);
        }while(opt != 0);
    }

}
