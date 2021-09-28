package CursoJava.secao9_construtores_this_sobrecarga_encapsulamento.ex04_desafio.entities;

public class Account {

    private String number;
    private String holder;
    private double balance;

    public Account(String number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public Account(String number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public String getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amountDeposit) {
        balance += amountDeposit;
    }

    public void withdraw(double amountWithdraw) {
        balance -= amountWithdraw + 5;
    }

    public String toString() {
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f",balance);
    }

}