package Tools;

import java.util.Scanner;

public class Starter {

    private static Scanner sc = new Scanner(System.in);
    private static UndoClass orderList = UndoClass.getInstance();
    private static UndoClass orderList2 = UndoClass.getInstance(); //Para comprobar que ambos llaman al mismo objeto

    public static void startApp(){
        String opcS = "";
        int opcI = -1;
        do {
            System.out.println("Select an option:\n" +
                    "1. Add order to list\n" +
                    "2. Delete order from list\n" +
                    "3. Show list of orders\n\n" +
                    "0. Exit");
            opcS = sc.nextLine();
            try {
                opcI = Integer.parseInt(opcS);
                menu(opcI);
            } catch (NumberFormatException e) {
                System.out.println("Wrong input! Input only integer number please: " + e.getMessage());
            }
        } while (opcI != 0);
    }

    private static void menu(int opc){
        String order = "";
        switch (opc){
            case 0 :
                System.out.println("Goodbye! Program close...");
                break;
            case 1 :
                System.out.println("Write the order:");
                order = sc.nextLine();
                orderList2.addOrder(order);
                break;
            case 2 :
                orderList.listOrder();
                System.out.println("Choose a number order to delete:");
                order = sc.nextLine();
                try {
                    int numDel = Integer.parseInt(order);
                    orderList.delOrder(numDel-1);
                }catch (NumberFormatException e){
                    System.out.println("Wrong input! Input only integer number please: " + e.getMessage());
                }
                break;
            case 3 :
                orderList.listOrder();
                break;
            default:
                System.out.println("Incorrect option! Doesn't exist " + opc);
        }
    }

}
