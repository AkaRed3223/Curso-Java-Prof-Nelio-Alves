package CursoJava.secao14_Heranca_E_Polimorfismo.a04_Classes_Abstratas.entities;

public final class SavingsAccount extends Account {

    private Double interestRate;

    public SavingsAccount() {
    }

    public SavingsAccount(Double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    @Override //informando ao compilador que esse método está sobrescrevendo outro da superclasse
    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) { //final indica que esse método não pode ser sobrescrito
        balance += amount;
    }

}
