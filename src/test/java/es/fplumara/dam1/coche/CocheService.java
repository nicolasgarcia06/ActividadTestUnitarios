package es.fplumara.dam1.coche;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CocheService {
    private CocheService cocheService;


    @ParameterizedTest
    @ValueSource(String = {"1234ABC", "0000ZZZ", "9876QWE"})
    void validarMatricula(String value) {
        assertTrue(value >= 0);
    }
}
