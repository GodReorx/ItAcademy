package org.example.clases;

import java.util.List;

public class Meses {
    public static void addMonths(List<String> mesesLista){
        String[] listaMeses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        for (String mes : listaMeses) {
            mesesLista.add(mes);
        }
    }
}
