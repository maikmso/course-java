package atvCursoJavaFeitos.entities;

public class CurrencyConverter {

    public static final double IOF = 0.06; // 6% de IOF

    public static double convert(double dollarQuote, double dollarsToBuy) {
        double totalDollarsWithIOF = dollarsToBuy + (dollarsToBuy * IOF);
        return totalDollarsWithIOF * dollarQuote;
    }
}
