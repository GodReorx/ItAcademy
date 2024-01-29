package InitTools;

import SortListMethod.*;

public class Starter {
    public static void startApp(){

        Reverser reverserStr = str -> new StringBuilder(str).reverse().toString();

        String str = "Hola";
        String reverseStr = reverserStr.reverseMethod(str);
        System.out.println("Reversed : " + reverseStr);
    }
}
