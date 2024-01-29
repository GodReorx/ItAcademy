package ListMethods;

import java.util.List;
import java.util.stream.Collectors;

public class ListTools {
    public static String intListToStringWithComas (List<Integer> integerList){
        return integerList.stream().map(element -> {
            if (element % 2 == 0){
                return "e" + element;
            }else{
                return "o" + element;
            }
        }).collect(Collectors.joining(","));
    }
}
