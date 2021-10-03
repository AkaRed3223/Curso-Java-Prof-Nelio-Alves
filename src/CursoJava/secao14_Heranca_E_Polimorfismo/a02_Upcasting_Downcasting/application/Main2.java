package CursoJava.secao14_Heranca_E_Polimorfismo.a02_Upcasting_Downcasting.application;

import CursoJava.secao14_Heranca_E_Polimorfismo.a02_Upcasting_Downcasting.entities.Account;
import CursoJava.secao14_Heranca_E_Polimorfismo.a02_Upcasting_Downcasting.entities.BusinessAccount;
import CursoJava.secao14_Heranca_E_Polimorfismo.a02_Upcasting_Downcasting.entities.SavingsAccount;

public class Main2 {

    public static void main(String[] args) {

        Account acc = new Account(1001,"Alex",0.0);
        //Classe account instanciada normalmente com parâmetros.

        BusinessAccount bacc = new BusinessAccount(1002,"Maria",0.0,500.0);
        //Objeto da classe BusinessAccount instanciado com parâmetros próprios e da superclasse.

        //////////// UPCASTING ////////////

        Account acc1 = bacc;
        //Como BusinessAccount é subclasse de Account, entende-se que
        //toda BusinessAccount também é uma Account. Por isso que um objeto da classe Account
        //pode, sem problemas, receber os dados de suas subclasses.

        Account acc2 = new BusinessAccount(1003,"Bob",0.0,200.0);
        //Aqui, temos um objeto da superclasse sendo instanciado com os parâmetros da subclasse.

        Account acc3 = new SavingsAccount(1004,"Anna",0.0,0.01);
        //Agora um objeto da superclasse sendo instanciado com outra subclasse

        //////////// DOWNCASTING ////////////

        //BusinessAccount bacc1 = acc1;
        //A operação acima não é permitida, pois agora temos um objeto do tipo da subclasse
        //recebendo dados da superclasse. Para isso precisamos fazer o downcasting. Fica assim:
        BusinessAccount acc4 = (BusinessAccount) acc2; //"conversão" manual
        acc4.loan(100.0); //função permitida agora

        //BusinessAccount acc5 = (BusinessAccount) acc3;
        //Acima, perceba que temos um objeto da BusinessAccount recebendo os dados da SavingsAccount
        //De modo que é um tipo de LateralCasting, que NÃO É PERMITIDO!
        //Mas o erro apenas será dado ao executar o programa. Tenta aí!
        //Para resolver isso, utilizamos a função 'instanceof'

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        } //O sistema testará se a conversão é possível antes de fazê-la

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}
