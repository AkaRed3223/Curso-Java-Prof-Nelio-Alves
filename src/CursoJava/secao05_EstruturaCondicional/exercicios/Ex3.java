package CursoJava.secao05_EstruturaCondicional.exercicios;

//Leia dois valores inteiros A e B. Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou
//Nao sao Multiplos, indicando se os valores lidos são múltiplos entre si.
//Atenção: os números devem poder ser digitados em ordem crescente ou decrescente!

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();

        if (A % B == 0 || B % A == 0) { //condição "OU" para que funciona com crescente ou decrescente
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        input.close();

    }
}
