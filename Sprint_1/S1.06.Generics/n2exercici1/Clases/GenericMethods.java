package Clases;

public abstract class GenericMethods<T,U> {
    public static <T,U> void  printGenerics (T t,U u, char letra){
        System.out.println(t);
        System.out.println(u);
        System.out.println(letra);
    }
}
