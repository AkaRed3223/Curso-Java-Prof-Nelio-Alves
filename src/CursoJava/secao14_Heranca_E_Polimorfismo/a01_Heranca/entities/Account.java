package CursoJava.secao14_Heranca_E_Polimorfismo.a01_Heranca.entities;

public class Account {

    //Classe normal com 3 parâmetros e 2 métodos de saque e depósito

    private Integer number;
    private String holder;
    protected Double balance; //ver passo 1 na classe BusinessAccount

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

    public void deposit(Double amount) {
        balance += amount;
    }

    public void withdraw(Double amount) {
        balance -= amount;
    }
}
