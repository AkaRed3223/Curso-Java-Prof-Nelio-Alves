package CursoJava.secao9_construtores_this_sobrecarga_encapsulamento.ex04_desafio.program;

import CursoJava.secao9_construtores_this_sobrecarga_encapsulamento.ex04_desafio.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Account account;

        System.out.print("Enter account number: ");
        String number = input.nextLine();
        System.out.print("Enter account holder: ");
        String holder = input.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = input.next().charAt(0);

        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = input.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } else {
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        account.deposit(input.nextDouble());

        System.out.println();
        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        account.withdraw(input.nextDouble());

        System.out.println();
        System.out.println("Updated account data:");
        System.out.println(account);

        input.close();

    }

}