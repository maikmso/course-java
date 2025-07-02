package atvCursoJavaFeitos.application;

import atvCursoJavaFeitos.entities.CurrencyConverter;

import java.util.Scanner;
import java.util.Locale;

public class DolarProgram {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("What is the dollar price? ");
        double dollarQuote = sc.nextDouble();

        System.out.printf("How many dollars will be bought? ");
        double dollarsToBuy = sc.nextDouble();

        double result = CurrencyConverter.convert(dollarQuote, dollarsToBuy);
        System.out.printf("Amount to be paid in reais = %.2f%n", result);

        sc.close();
    }
}
