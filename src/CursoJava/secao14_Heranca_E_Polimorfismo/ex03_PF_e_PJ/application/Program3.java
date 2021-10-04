package CursoJava.secao14_Heranca_E_Polimorfismo.ex03_PF_e_PJ.application;

import CursoJava.secao14_Heranca_E_Polimorfismo.ex03_PF_e_PJ.entities.Pessoa;
import CursoJava.secao14_Heranca_E_Polimorfismo.ex03_PF_e_PJ.entities.PessoaFisica;
import CursoJava.secao14_Heranca_E_Polimorfismo.ex03_PF_e_PJ.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.print("Digite a quantidade de contribuintes: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do contribuinte #" + i);
            System.out.print("Pessoa Física ou Jurídica (F/J)? ");
            char option = input.next().charAt(0);
            System.out.print("Nome: ");
            input.nextLine();
            String nomeContribuinte = input.nextLine();
            System.out.print("Renda anual: ");
            double rendaContribuinte = input.nextDouble();

            if (option == 'F') {
                System.out.print("Gastos com saúde: ");
                double gastosContribuinte = input.nextDouble();
                pessoas.add(new PessoaFisica(nomeContribuinte,rendaContribuinte,gastosContribuinte));

            } else if (option == 'J') {
                System.out.print("Número de funcionários: ");
                int numFuncContribuinte = input.nextInt();
                pessoas.add(new PessoaJuridica(nomeContribuinte,rendaContribuinte,numFuncContribuinte));
            }
        }

        System.out.println();
        System.out.println("IMPOSTOS DEVIDOS:");

        double total = 0.0;
        for (Pessoa p : pessoas) {
            System.out.printf(p.getNome() + ": $ %.2f%n", p.impostoDevido());
            total += p.impostoDevido();
        }

        System.out.println();
        System.out.printf("TOTAL DE IMPOSTOS RECEBIDOS: %.2f", total);

        input.close();
    }
}
