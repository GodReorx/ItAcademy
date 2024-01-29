package SearchTools;

import java.util.List;
import java.util.stream.Collectors;

public class SearchClass {
    public static List<String> nameAThreeLetters(List<String> nameList){
        return nameList.stream().filter(s -> s.indexOf("A") == 0 && s.length() == 3).collect(Collectors.toList());
    }
}
