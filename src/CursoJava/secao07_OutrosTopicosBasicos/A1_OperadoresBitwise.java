package CursoJava.secao07_OutrosTopicosBasicos;

import java.util.Scanner;

public class A1_OperadoresBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //primeiramente, saiba que o Java aceita a atribuição de inteiros em binário:

        int a = 0b00001000; //0b indica que o número a ser declarado é binário
        int b = 0b000; //tanto a quanto b são iguais, mas b está sem os zeros à esquerda

        //Os operadores bitwise são:

        int n1 = 89; //em binário, 89 = 0101 1001
        int n2 = 60; // em binário, 60 = 0011 1100

        System.out.println(n1 & n2); //conector "e" bit a bit
        System.out.println(n1 | n2); //conector "ou" bit a bit
        System.out.println(n1 ^ n2); //conector "ou disjuntivo (XOR)" bit a bit

        //Veja que a resposta dessas 3 operações são números totalmente novos,
        //pois é feito o cálculo lógico entre esses números a nível binário

        //Uma aplicação interessante dos operadores bitwise é a checagem da presença
        //de um determinado bit em uma determinada posição de um número.
        //Isso pode ser feito mediante a criação de uma máscara de comparação:

        int mask = 0b00100000; // 32 é representado apenas por 1 bit na sexta posição
        int n = input.nextInt();

        if ((n & mask) != 0) {
            System.out.println("O sexto bit é 1");
        } else {
            System.out.println("O sexto bit é 0");
        }
        //A estrutura anterior verificará se o número fornecido tem 1 em sua sexta
        //posição binária.

        input.close();

    }
}
