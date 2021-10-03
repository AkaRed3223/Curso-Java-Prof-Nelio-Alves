package CursoJava.secao06_EstruturasRepetitivas.lacosDeRepeticao;

    //O Do/While é uma estrutura de repetição cuja testagem de condições
    //é colocada ao final do bloco de comandos. Por exemplo:

    /* do {
        comando 1;
        comando 2;
    } while ( condição ); */

    //De forma que se a condição for verdadeira, retorna ao começo e executa novamente.
    //Se a condição for falsa, seguem frente sem retornar ao laço.
    //Veja o exemplo abaixo, um programa que converte de Celsius para Fahrenheit:

import java.util.Locale;
import java.util.Scanner;

public class A3_DoWhile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        char resposta;

        do {

            System.out.print("Digite a temperatura em Celsius: ");
            double C = input.nextDouble();

            double F = ((9.0 * C) / 5.0) + 32.0;

            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.print("Deseja repetir (s/n)? ");
            resposta = input.next().charAt(0);

        } while (resposta == 's');




    }




}
