package CursoJava.secao5_EstruturaCondicional.exercicios;

//Crie um código que simula um menu com 5 opções. De acordo com o código do produto escolhido e
//a quantidade, retorne o total devido.

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int cod = input.nextInt();
        int quant = input.nextInt();
        double total;

        if (cod == 1) {
            total = quant * 4.0;
        } else if (cod == 2) {
            total = quant * 4.5;
        } else if (cod == 3) {
            total = quant * 5.0;
        } else if (cod == 4) {
            total = quant * 2.0;
        } else {
            total = quant * 1.5;
        }

        System.out.printf("Total: R$ %.2f",total);

        input.close();

    }
}
