package CursoJava.secao06_EstruturasRepetitivas.exercicios;

//Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir.
//Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
//Apresente a média ponderada para cada um destes conjuntos de 3 valores,
//sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3
//e o terceiro valor tem peso 5.

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for (int i = 0; i < N; i++) {
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            double media = ((2 * a) + (3 * b) + (5 * c)) / 10;
            System.out.printf("%.1f%n", media);
        }
        input.close();
    }
}
