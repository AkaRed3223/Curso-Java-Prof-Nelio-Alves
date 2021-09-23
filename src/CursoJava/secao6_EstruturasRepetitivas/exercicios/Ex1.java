package CursoJava.secao6_EstruturasRepetitivas.exercicios;

//Escreva um progama que repita a leitura de uma senha até que ela seja válida.
//Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida".
//Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e
//o algoritmo encerrado. Considere que a senha correta é o valor 2022.

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int senha = input.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Invalida");
            senha = input.nextInt();
        }

        System.out.println("Acesso Permitido");

        input.close();
    }
}
