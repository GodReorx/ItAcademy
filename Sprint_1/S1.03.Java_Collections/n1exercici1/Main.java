import Clases.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<Month> months = new ArrayList<Month>();

        months.add(new Month("Enero"));
        months.add(new Month("Febrero"));
        months.add(new Month("Marzo"));
        months.add(new Month("Abril"));
        months.add(new Month("Mayo"));
        months.add(new Month("Junio"));
        months.add(new Month("Julio"));
        months.add(new Month("Septiembre"));
        months.add(new Month("Octubre"));
        months.add(new Month("Noviembre"));
        months.add(new Month("Diciembre"));

        months.add(7, new Month("Agosto"));

        System.out.println("Listado de meses con ArrayList");
        for(Month month : months) {
            System.out.println(month.getName());
        }

        Set<Month> monthhsh = new LinkedHashSet<Month>(); //Usamos linked para mantener el orden
        monthhsh.addAll(months);

        monthhsh.add(new Month("Enero"));
        monthhsh.add(new Month("Diciembre"));

        System.out.println("\nListado meses HashSet sin duplicados");
        for(Month month : monthhsh) {
            System.out.println(month.getName());
        }

        System.out.println("\nListado meses con Iterator");
        Iterator<Month> monthhshIt = monthhsh.iterator();

        while(monthhshIt.hasNext()) {
            System.out.println(monthhshIt.next().getName());
        }

    }
}