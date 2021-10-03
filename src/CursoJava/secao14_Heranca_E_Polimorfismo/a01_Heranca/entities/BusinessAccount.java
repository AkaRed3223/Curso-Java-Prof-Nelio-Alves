package CursoJava.secao14_Heranca_E_Polimorfismo.a01_Heranca.entities;

public class BusinessAccount extends Account {

    //Com o comando extends, a classe BusinessAccount tem, automaticamente,
    //todos os métodos da classe Account.
    //(teste a implementação na classe Main pra ver o.o)

    private Double loanLimit;

    public BusinessAccount() {
        super(); //construtor vazio com acesso à Superclasse
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
        //construtor com o único parâmetro da classe + parâmetros da Superclasse
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10.0;
            //passo 1: caso balance não estivesse como protected, aqui haveria um erro. Veja:
            //public = acessível por qualquer classe
            //private = acessível apenas na própria classe
            //protected = acessível em outras classes no mesmo pacote
        }
    }
}
