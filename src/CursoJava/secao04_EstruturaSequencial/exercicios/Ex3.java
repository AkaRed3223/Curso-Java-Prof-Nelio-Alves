package CursoJava.secao04_EstruturaSequencial.exercicios;

//Fazer um programa para ler quatro valores inteiros A, B, C e D.
//A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D.

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt(); //insira aqui o valor de A
        int B = input.nextInt(); //insira aqui o valor de B
        int C = input.nextInt(); //insira aqui o valor de C
        int D = input.nextInt(); //insira aqui o valor de D

        int DIFERENCA = (A * B - C * D);

        System.out.println("DIFERENCA = " + DIFERENCA);

        input.close();

    }

}
