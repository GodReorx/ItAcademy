package initialTools;

import ListTools.MonthTools;

import java.util.Arrays;
import java.util.List;

public class Starter {
    public static void startApp(){
        List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        MonthTools.printMonthLambda(months);
    }
}
