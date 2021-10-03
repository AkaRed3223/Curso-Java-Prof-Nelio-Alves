package CursoJava.secao06_EstruturasRepetitivas.exercicios;

//Ler um número inteiro N e calcular todos os seus divisores.

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.println(i);
            }
        }

        input.close();

    }
}
