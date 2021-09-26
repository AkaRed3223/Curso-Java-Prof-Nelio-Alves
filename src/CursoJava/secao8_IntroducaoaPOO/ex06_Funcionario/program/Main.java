package CursoJava.secao8_IntroducaoaPOO.ex06_Funcionario.program;

import CursoJava.secao8_IntroducaoaPOO.ex06_Funcionario.entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.print("Nome: ");
        funcionario.nome = input.nextLine();
        System.out.print("Salário bruto: ");
        funcionario.salBruto = input.nextDouble();
        System.out.print("Imposto: ");
        funcionario.imposto = input.nextDouble();

        System.out.println();
        System.out.println("Funcionário: " + funcionario);
        System.out.println();
        System.out.print("Em quantos % você quer aumentar o salário? ");

        double porcentagem = input.nextDouble();
        funcionario.aumentarSalario(porcentagem);

        System.out.println();
        System.out.println("Atualização: " + funcionario);

        input.close();

    }
}
