package CursoJava.secao05_EstruturaCondicional.exercicios;

//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        if (num < 0){
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NÃO NEGATIVO");
        }
        input.close();

    }
}
