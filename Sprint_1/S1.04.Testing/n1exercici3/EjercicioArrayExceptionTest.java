import org.example.*;

import org.junit.jupiter.api.*;


public class EjercicioArrayExceptionTest {
    @BeforeAll
    static void init(){
        System.out.println("Iniciando el test");
    }
    @AfterAll
    static void finish(){
        System.out.println("Test finalizado");
    }

    @DisplayName("Prueba enviando un array con tamaño correcto")
    @Test
    void arrayCorrecto(){
        Integer[] numbers = {1,2,3,4,5,6,7,8,9};
        EjercicioArrayException.recorreArray(numbers, numbers.length);
    }

    @DisplayName("Prueba enviando un array con tamaño incorrecto")
    @Test
    void arrayIncorrecto(){
        Integer[] numbers = {1,2,3,4,5,6,7,8,9};
        EjercicioArrayException.recorreArray(numbers, 10);
    }

}
