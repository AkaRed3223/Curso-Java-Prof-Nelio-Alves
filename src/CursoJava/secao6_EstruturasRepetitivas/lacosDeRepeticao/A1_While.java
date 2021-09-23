package CursoJava.secao6_EstruturasRepetitivas.lacosDeRepeticao;

//A estrutura "While" é uma estrutura de controle, um loop que repete um bloco de comandos
//ENQUANTO UMA CONDIÇÃO FOR VERDADEIRA.
//É uma estrutura que deve ser utilizada quando não se sabe a quantidade de repetições a serem realizadas.
//No exemplo abaixo, fiz um programa que lê números inteiros até que um zero seja lido e,
//no final, mostra a soma dos números recebidos.

import java.util.Scanner;

public class A1_While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int soma = 0;

        while (a != 0) {
            soma += a;
            a = input.nextInt();
        }

        System.out.println(soma);

    }
}
