package Clases;

import java.util.*;

public class Tools {
    public static List<Integer> addNumToList (List<Integer> listaNum){
        for (int i = 0; i <= 10; i++) {
            listaNum.add(i);
        }
        return listaNum;
    }
    public static List<Integer> addReverseList (List<Integer> listaNumO){
        Collections.reverse(listaNumO);
        return listaNumO;
    }

    public static List<Integer> addReverseListB (List<Integer> listaNumO){
        List<Integer> listaCopia = new ArrayList<Integer>();
        ListIterator<Integer> listNumOIT = listaNumO.listIterator(listaNumO.size());
        while(listNumOIT.hasPrevious()){
            listaCopia.add(listNumOIT.previous());
        }
        return listaCopia;
    }
}
