package Tools;

import Device.*;

public abstract class GenericClass<T>{
    public static <T extends Telephon> void telephonMethod (T t){
        t.callUp();
        //t.doPhoto(); No se puede llamar a un metodo del hijo, se tendria que crear en el padre.
    }

    public static <T extends Smartphone> void smartphoneMethod(T t){
        t.callUp();
        t.doPhoto();
    }
}
