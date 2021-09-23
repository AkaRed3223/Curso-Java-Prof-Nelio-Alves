package CursoJava.secao6_EstruturasRepetitivas.exercicios;

//Fazer um programa para ler um número inteiro positivo N. O programa deve então
//mostrar na tela N linhas, começando de 1 até N. Para cada linha, mostrar
//o número da linha, depois o quadrado e o cubo do valor.

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {

            double a = Math.pow(i, 2);
            double b = Math.pow(i, 3);

            System.out.printf("%d %.0f %.0f%n", i, a, b);

        }

        input.close();

    }
}
