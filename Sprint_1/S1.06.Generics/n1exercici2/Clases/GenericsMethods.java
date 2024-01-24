package Clases;

public abstract class GenericsMethods<T, U, V> {
    public static <T,U,V> void printGenerics (T t,U u ,V v){
        System.out.println(t);
        System.out.println(u);
        System.out.println(v);
    }
}
