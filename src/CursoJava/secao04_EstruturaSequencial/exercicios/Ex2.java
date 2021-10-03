package CursoJava.secao04_EstruturaSequencial.exercicios;

//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor
//da área deste círculo com quatro casas decimais.

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double pi = 3.14159;
        double raio = input.nextDouble(); //insira aqui o valor do raio
        double area = pi * (Math.pow(raio,2));

        System.out.printf("A = %.4f",area);

        input.close();

    }
}
