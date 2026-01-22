package es.fplumara.dam1.tiempo;

public class RopaService {


    TiempoService tiempoService;

    public RopaService(TiempoService tiempoService) {
        this.tiempoService = tiempoService;
    }

    public String queRopaMePongo(){
        try {
            TiempoValor tiempo = tiempoService.hoy();
            if (tiempo == TiempoValor.CALOR) {
                return "shorts";
            } else {
                return "abrigo";
            }
        }catch (RuntimeException ex){
            return "chándal";
        }

    }
}

