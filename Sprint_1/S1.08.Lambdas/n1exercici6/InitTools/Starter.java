package InitTools;

import java.util.ArrayList;
import java.util.List;

public class Starter {
    public static void startApp(){
        List<Object> listToSort = new ArrayList<>();
        listToSort.add("Era se que se era.");
        listToSort.add(123456789);
        listToSort.add("Supercalifragilisticoespialidoso");
        listToSort.add("Frase corta");
        listToSort.add("Una");
        listToSort.add(1);

        listToSort.sort((a, b) -> a.toString().length()-b.toString().length());
        System.out.println("Sorted list little --> big");
        System.out.println(listToSort);
    }
}
