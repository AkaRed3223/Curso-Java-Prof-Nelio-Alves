package CursoJava.secao04_EstruturaSequencial.exercicios;

//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1;
//o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
//Calcule e mostre o valor a ser pago.

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int cod1 = input.nextInt();
        int quant1 = input.nextInt();
        double valor1 = input.nextDouble();
        int cod2 = input.nextInt();
        int quant2 = input.nextInt();
        double valor2 = input.nextDouble();
        double total = (quant1 * valor1) + (quant2 * valor2);

        System.out.printf("VALOR A PAGAR: %.2f", total);

        input.close();

    }
}
