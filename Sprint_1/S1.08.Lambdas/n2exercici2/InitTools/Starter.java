package InitTools;

import ListMethods.ListTools;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Starter {
    public static void startApp(){
        List<Integer> numList = Arrays.asList(3,55,44);
        System.out.println(ListTools.intListToStringWithComas(numList));
    }
}
