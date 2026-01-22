package es.fplumara.dam1.tiempo;

import es.fplumara.dam1.tiempo.RopaService;
import es.fplumara.dam1.tiempo.TiempoService;
import es.fplumara.dam1.tiempo.TiempoValor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

public class RopaServiceTest {


    @ExtendWith(MockitoExtension.class)


        private RopaService ropaService;

        @Mock
        private TiempoService tiempoService;

        @BeforeEach
        public void setUp() {
            ropaService = new RopaService(tiempoService);
        }

        @Test
        public void ropaAdecuadaCuandoHaceCalor() {
            given(tiempoService.hoy()).willReturn(TiempoValor.CALOR);
            String ropa = ropaService.queRopaMePongo();
            assertEquals("shorts", ropa);
        }

        @Test
        public void ropaAdecuadaCuandoHaceFrio() {
            given(tiempoService.hoy()).willReturn(TiempoValor.FRIO);
            String ropa = ropaService.queRopaMePongo();
            assertEquals("abrigo", ropa);
        }

        @Test
        public void ropaAdecuadaCuandoServicioTiempoFalla() {
            given(tiempoService.hoy()).willThrow(new RuntimeException());
            String ropa = ropaService.queRopaMePongo();
            assertEquals("chándal", ropa);
        }

    }

