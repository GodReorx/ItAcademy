package InitTools;

import SortListMethod.*;

public class Starter {
    public static void startApp(){

        Reverser reverser = (str) -> new StringBuilder().reverse().toString();

        String str = "Hola";
        String reverseStr = reverser.reverseMethod(str);
        System.out.println("Reversed : " + reverseStr.length());
    }
}
