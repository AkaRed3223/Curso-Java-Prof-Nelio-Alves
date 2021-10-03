package CursoJava.secao05_EstruturaCondicional.condicionais;

//O If-Else Ternário é uma estrutura opcional ao If-Else quando apenas se deseja atribuir um valor
//com base em uma condição V ou F

import java.util.Scanner;

public class If_Ternario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double preco = input.nextDouble();
        double desconto = (preco >= 20.0) ? preco * 0.1 : preco * 0.05;
        //O preço é maior ou igual a 20? Se sim, o desconto é de 10%. Se não, o desconto é de apenas 5%.

        System.out.printf("Seu desconto é de R$ %.2f", desconto);

        input.close();

    }
}
