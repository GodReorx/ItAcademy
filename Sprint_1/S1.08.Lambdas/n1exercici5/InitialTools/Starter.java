package InitialTools;
import Tools.InterFunctional;

public class Starter {
    public static void StartApp(){
        InterFunctional i = () -> 3.1415;
        System.out.println(i.getValuePI());
    }
}
