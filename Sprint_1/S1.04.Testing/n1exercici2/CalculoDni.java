package org.example;

import java.util.HashMap;
import java.util.Map;

public class CalculoDni {
    public static Map<Integer, Character> letraDni = Map.ofEntries(
            Map.entry(0,'T'),
            Map.entry(1,'R'),
            Map.entry(2,'W'),
            Map.entry(3,'A'),
            Map.entry(4,'G'),
            Map.entry(5,'M'),
            Map.entry(6,'Y'),
            Map.entry(7,'F'),
            Map.entry(8,'P'),
            Map.entry(9,'D'),
            Map.entry(10,'X'),
            Map.entry(11,'B'),
            Map.entry(12,'N'),
            Map.entry(13,'J'),
            Map.entry(14,'Z'),
            Map.entry(15,'S'),
            Map.entry(16,'Q'),
            Map.entry(17,'V'),
            Map.entry(18,'H'),
            Map.entry(19,'L'),
            Map.entry(20,'C'),
            Map.entry(21,'K'),
            Map.entry(22,'E')
    );

    public static char addLetter(Integer numDni){
        int resto = numDni % 23;
        char letra = letraDni.get(resto);
        return letra;
    }
}
