package InitTools;

import SearchTools.SearchClass;

import java.util.Arrays;
import java.util.List;

public class StartApp {
    public static void starter(){
        List<String> nameList = Arrays.asList("Ana","Mike","Edward","Anthony","Ash","ari","Anna");
        List<String> nameListAThree = SearchClass.nameAThreeLetters(nameList);

        System.out.println(nameListAThree);
    }
}
