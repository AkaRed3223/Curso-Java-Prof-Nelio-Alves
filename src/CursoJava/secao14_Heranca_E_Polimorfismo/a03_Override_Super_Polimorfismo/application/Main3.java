package CursoJava.secao14_Heranca_E_Polimorfismo.a03_Override_Super_Polimorfismo.application;

import CursoJava.secao14_Heranca_E_Polimorfismo.a03_Override_Super_Polimorfismo.entities.Account;
import CursoJava.secao14_Heranca_E_Polimorfismo.a03_Override_Super_Polimorfismo.entities.BusinessAccount;
import CursoJava.secao14_Heranca_E_Polimorfismo.a03_Override_Super_Polimorfismo.entities.SavingsAccount;

public class Main3 {
    public static void main(String[] args) {

        Account acc1 = new Account(1001,"Alex",1000.0);
        acc1.withdraw(200.0);
        System.out.println("Saldo da conta1: " + acc1.getBalance());
        //perceba os 5.00 de desconto

        Account acc2 = new SavingsAccount(1002,"Bruno",1000.0,0.05);
        acc2.withdraw(200.0);
        System.out.println("Saldo da conta2: " + acc2.getBalance());
        //aqui não há desconto, pois o método withdraw foi reimplementado com sobreposição Override

        Account acc3 = new BusinessAccount(1003,"Cesar",1000.0,500.0);
        acc3.withdraw(200.0);
        System.out.println("Saldo da conta3: " + acc3.getBalance());
        //aqui o desconto é maior pois foi implementado o withdraw usando o Super com adicional de 2.0

        //Percebe como que temos 3 variáveis do mesmo tipo mas sendo instanciadas com diferentes formatos???
        //A essa flexibilidade de formatos dá-se o nome de Polimorfismo
        //Polimorfismo é simples em seu conceito mas que abre a possibilidade
        //de infinita complexidade em suas implementações.

    }
}
