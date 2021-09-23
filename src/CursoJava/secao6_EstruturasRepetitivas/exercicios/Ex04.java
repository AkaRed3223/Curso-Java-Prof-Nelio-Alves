package CursoJava.secao6_EstruturasRepetitivas.exercicios;

//Leia um valor inteiro X (1 <= X <= 1000).
//Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int X = input.nextInt();

        for (int i = 1; i <= X; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        input.close();
    }
}
