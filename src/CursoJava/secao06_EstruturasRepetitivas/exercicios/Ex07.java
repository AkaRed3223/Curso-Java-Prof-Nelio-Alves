package CursoJava.secao06_EstruturasRepetitivas.exercicios;

//Fazer um programa para ler um número N.
//Depois leia N pares de números e mostre a divisão do primeiro pelo segundo.
//Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for (int i = 0; i < N; i++) {
            int x = input.nextInt();
            int y = input.nextInt();

            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                double divisao = (double) x / y;
                System.out.printf("%.1f%n", divisao);
            }
        }

        input.close();

    }
}
