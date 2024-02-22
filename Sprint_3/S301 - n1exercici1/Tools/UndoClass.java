package Tools;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class UndoClass {
    private static UndoClass instancia;
    private static Deque<String> undoList;
    private UndoClass(){
        undoList = new LinkedList<>();
    }

    public static UndoClass getInstance(){
        if(instancia == null){
            instancia = new UndoClass();
        }
        return instancia;
    }

    public void listOrder(){
        int pos = 1;
        for (String order : undoList) {
            System.out.println(pos + ". " + order);
            pos++;
        }
    }

    public void addOrder(String command){
        undoList.addFirst(command);
        System.out.println("Order add!");
    }

    public void delOrder(int position){
        undoList.remove(position);
        System.out.println("Order eliminated!");
    }
}
