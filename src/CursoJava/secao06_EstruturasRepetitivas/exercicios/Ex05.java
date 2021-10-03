package CursoJava.secao06_EstruturasRepetitivas.exercicios;

//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos
//em seguida. Mostre quantos destes valores X estão dentro do intervalo [10,20] e
//quantos estão fora do intervalo.
//(use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 0; i < N; i++) {
            int X = input.nextInt();
            if (X >= 10 && X <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        input.close();
    }
}
