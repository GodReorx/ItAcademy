package ListTools;

import java.util.List;

public class MonthTools {
    public static void printMonthLambda(List<String> months){
        months.forEach(month -> System.out.println(month));
    }

    public static void printMonthLambdaReference(List<String> months){
        months.forEach(System.out::println);
    }
}
