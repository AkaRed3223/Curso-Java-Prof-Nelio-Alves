package CursoJava.secao4_EstruturaSequencial.exercicios;

//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa.

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt(); //insira o valor de a
        int b = input.nextInt(); //insira o valor de b
        int soma = a + b;

        System.out.println("SOMA = " + soma);

        input.close();

    }
}
