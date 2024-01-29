package ListTools;

import java.util.List;
import java.util.stream.Collectors;

public class searchTool {
    public static List<String> searchOinString(List<String> stringList){
        List<String> stringListO = stringList.stream().filter(s -> s.indexOf('o') > -1 || s.indexOf('O') > -1).collect(Collectors.toList());
        return stringListO;
    }
}
