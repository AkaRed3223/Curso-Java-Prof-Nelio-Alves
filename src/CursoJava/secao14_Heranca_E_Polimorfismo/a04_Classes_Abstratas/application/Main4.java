package CursoJava.secao14_Heranca_E_Polimorfismo.a04_Classes_Abstratas.application;


import CursoJava.secao14_Heranca_E_Polimorfismo.a04_Classes_Abstratas.entities.Account;
import CursoJava.secao14_Heranca_E_Polimorfismo.a04_Classes_Abstratas.entities.BusinessAccount;
import CursoJava.secao14_Heranca_E_Polimorfismo.a04_Classes_Abstratas.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Account> accountList = new ArrayList<>();

        //Account acc1 = new Account(1001, "Cesar", 3000.0);
        //Passo 2:
        //Perceba que a tentativa de instanciação da linha 17 não foi possível,
        //uma vez que a classe Account foi definida como Abstrata.

        accountList.add(new BusinessAccount(1002, "Mi", 2500.0, 5000.0));
        accountList.add(new SavingsAccount(1003, "Raja", 500.0, 0.02));
        accountList.add(new BusinessAccount(1004, "Melinha", 400.0, 500.0));
        accountList.add(new SavingsAccount(1005, "Rashido", 240.0, 0.01));

        //Passo 3:
        //Perceba que com apenas uma operação de depósito, vamos conseguir afetar contas de diferentes classes.
        //Isso serve para mostrar a vantagem de ter uma classe abstrata.

        for (Account acc : accountList) {
            System.out.printf("Saldo anterior da conta %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }

        for (Account acc : accountList) {
            acc.deposit(99.0);
        }

        System.out.println();

        for (Account acc : accountList) {
            System.out.printf("Saldo final da conta %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }

        System.out.println();

        //Passo 4:
        //Vamos somar os valores de todas as contas

        double sum = 0.0;
        for (Account acc : accountList) {
            sum += acc.getBalance();
        }
        System.out.printf("Saldo de todas as contas: %.2f",sum);
    }
}
