package CursoJava.secao06_EstruturasRepetitivas.lacosDeRepeticao;

//O "For" é uma estrutura de controle que repete um bloco de comandos
//para um certo intervalo de valores.
//Normalmente é utilizado quando se sabe a quantidade de repetições ou
//o intervalo de valores.
//Abaixo você verá um programa que lê um valor inteiro N e depois N números inteiros.
//Ao final, mostra a soma dos N números lidos.

import java.util.Scanner;

public class A2_For {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int soma = 0;

        for (int i = 0; i < N; i++) {
            int x = input.nextInt();
            soma = soma + x;
        }
        System.out.println(soma);

        input.close();

    }

}
