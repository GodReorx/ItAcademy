import Clases.Menu;
import Clases.Restaurante;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Restaurante> restaurantes = new HashSet<Restaurante>();
        Menu.menuRest(restaurantes);
    }
}