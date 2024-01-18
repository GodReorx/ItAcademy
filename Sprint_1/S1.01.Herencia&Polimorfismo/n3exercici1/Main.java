import Clases.*;

import javax.tools.Tool;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int opcion = -1;
        String mensaje = "";
        ArrayList<Redactores> redactores = new ArrayList<Redactores>();
        do {
            opcion = Tools.menu();
            switch (opcion) {
                case 0:
                    mensaje = "Saliendo del programa";
                    break;
                case 1:
                    mensaje = Tools.addRedactor(redactores);
                    break;
                case 2:
                    mensaje = Tools.delRedactor(redactores);
                    break;
                case 3:
                    mensaje = Tools.addNewsToRedactor(redactores);
                default:
                    mensaje = "Has escogido " + opcion;
            }
            System.out.printf(mensaje);
        }while(opcion!=0);
        for (Redactores redactor : redactores){
            System.out.printf(redactor.getNombre());
        }
    }
}