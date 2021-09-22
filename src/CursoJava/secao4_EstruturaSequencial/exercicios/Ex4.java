package CursoJava.secao4_EstruturaSequencial.exercicios;

//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas,
//o valor que recebe por hora e calcula o salário desse funcionário.
//A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        double quantHora = input.nextDouble();
        double valorHora = input.nextDouble();
        double salario = quantHora * valorHora;

        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f", salario);

        input.close();

    }
}
