package InitTools;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Starter {
    public static void startApp(){
        List<Object> numNameList = Arrays.asList("Garden", 4, 5, "House", 44, "Hospital", "Computer");
        List<Object> sortedFirstChar = numNameList.stream().sorted((o1,o2) -> o1.toString().charAt(0) - o2.toString().charAt(0)).collect(Collectors.toList());
        System.out.println(sortedFirstChar);

        List<Object> sortedEfirst = numNameList.stream().sorted((o1,o2) -> o1.toString().contains("e")?-1:1).collect(Collectors.toList());
        System.out.println(sortedEfirst);

        List<Object> changeAforFour = numNameList.stream().map(o1 -> o1.toString().replace('a','4')).collect(Collectors.toList());
        System.out.println(changeAforFour);

        List<Object> onlyNum = numNameList.stream().filter(o -> o.toString().chars().allMatch(Character::isDigit)).collect(Collectors.toList());
        System.out.println(onlyNum);
    }

}
