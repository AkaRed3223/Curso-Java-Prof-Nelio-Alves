package CursoJava.secao8_IntroducaoaPOO.ex09_Dolar.program;

import CursoJava.secao8_IntroducaoaPOO.ex09_Dolar.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dol = input.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double amount = input.nextDouble();
        double result = CurrencyConverter.conversion(dol, amount);

        System.out.printf("Amount to be paid in reais: R$ %.2f", result);

        input.close();

    }
}
