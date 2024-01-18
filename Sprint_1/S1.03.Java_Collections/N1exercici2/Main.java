import Clases.Tools;

import javax.tools.Tool;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaNum = new ArrayList<Integer>();
        List<Integer> listaNum2 = new ArrayList<Integer>();

        Tools.addNumToList(listaNum);
        listaNum2.addAll(listaNum);
        Tools.addReverseList(listaNum2);

        Iterator<Integer> listaNumIT = listaNum.listIterator();
        System.out.println("Lista en orden de menor a mayor");
        while (listaNumIT.hasNext()){
            System.out.println(listaNumIT.next());
        }

        Iterator<Integer> listaNumIT2 = listaNum2.iterator();
        System.out.println("\n\nLista en orden de mayor a menor");
        while (listaNumIT2.hasNext()){
            System.out.println(listaNumIT2.next());
        }
    }
}