package Tools;

import Device.Smartphone;

public class Starter {
    public static void startApp(){
        Smartphone smartphone = new Smartphone();

        GenericClass.telephonMethod(smartphone);

        GenericClass.smartphoneMethod(smartphone);

    }
}
