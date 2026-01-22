package es.fplumara.dam1.facturacion;

public class FacturaService {

    private final Calculadora calc;

    public FacturaService(Calculadora calc) {
        this.calc = calc;
    }

    public static int totalConIva(int base) {
        return Calculadora.sumar(base, 21);
    }
}
