package initialTools;

import ListTools.searchTool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Starter {
    public static void startApp(){
        String[] names = {"James","Orion","Elisabeth","Hades","Mary","Onix"};
        List<String> stringList = new ArrayList<>(Arrays.asList(names));
        List<String> stringListO = new ArrayList<>(searchTool.searchOinString(stringList));
        System.out.println("Name list with o or O:");
        for (String name : stringListO) {
            System.out.println(name);
        }

        List<String> stringListOmore5Letters = new ArrayList<>((searchTool.searchOmoreFiveLong(stringList)));
        System.out.println("Name list with o or O and more than 5 letters:");
        for (String name : stringListOmore5Letters) {
            System.out.println(name);
        }
    }
}
