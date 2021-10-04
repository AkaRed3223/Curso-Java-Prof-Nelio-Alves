package CursoJava.secao14_Heranca_E_Polimorfismo.a04_Classes_Abstratas.entities;

public abstract class Account {
    //Passo 1: A classe quando definida como abstrata não pode ser instanciada.
    //A ideia é criar uma superclasse genérica com atributos padrão para facilitar o reuso e instigar polimorfismo.

    private Integer number;
    private String holder;
    protected Double balance;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

}
