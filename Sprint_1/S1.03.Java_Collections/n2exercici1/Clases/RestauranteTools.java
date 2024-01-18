package Clases;

import java.util.HashSet;

public class RestauranteTools {

    public static String newRest (HashSet<Restaurante> restaurantes, String name, int score){
        String mensaje = "El restaurante " + name + " con la puntuacion " + score + " ya existe.";
        if ( restExist(restaurantes, name, score) != -1 ){
            restaurantes.add(new Restaurante(name, score));
            mensaje = "Agregado el nuevo restaurante con su puntuacion";
        }
        return mensaje;
    }

    private static int restExist(HashSet<Restaurante> restaurantes, String name, int score){
        for (Restaurante restaurante : restaurantes) {
            if(restaurante.getName().equalsIgnoreCase(name) && restaurante.getScore() == score){
                return -1;
            }
        }
        return 0;
    }

    public static String showRest (HashSet<Restaurante> restaurantes){
        if(!restaurantes.isEmpty()) {
            for (Restaurante restaurante : restaurantes) {
                System.out.println(restaurante.toString());
            }
            return "\n\nListado completo de restaurantes";
        }else{
            return "No hay ningun restaurante agregado";
        }
    }

}
