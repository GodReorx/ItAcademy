import org.example.CalculoDni;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

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
    @ParameterizedTest
    @CsvSource({"11111111, 'H'","22222222, 'J'","33333333, 'P'","44444444, 'A'","55555555, 'K'","66666666, 'Q'","77777777, 'B'","88888888, 'Y'","99999999, 'R'","00000000, 'T'"})
    void testLetra(Integer numDni, char letter){
        for (int i = 0; i < 10; i++){
            assertEquals(letter, CalculoDni.addLetter(numDni));
        }
    }
}
