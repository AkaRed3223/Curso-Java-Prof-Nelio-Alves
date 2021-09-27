package CursoJava.secao8_IntroducaoaPOO.ex09_Dolar.util;

public class CurrencyConverter {

    public static double conversion(double dollarPrice, double quantity) {
        return dollarPrice * quantity * 1.06; //6% de IOF
    }

}
