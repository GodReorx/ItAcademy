package org.example.clases;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MesesTest {
    private static List<String> mesesLista = new ArrayList<String>();
    @BeforeAll
    static void init(){
        System.out.println("Iniciando el test");
    }
    @AfterAll
    static void finish(){
        System.out.println("Test finalizado");
    }

    @DisplayName("Prueba del tamaño de la lista")
    @Test
    void testSize(){
        Meses.addMonths(mesesLista);
        assertEquals(12, mesesLista.size());
    }

    @DisplayName("Prueba not null o no vacia")
    @Test
    void testNotNull(){
        assertEquals(false, mesesLista.isEmpty());
    }

    @DisplayName("Prueba posicion 8 es Agosto")
    @Test
    void testPosEight(){
        String mes = mesesLista.get(7);
        assertEquals("Agosto", mes);
    }
}