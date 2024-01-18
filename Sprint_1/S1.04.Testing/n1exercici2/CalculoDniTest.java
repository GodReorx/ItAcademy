import org.example.CalculoDni;
import org.junit.jupiter.api.*;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculoDniTest {
    @BeforeAll
    static void init(){
        System.out.println("Iniciando el test...");
    }
    @AfterAll
    static void finish(){
        System.out.println("Test finalizado.");
    }

    @DisplayName("Test de numeros y letra DNI")
    @Test
    void testLetra(){
        final Map<Integer,Character> DNITEST = Map.ofEntries(
                Map.entry(11111111, 'H'),
                Map.entry(22222222, 'J'),
                Map.entry(33333333, 'P'),
                Map.entry(44444444, 'A'),
                Map.entry(55555555, 'K'),
                Map.entry(66666666, 'Q'),
                Map.entry(77777777, 'B'),
                Map.entry(88888888, 'Y'),
                Map.entry(99999999, 'R'),
                Map.entry(00000000, 'T')
        );
        for (Integer num : DNITEST.keySet()){
            assertEquals(DNITEST.get(num), CalculoDni.addLetter(num));
        }
    }
}
