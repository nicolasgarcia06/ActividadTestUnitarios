package es.fplumara.dam1.facturacion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class FacturaServiceTest {
    @ExtendWith(MockitoExtension.class)
    private FacturaService facturaservice;
    @Mock
    private Calculadora calc;
    @BeforeEach
    public void setup(){
        facturaservice=new FacturaService(calc);
    }
    @Test
    public void totalConIva(){
        when(Calculadora.sumar(100,21)).thenReturn(121);
        int resultadoEsperado=FacturaService.totalConIva(100);
        assertEquals(resultadoEsperado,121);

    }
}
