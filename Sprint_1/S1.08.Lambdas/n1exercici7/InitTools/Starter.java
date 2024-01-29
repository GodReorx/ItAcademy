package InitTools;

import java.util.ArrayList;
import java.util.List;

public class Starter {
    public static void startApp(){
        List<String> listToSort = new ArrayList<>();
        listToSort.add("Era se que se era.");
        listToSort.add("Supercalifragilisticoespialidoso");
        listToSort.add("Frase corta");
        listToSort.add("Una");


        listToSort.sort((String a, String b) -> a.length()-b.length());
        System.out.println("Sorted list little --> big");
        System.out.println(listToSort);

        listToSort.sort((String a, String b) -> b.length()-a.length());
        System.out.println("Sorted list big --> littler");
        System.out.println(listToSort);
    }
}