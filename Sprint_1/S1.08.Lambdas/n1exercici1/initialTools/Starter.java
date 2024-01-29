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
        for (String name : stringListO) {
            System.out.println(name);
        }
    }
}
