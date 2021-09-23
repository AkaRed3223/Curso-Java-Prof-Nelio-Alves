package CursoJava.secao6_EstruturasRepetitivas.exercicios;

//Calcular o fatorial de N

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= N; i++) {
            fatorial = fatorial * i;
        }

        System.out.println(fatorial);

        input.close();
    }
}
